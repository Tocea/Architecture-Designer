package com.tocea.codewatch.architecture.dsl.generator;

import com.google.common.base.Objects;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Arity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Datatype;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Field;
import com.tocea.codewatch.architecture.dsl.architectureDSL.NamedEntity;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Parameter;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ParametrizedType;
import com.tocea.codewatch.architecture.dsl.architectureDSL.PrimitiveRole;
import com.tocea.codewatch.architecture.dsl.architectureDSL.ReferencedType;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Relationship;
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConjunctionConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.RelationshipPrimitiveConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.Type;
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeConstraint;
import com.tocea.codewatch.architecture.dsl.architectureDSL.TypeReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GeneratorHelper {
  public final static String LIST = "java.util.List";
  
  public final static String ARRAY_LIST = "java.util.ArrayList";
  
  public final static String BOUNDLIST = "com.tocea.codewatch.architecture.extension.util.BoundList";
  
  public final static String ABSTRACT_PATTERN = "com.tocea.codewatch.architecture.extension.AbstractPattern";
  
  public final static String ABSTRACT_ROLE = "com.tocea.codewatch.architecture.extension.AbstractRole";
  
  public final static String ABSTRACT_EXTENSION_RELATIONSHIP = "com.tocea.codewatch.architecture.extension.AbstractExtensionRelationship";
  
  public final static String DISJUNCTION_CONSTRAINT = "com.tocea.codewatch.architecture.extension.DisjunctionConstraint";
  
  public final static String CONJUNCTION_CONSTRAINT = "com.tocea.codewatch.architecture.extension.ConjunctionConstraint";
  
  public final static String TYPE_CONSTRAINT = "com.tocea.codewatch.architecture.extension.TypeConstraint";
  
  public final static String IRELATIONSHIP_CONSTRAINT = "com.tocea.codewatch.architecture.extension.api.IRelationshipConstraint";
  
  public final static String ANALYSED_ELEMENT = "com.tocea.codewatch.architecture.core.api.IAnalysedElement";
  
  public final static String TYPE = "com.tocea.codewatch.architecture.core.api.IType";
  
  public final static String ARCHITECTURE_FILE = "com.tocea.codewatch.architecture.core.api.IArchitectureFile";
  
  public final static String LIBRARY = "com.tocea.codewatch.architecture.core.api.ILibrary";
  
  public final static String PROJECT = "com.tocea.codewatch.architecture.core.api.IProject";
  
  public final static String METHOD = "com.tocea.codewatch.architecture.core.api.IMethod";
  
  public final static String FIELD = "com.tocea.codewatch.architecture.core.api.IField";
  
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private final MultiLineCommentDocumentationProvider documentationProvider = new Function0<MultiLineCommentDocumentationProvider>() {
    public MultiLineCommentDocumentationProvider apply() {
      MultiLineCommentDocumentationProvider _multiLineCommentDocumentationProvider = new MultiLineCommentDocumentationProvider();
      return _multiLineCommentDocumentationProvider;
    }
  }.apply();
  
  private final List<String> imports = new Function0<List<String>>() {
    public List<String> apply() {
      ArrayList<String> _arrayList = new ArrayList<String>();
      return _arrayList;
    }
  }.apply();
  
  private final Map<String,String> names = new Function0<Map<String,String>>() {
    public Map<String,String> apply() {
      HashMap<String,String> _hashMap = new HashMap<String,String>();
      return _hashMap;
    }
  }.apply();
  
  public GeneratorHelper(final IQualifiedNameProvider qualifiedNameProvider) {
    this._iQualifiedNameProvider = qualifiedNameProvider;
  }
  
  private String printNoImport(final String qualifiedName) {
    String _print = this.print(qualifiedName, false);
    return _print;
  }
  
  private String print(final String qualifiedName, final boolean addImport) {
    String _xifexpression = null;
    boolean _containsKey = this.names.containsKey(qualifiedName);
    if (_containsKey) {
      String _get = this.names.get(qualifiedName);
      _xifexpression = _get;
    } else {
      String _xblockexpression = null;
      {
        final String simpleName = this.getSimpleName(qualifiedName);
        String _xifexpression_1 = null;
        boolean _containsValue = this.names.containsValue(simpleName);
        if (_containsValue) {
          String _xblockexpression_1 = null;
          {
            this.names.put(qualifiedName, qualifiedName);
            _xblockexpression_1 = (qualifiedName);
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          String _xblockexpression_2 = null;
          {
            this.names.put(qualifiedName, simpleName);
            if (addImport) {
              this.imports.add(qualifiedName);
            }
            _xblockexpression_2 = (simpleName);
          }
          _xifexpression_1 = _xblockexpression_2;
        }
        _xblockexpression = (_xifexpression_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected Object _print(final String qualifiedName) {
    String _print = this.print(qualifiedName, true);
    return _print;
  }
  
  protected Object _print(final Field field) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      boolean _isMany = field.isMany();
      if (_isMany) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("private ");
        Object _print = this.print(GeneratorHelper.LIST);
        _builder.append(_print, "");
        _builder.append("<");
        TypeReference _type = field.getType();
        Object _print_1 = this.print(_type);
        _builder.append(_print_1, "");
        _builder.append("> ");
        String _name = field.getName();
        _builder.append(_name, "");
        _builder.append(" = new ");
        Object _print_2 = this.print(GeneratorHelper.ARRAY_LIST);
        _builder.append(_print_2, "");
        _builder.append("<");
        TypeReference _type_1 = field.getType();
        Object _print_3 = this.print(_type_1);
        _builder.append(_print_3, "");
        _builder.append(">();");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      Arity _lb = field.getLb();
      boolean _notEquals = (!Objects.equal(_lb, null));
      if (_notEquals) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("private ");
        Object _print_4 = this.print(GeneratorHelper.LIST);
        _builder_1.append(_print_4, "");
        _builder_1.append("<");
        TypeReference _type_2 = field.getType();
        Object _print_5 = this.print(_type_2);
        _builder_1.append(_print_5, "");
        _builder_1.append("> ");
        String _name_1 = field.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(" = new ");
        Object _print_6 = this.print(GeneratorHelper.BOUNDLIST);
        _builder_1.append(_print_6, "");
        _builder_1.append("<");
        TypeReference _type_3 = field.getType();
        Object _print_7 = this.print(_type_3);
        _builder_1.append(_print_7, "");
        _builder_1.append(">();");
        _switchResult = _builder_1;
      }
    }
    if (!_matched) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("private ");
      TypeReference _type_4 = field.getType();
      Object _print_8 = this.print(_type_4);
      _builder_2.append(_print_8, "");
      _builder_2.append(" ");
      String _name_2 = field.getName();
      _builder_2.append(_name_2, "");
      _builder_2.append(";");
      _switchResult = _builder_2;
    }
    return _switchResult;
  }
  
  protected Object _print(final TypeReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    ReferencedType _reference = reference.getReference();
    Object _print = this.print(_reference);
    _builder.append(_print, "");
    {
      EList<TypeReference> _parameters = reference.getParameters();
      boolean _hasElements = false;
      for(final TypeReference parameter : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        Object _print_1 = this.print(parameter);
        _builder.append(_print_1, "");
      }
      if (_hasElements) {
        _builder.append(">", "");
      }
    }
    return _builder;
  }
  
  protected Object _print(final Parameter parameter) {
    String _name = parameter.getName();
    String _printNoImport = this.printNoImport(_name);
    return _printNoImport;
  }
  
  protected Object _print(final NamedEntity entity) {
    String _qualifiedName = this.getQualifiedName(entity);
    Object _print = this.print(_qualifiedName);
    return _print;
  }
  
  protected Object _print(final Datatype datatype) {
    Object _xifexpression = null;
    boolean _isPrimitive = this.isPrimitive(datatype);
    if (_isPrimitive) {
      String _qualifiedName = this.getQualifiedName(datatype);
      String _printNoImport = this.printNoImport(_qualifiedName);
      _xifexpression = _printNoImport;
    } else {
      String _qualifiedName_1 = this.getQualifiedName(datatype);
      Object _print = this.print(_qualifiedName_1);
      _xifexpression = _print;
    }
    return _xifexpression;
  }
  
  protected Object _print(final List<RelationshipConstraint> constraints) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      int _size = constraints.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        RelationshipConstraint _get = constraints.get(0);
        Object _print = this.print(((RelationshipConjunctionConstraint) _get));
        _builder.append(_print, "");
        _builder.append(";");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      int _size_1 = constraints.size();
      boolean _greaterThan = (_size_1 > 1);
      if (_greaterThan) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("new ");
        Object _print_1 = this.print(GeneratorHelper.DISJUNCTION_CONSTRAINT);
        _builder_1.append(_print_1, "");
        _builder_1.append("(");
        {
          boolean _hasElements = false;
          for(final RelationshipConstraint c : constraints) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder_1.appendImmediate(", ", "");
            }
            Object _print_2 = this.print(((RelationshipConjunctionConstraint) c));
            _builder_1.append(_print_2, "");
          }
        }
        _builder_1.append(");");
        _switchResult = _builder_1;
      }
    }
    return _switchResult;
  }
  
  protected Object _print(final RelationshipConjunctionConstraint constraint) {
    Object _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      EList<RelationshipPrimitiveConstraint> _constraints = constraint.getConstraints();
      int _size = _constraints.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        _matched=true;
        EList<RelationshipPrimitiveConstraint> _constraints_1 = constraint.getConstraints();
        RelationshipPrimitiveConstraint _get = _constraints_1.get(0);
        Object _print = this.print(((TypeConstraint) _get));
        _switchResult = _print;
      }
    }
    if (!_matched) {
      EList<RelationshipPrimitiveConstraint> _constraints_2 = constraint.getConstraints();
      int _size_1 = _constraints_2.size();
      boolean _greaterThan = (_size_1 > 1);
      if (_greaterThan) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new ");
        Object _print_1 = this.print(GeneratorHelper.CONJUNCTION_CONSTRAINT);
        _builder.append(_print_1, "");
        _builder.append("(");
        {
          EList<RelationshipPrimitiveConstraint> _constraints_3 = constraint.getConstraints();
          boolean _hasElements = false;
          for(final RelationshipPrimitiveConstraint c : _constraints_3) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            Object _print_2 = this.print(((TypeConstraint) c));
            _builder.append(_print_2, "");
          }
        }
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  protected Object _print(final TypeConstraint constraint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ");
    Object _print = this.print(GeneratorHelper.TYPE_CONSTRAINT);
    _builder.append(_print, "");
    _builder.append("(");
    {
      Type _source = constraint.getSource();
      boolean _equals = Objects.equal(_source, null);
      if (_equals) {
        _builder.append("null");
      } else {
        Type _source_1 = constraint.getSource();
        String _qualifiedName = this.getQualifiedName(_source_1);
        Object _print_1 = this.print(_qualifiedName);
        _builder.append(_print_1, "");
        _builder.append(".class");
      }
    }
    _builder.append(", ");
    {
      Type _target = constraint.getTarget();
      boolean _equals_1 = Objects.equal(_target, null);
      if (_equals_1) {
        _builder.append("null");
      } else {
        Type _target_1 = constraint.getTarget();
        String _qualifiedName_1 = this.getQualifiedName(_target_1);
        Object _print_2 = this.print(_qualifiedName_1);
        _builder.append(_print_2, "");
        _builder.append(".class");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence printAccessors(final Field field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Getter for field ");
    String _name = field.getName();
    _builder.append(_name, " ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public ");
    {
      boolean _or = false;
      boolean _isMany = field.isMany();
      if (_isMany) {
        _or = true;
      } else {
        Arity _lb = field.getLb();
        boolean _notEquals = (!Objects.equal(_lb, null));
        _or = (_isMany || _notEquals);
      }
      if (_or) {
        Object _print = this.print(GeneratorHelper.LIST);
        _builder.append(_print, "");
        _builder.append("<");
        TypeReference _type = field.getType();
        Object _print_1 = this.print(_type);
        _builder.append(_print_1, "");
        _builder.append(">");
      } else {
        TypeReference _type_1 = field.getType();
        Object _print_2 = this.print(_type_1);
        _builder.append(_print_2, "");
      }
    }
    _builder.append(" get");
    String _name_1 = field.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_2 = field.getName();
    _builder.append(_name_2, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    {
      boolean _and = false;
      boolean _isMany_1 = field.isMany();
      boolean _not = (!_isMany_1);
      if (!_not) {
        _and = false;
      } else {
        Arity _lb_1 = field.getLb();
        boolean _equals = Objects.equal(_lb_1, null);
        _and = (_not && _equals);
      }
      if (_and) {
        _builder.newLine();
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Setter for field ");
        String _name_3 = field.getName();
        _builder.append(_name_3, " ");
        _builder.append(".");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("public void set");
        String _name_4 = field.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_1, "");
        _builder.append("(");
        TypeReference _type_2 = field.getType();
        Object _print_3 = this.print(_type_2);
        _builder.append(_print_3, "");
        _builder.append(" ");
        String _name_5 = field.getName();
        _builder.append(_name_5, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _name_6 = field.getName();
        _builder.append(_name_6, "	");
        _builder.append(" = ");
        String _name_7 = field.getName();
        _builder.append(_name_7, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence printDocumentation(final EObject object) {
    CharSequence _xblockexpression = null;
    {
      final String doc = this.documentationProvider.getDocumentation(object);
      CharSequence _xifexpression = null;
      boolean _notEquals = (!Objects.equal(doc, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("/**");
        _builder.newLine();
        {
          String[] _split = doc.split("\\r?\\n");
          for(final String line : _split) {
            _builder.append(" * ", "");
            _builder.append(line, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _xifexpression = _builder;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public CharSequence printImports() {
    CharSequence _xblockexpression = null;
    {
      Collections.<String>sort(this.imports);
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(final String i : this.imports) {
          _builder.append("import ");
          _builder.append(i, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _printDeclaration(final ParametrizedType type) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = type.getName();
    String _printNoImport = this.printNoImport(_name);
    _builder.append(_printNoImport, "");
    CharSequence _printParameters = this.printParameters(type);
    _builder.append(_printParameters, "");
    return _builder;
  }
  
  protected CharSequence _printDeclaration(final Relationship relationship) {
    String _qualifiedName = this.getQualifiedName(relationship);
    String _printNoImport = this.printNoImport(_qualifiedName);
    return _printNoImport;
  }
  
  public CharSequence printParameters(final ParametrizedType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Parameter> _parameters = type.getParameters();
      boolean _hasElements = false;
      for(final Parameter parameter : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name = parameter.getName();
        _builder.append(_name, "");
      }
      if (_hasElements) {
        _builder.append(">", "");
      }
    }
    return _builder;
  }
  
  private String getSimpleName(final String qualifiedName) {
    String[] _split = qualifiedName.split("\\.");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
    return _last;
  }
  
  private String _getQualifiedName(final NamedEntity entity) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(entity);
    String _string = _fullyQualifiedName.toString();
    return _string;
  }
  
  private String _getQualifiedName(final Parameter parameter) {
    String _name = parameter.getName();
    return _name;
  }
  
  private String _getQualifiedName(final Datatype datatype) {
    JvmTypeReference _reference = datatype.getReference();
    String _qualifiedName = _reference.getQualifiedName();
    return _qualifiedName;
  }
  
  private String _getQualifiedName(final PrimitiveRole role) {
    JvmTypeReference _type = role.getType();
    String _qualifiedName = _type.getQualifiedName();
    return _qualifiedName;
  }
  
  private boolean isPrimitive(final Datatype t) {
    JvmTypeReference _reference = t.getReference();
    JvmType _type = _reference.getType();
    String _qualifiedName = _type.getQualifiedName();
    final String _switchValue = _qualifiedName;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"boolean")) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"int")) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"long")) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"double")) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"float")) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"byte")) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"char")) {
        _matched=true;
        return true;
      }
    }
    return false;
  }
  
  public Object print(final Object datatype) {
    if (datatype instanceof Datatype) {
      return _print((Datatype)datatype);
    } else if (datatype instanceof Parameter) {
      return _print((Parameter)datatype);
    } else if (datatype instanceof RelationshipConjunctionConstraint) {
      return _print((RelationshipConjunctionConstraint)datatype);
    } else if (datatype instanceof TypeConstraint) {
      return _print((TypeConstraint)datatype);
    } else if (datatype instanceof Field) {
      return _print((Field)datatype);
    } else if (datatype instanceof NamedEntity) {
      return _print((NamedEntity)datatype);
    } else if (datatype instanceof TypeReference) {
      return _print((TypeReference)datatype);
    } else if (datatype instanceof List) {
      return _print((List<RelationshipConstraint>)datatype);
    } else if (datatype instanceof String) {
      return _print((String)datatype);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(datatype).toString());
    }
  }
  
  public CharSequence printDeclaration(final EObject type) {
    if (type instanceof ParametrizedType) {
      return _printDeclaration((ParametrizedType)type);
    } else if (type instanceof Relationship) {
      return _printDeclaration((Relationship)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
  
  private String getQualifiedName(final NamedEntity datatype) {
    if (datatype instanceof Datatype) {
      return _getQualifiedName((Datatype)datatype);
    } else if (datatype instanceof PrimitiveRole) {
      return _getQualifiedName((PrimitiveRole)datatype);
    } else if (datatype instanceof Parameter) {
      return _getQualifiedName((Parameter)datatype);
    } else if (datatype != null) {
      return _getQualifiedName(datatype);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(datatype).toString());
    }
  }
}
