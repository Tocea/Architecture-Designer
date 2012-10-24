Architecture-Designer
=====================

Architecture designer is a set of tools for specifying a software architecture.


License
-------

Architecture Designer and all its components are distributed under the [Eclipse Public License][1], unless specified differently.


[1]:http://www.eclipse.org/legal/epl-v10.html


Installation
------------

Follow these steps:  
 * install Eclipse Juno
 * install Xtext plugins (v>2.3.1) and m2e (Maven integration for Eclipse) (v>1.2.0)
   * Help > install new software... > work with ... Juno > Select `Xtext SDK` and `m2e (Maven integration for Eclipse)`
 * import the following Architecture-Designer source projects as Maven projects in your eclipse (File > Import ... > maven > ...): 
   * `com.tocea.codewatch.architecture.dsl` 
   * `com.tocea.codewatch.architecture.dsl.ui`
   * (optional) `com.tocea.codewatch.architecture.dsl.master`
   * (optional) `com.tocea.codewatch.architecture.dsl.tests`
   * (optional) `com.tocea.codewatch.architecture.dsl.sdk`
   * (optional) `com.tocea.codewatch.architecture.dsl.updatesite`
 * import the following Architecture-Designer source projects as Eclipse plugins projects (File > Import ... > Existing projects): 
   * `com.tocea.codewatch.architecture.query.dsl`
   * `com.tocea.codewatch.architecture.query.dsl.ui`
   * (optional) `com.tocea.codewatch.architecture.generator.emf`
   * (optional) `com.tocea.codewatch.architecture.mm`
  
At this point, you should have your workspace ready to compile and export the Architecture-Designer plugins.  

 * In Eclipse, export the following projects as plugins (File > export > Deployable plug-ins and fragments)
   * `com.tocea.codewatch.architecture.dsl` 
   * `com.tocea.codewatch.architecture.dsl.ui` 
   * `com.tocea.codewatch.architecture.query.dsl`
   * `com.tocea.codewatch.architecture.query.dsl.ui`

Now, you need to launch eclipse with the Architecture designer plugins. Either : 
 * re-use the same eclipse:
   * move the generated plugins in the `dropins` directory under the root directory of your eclipse application (`${eclipseHome}/dropins`)
   * restart Eclipse. 
 * or use another Eclipse. 

At this point, you should have XADL and XQL, and the respective editors installed in your Eclipse. 

Optionally, you may wish to install an XADL generator, that will compile your XADL files into Java. In this case, install : 
 * `com.tocea.codewatch.architecture.dsl.generation`
 * `com.tocea.codewatch.architecture.dsl.generation.master`


Usage
-----

