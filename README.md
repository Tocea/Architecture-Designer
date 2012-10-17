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
   * todo

At this point, you should have XADL and XQL, and the respective editors installed in your Eclipse. 


Usage
-----

Scertify Architecture Designer defines two languages : XADL and AQL.  XADL is a language for defining some architectural concepts, such as [software design patterns](http://en.wikipedia.org/wiki/Software_design_pattern), good practices, etc. AQL is a language to define some architectural constraints.  XADL rely on AQL to define some constraints, but AQL is independant od XADL. 

* Create a new Java Project, as a container for your AQL and XADL files. 
  * Make sure to use a UTF-8 encoding.  
    e.g., for the whole workspace  (Eclipse > Preferences > General > Workspace > Text File encoding > select UTF-8) 
    or just for the project (Right clic on project > Properties > Resource > Text File encoding > select UTF-8)

Any file with a `.xadl` or a `.aql` extension which is created under this project will be compiled into a JAVA class by Architecture designer.  This compilation occurs automagically right after the file is saved.  

You can use the dedicated XADL and AQL editors to edit XADL and AQL files. The editors include essential helpers such as syntaxic coloration and autocompletion.  Simply opening XADL and AQL files in eclipse will result in launching their respective editors. 

XADL Syntax
-----------

XADL defines architectural patterns and roles between some elements from an architecture model, and associate constraints and metrics to them.  

### architecture model ###
XADL relies on a very simple architectural model that consists in a set of Analysed Elements (Type, File, Library, Project, Method, Field...), and a set of relationships between those elements (ReturnType, Parameter, Call, Reference, Inheritence, Import, Injection, Field).  

This model is built from an analysis of an actual architecture by some indexers.  Some generic indexers are provided with Scertify Architecture-Designer, e.g., for Java Source Code, Java Binary Code, or Cobol.   You can also define your own indexers, that will infer some aditionnal architectural informations that are specific to the products that you wish to analyse, e.g., on the basis of your specific conventions, frameworks, tags...

### header ###

The header of an XADL file is as follows: 

    extension com.myCompagny.myproject.subpackage
    
    import com.myCompagny.myproject.*; 
    import com.tocea.scertify.architecture.primitives.*;

`extension com.myCompagny.myproject.subpackage` corresponds to the declaration of the package of the XADL file. It must be declared once at the beginning of the XADL file.  You can import the content of other XADL files in the context of the XADL file you are defining, using the `import` command.  

Usually, importing `com.tocea.scertify.architecture.primitives.*` is primordial as it links your XADLs to the Architecture Model.  This package is included in the Scertify Architecture Framework.

The core of the XADL file follows the header, and consists in a set of `patterns`, `roles` and `relationships`. 

### primitive role ###

A *primitive role* corresponds to an element of the Architectural Model, and makes it available in the context of the XADL.   Primitive roles are defined in `com.tocea.scertify.architecture.primitives.*`, thereby there is no need users to add some.  

    primitive AnalyzedElement for com.tocea.codewatch.architecture.core.api.IAnalysedElement;
    primitive Type for com.tocea.codewatch.architecture.core.api.IType;
    primitive Method for com.tocea.codewatch.architecture.core.api.IMethod;
    primitive Field for com.tocea.codewatch.architecture.core.api.IField;
    ....

### datatypes ###

Datatypes corresponds to .... 

### patterns ###

A *pattern* is a reference to a set of Elements that have a specific architectural meaning.  For instance, a [Model-View-controller](http://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller) design pattern is implemented as follows.

    pattern ModelViewController {
    	models : Model[1..*];
    	view : View[0..*];
    	controller : Controller;
    }

### role ###

A *role* is similar to a pattern, but it has a direct relation to an element of the architectural model.  For instance, Models, Views, and Controllers can be mapped to some `Type` primitives. 

    role Model for Type {
    	mandatory observable: Observable;
    }
    role View for Type {
    	modelObserver: Observer;
    }
    role Controller for Type;

### relationships ###

A *relationships* is ...

### enumeration ###

An *enumeration* is ....




AQL Syntax
----------
