Scertify Architecture Designer defines two languages : XADL and AQL.  XADL is a language for defining some architectural concepts, such as [software design patterns](http://en.wikipedia.org/wiki/Software_design_pattern), good practices, etc. AQL is a language to define some architectural constraints.  XADL rely on AQL to define some constraints, but AQL is independent of XADL. 

To use XADL and AQL, create a new Java Project in Eclipse, as a container for your AQL and XADL files. Make sure to use a UTF-8 encoding, e.g., for the whole workspace  (Eclipse > Preferences > General > Workspace > Text File encoding > select UTF-8), or just for the project (Right clic on project > Properties > Resource > Text File encoding > select UTF-8). 

Any file with a `.xadl` or a `.aql` extension which is created under this project will be compiled into a JAVA class by Architecture designer.  This compilation occurs automagically right after the file is saved.  To customize the location under which the files are generated, the operation differs for AQL and XADL.  For AQL, you may simply add the following line in the AQL file :

    output "src/main/java";

For XADL, create an `adl.properties` file at the root of your Java project, with the following content : 

    xadl.output=src-gen
    xadl.annotations_output=src-gen

You can use the dedicated XADL and AQL editors to edit XADL and AQL files. The editors include essential helpers such as syntactic coloration and autocompletion.  Simply opening XADL and AQL files in eclipse will result in launching their respective editors. 


Architecture model
------------------

XADL relies on a very simple architectural model that consists in a set of Analyzed Elements (Type, File, Library, Project, Method, Field...), and a set of relationships between those elements (ReturnType, Parameter, Call, Reference, Inheritance, Import, Injection, Field).  The artifacts defined in XADL will extend this architectural model by creating new Elements that extend the AnalyzedElements and Relationships ones from the architectural model.

    +--------------+   *      1  source  +------------------+  parent 0..1
    | Relationship |<------------------<>| AnalyzedElements |<>-------+
    +--------------+                     +------------------+         |
    |              |-------------------->|                  |<--------+
    +--------------+   *      1  target  +------------------+  containedElements  *

This model is built from an analysis of an actual architecture by some indexers.  Some generic indexers are provided with Scertify Architecture-Designer, e.g., for Java Source Code, Java Binary Code, or Cobol.   You can also define your own indexers, that will infer some additional architectural informations that are specific to the products that you wish to analyze, e.g., on the basis of your specific conventions, frameworks, tags...


XADL Syntax
-----------

XADL defines architectural patterns and roles between some elements from an architecture model, and associate constraints and metrics to them.  

### header ###

The header of an XADL file is as follows: 

    extension com.myCompagny.myproject.subpackage
    
    import com.myCompagny.myproject.*; 
    import com.tocea.scertify.architecture.primitives.*;

`extension com.myCompagny.myproject.subpackage` corresponds to the declaration of the package of the XADL file. It must be declared once at the beginning of the XADL file.  You can import the artifacts defined in other XADL and AQL files in the context of this XADL file, by using the `import` command.  Usually, importing `com.tocea.scertify.architecture.primitives.*` is primordial as it links your XADL to the primitive elements of the Architecture Model.  This package is included in the Scertify Architecture Framework. 


### patterns, roles and relationships ###

The core of the XADL file follows the header, and consists in a set of `patterns`, `roles` and `relationships`. 

A *pattern* is a reference to a set of Elements that have a specific architectural meaning.  For instance, a [Model-View-controller](http://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller) design pattern is implemented as follows.

    pattern ModelViewController {
    	models : Model[1..*];
    	view : View[0..*];
    	controller : Controller;
    }

A *role* is similar to a pattern, but it has a direct relation to an element of the architectural model.  For instance, Models, Views, and Controllers can be mapped to `Type` primitives. 

    role Model for Type;
    role View for Type;
    role Controller for Type;

A *relationship* is a relation between a source and a target element.  

Again, in the context of the MVC design pattern : 

    /**
     * A view requests from the model the information that it needs to generate 
     * an output representation.
     */   
    relationship accesses : View -> Model; 
    
    /**
     * A controller can send commands to its associated view to change the view's
     * presentation of the model (e.g., by scrolling through a document). 
     */
    relationship sendCommands : Controller -> View;
      
    /** 
     * A controller can send commands to the model to update the model's state 
     * (e.g., editing a document).
     */
    relationship update : Controller -> Model;

Elements Patterns, roles and relationships can get fields to reference other elements.  Fields are optional by default, but can be marked as mandatory, e.g., `bar`.  Moreover, fields can reference sets of elements, e.g., elements `a`, `b`, `c` and `d`.

    role hasReferences {
        foo : Foo;
        mandatory bar : Bar;
        a : Foo[0..1];
        b : Foo[1..*];
        c : Foo*;
        b : Foo[0..1];
    }

### Constraints ###

A roles can get constraints, that define some assertions that must be verified. Constraints consists in an `enforce` keyword followed by a reference to an AQL method. If the result of the AQL method is not a boolean, it should be evaluated with an optional comparator (&gt;=, &lt;=, &gt;, &lt;, =, !=).  Optionally, an error message can be specified to inform the user of the nature of architectural incoherences and problems when detected.  The `this.` prefix is mandatory.

    role WebService for Type {
    	configurations : File*;
    	enforce this.countMethods() <= 15 ? "A web service should'nt have more than 15 methods.";
    	enforce this.allMethodsAreWebmethods();
    }
    
    role WebMethod for Method {
     	enforce this.countArguments() <= 4 ? "Number of arguments of a web method should be lesser than 4";
    	enforce this.countDTOReferences() = 0 ? "No DTO should be referenced by a web method";
    } 


### Generics in XADL ###

Roles and patterns can be parameterized with generic types.

    pattern Collection<T>; {
    	elements : T*;
    } 

    pattern Map<K, V> {
    	keys : K*;
    	values : V*;
    }

    role Foo extends Collection<Bar>;

### Inheritance and abstract elements ###

Some Relationships, Patterns and Roles can extend respectively super-relationships, super-patterns, and super-roles.   Those super elements provide some invariant functionalities to inheriting elements.  

Moreover, Relationships, Patterns and Roles can be abstract.  Abstract elements can not be instantiated on their own, but must be inherited first.  

    extension toto
    
    datatype java.lang.String : String;
    
    abstract pattern StructuralDesignPattern {
        mandatory id : String; 
    }
    
    // all patterns that extend StructuralDesignPattern must get an id.
    pattern Adapter extends StructuralDesignPattern;
    pattern Composite extends StructuralDesignPattern;
    pattern Decorator extends StructuralDesignPattern;
    pattern Proxy extends StructuralDesignPattern;



### primitive role, datatypes and enumerations ###

A *primitive role* corresponds to an element of the Architectural Model, and makes it available in the context of the XADL.   Primitive roles are defined in `com.tocea.scertify.architecture.primitives.*`, thereby there is usually no need for users to add some.  

    primitive AnalyzedElement for com.tocea.codewatch.architecture.core.api.IAnalysedElement;
    primitive Type for com.tocea.codewatch.architecture.core.api.IType;
    primitive Method for com.tocea.codewatch.architecture.core.api.IMethod;
    primitive Field for com.tocea.codewatch.architecture.core.api.IField;
    ....

A *Datatype* corresponds to .... 

    datatype boolean : boolean;
    datatype int : int;
    datatype java.lang.String : String;
    datatype java.io.File : File;

An *enumeration* is a set of elements:  

    enumeration Week {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}



AQL Syntax
----------

AQL defines requests on elements from an architecture model.  


### header ###

The header of an AQL file is as follows: 

    package com.myCompagny.myproject.subpackage
    output "src-gen"
    
    import com.myCompagny.myproject.*; 
    import com.tocea.scertify.architecture.primitives.*;

Similarly to XADL, `package com.myCompagny.myproject.subpackage` corresponds to the declaration of the package of the AQL file. It must be declared once at the beginning of the AQL file.  You can import the artifacts defined in other XADL and AQL files in the context of this AQL file, by using the `import` command.  Usually, importing `com.tocea.scertify.architecture.primitives.*` is primordial as it links your AQL to the primitive elements of the Architecture Model.  This package is included in the Scertify Architecture Framework.


### queries prototypes ###

The core of the AQL file follows the header, and consists in a set of `queries`. 

In the following XADL file, `countMethods()` and `allMethodsAreWebmethods()` reference some queries in an AQL file.

    role WebService for Type {
    	configurations : File*;
    	enforce this.countMethods() <= 15 ? "A web service should'nt have more than 15 methods.";
    	enforce this.allMethodsAreWebmethods();
    }
    
    role WebMethod for Method {
     	enforce this.countArguments() <= 4 ? "Number of arguments of a web method should be lesser than 4";
    	enforce this.countDTOReferences() = 0 ? "No DTO should be referenced by a web method";
    } 



For instance, in the AQL file, the `countMethod()` and `allMethodsAreWebmethods()` are defined as follows.  The called role, which is defined in the XADL file (this), is passed as an argument of the query (WebService). 

    query countMethods(WebService service){
    	... // must return an integer
    }
    query allMethodsAreWebmethods(WebService service){
    	... // must return a boolean
    }

### body of the queries ###

The body of queries is based on the [xbase language](http://www.eclipse.org/Xtext/documentation.html).  The xbase language reference is available [in the documentation of the Xtext framework](http://www.eclipse.org/Xtext/documentation.html#xbaseLanguageRef_Introduction), however their syntax should be easy to understand for developers as it is very similar to the JAVA one.

Queries should return integers or booleans.  Indeed, XADL must be able to evaluate the result of the query as true or false, either directly (boolean), of with a simple comparison to an integer (using &gt;=, &lt;=, &gt;, &lt;, =, !=).



### sample AQL file ###



    package com.tocea.scertify.architecture.extensions.webservice;
    output "src/main/java";
    
    import com.tocea.scertify.architecture.extensions.webservice.*;
    
    /**
     * This query test if a method is a web method.
     * @return 
     * 		true if the method is a web method
     */
    query isWebmethod(IMethod method){
    	val mquery  = new AnalyzedElementExtensionQuery(method);
    	return mquery.hasRole(typeof(WebMethod));
    }
    
    query countMethods(WebService service){
    	return  service.attachedElement.containedElements.filter(typeof(IMethod)).size;
    }
    
    query allMethodsAreWebmethods(WebService service){
    	val attachedElement = service.attachedElement
    	var result=false;
    	if(reflect::Modifier::isInterface(attachedElement.properties)){
    		result= true;
    	}else{
    		result=  attachedElement.containedElements.filter(typeof(IMethod)).filter([m | !WebserviceQueries::isWebmethod(m)]).size==0;
    	}
    	return result;
    }
    
    query countArguments(IMethod method){
    	return method.outgoingRelationships.filter(typeof(IParameterRelationship)).size
    } 











