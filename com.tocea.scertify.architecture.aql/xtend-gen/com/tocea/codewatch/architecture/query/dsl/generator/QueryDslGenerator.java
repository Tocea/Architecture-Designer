package com.tocea.codewatch.architecture.query.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import com.tocea.codewatch.architecture.query.dsl.generator.QueryCompiler;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.Queries;
import com.tocea.codewatch.architecture.query.dsl.queryDsl.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.compiler.output.TreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

@SuppressWarnings("all")
public class QueryDslGenerator extends JvmModelGenerator implements IGenerator {
  @Inject
  private QueryCompiler compiler;
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private ITypeProvider typeProvider;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    Queries queries = ((Queries) _get);
    URI _uRI = resource.getURI();
    String _lastSegment = _uRI.lastSegment();
    String[] _split = _lastSegment.split("\\.");
    String name = ((List<String>)Conversions.doWrapArray(_split)).get(0);
    ImportManager _importManager = new ImportManager(true);
    ImportManager importManager = _importManager;
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<JvmTypeReference> _filter = Iterators.<JvmTypeReference>filter(_allContents, JvmTypeReference.class);
    Set<JvmTypeReference> types = IteratorExtensions.<JvmTypeReference>toSet(_filter);
    for (final JvmTypeReference t : types) {
      JvmType _type = t.getType();
      importManager.addImportFor(_type);
    }
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<XExpression> _filter_1 = Iterators.<XExpression>filter(_allContents_1, XExpression.class);
    Set<XExpression> assignments = IteratorExtensions.<XExpression>toSet(_filter_1);
    for (final XExpression c : assignments) {
      {
        final JvmTypeReference type = this.typeProvider.getExpectedType(c);
        boolean _notEquals = (!Objects.equal(type, null));
        if (_notEquals) {
          JvmType _type_1 = type.getType();
          importManager.addImportFor(_type_1);
        }
      }
    }
    String _name = queries.getName();
    String _replace = _name.replace(".", "/");
    String _plus = ("src/" + _replace);
    String output = (_plus + "/");
    String _output = queries.getOutput();
    boolean _notEquals = (!Objects.equal(_output, null));
    if (_notEquals) {
      String _output_1 = queries.getOutput();
      String _plus_1 = (_output_1 + "/");
      String _name_1 = queries.getName();
      String _replace_1 = _name_1.replace(".", "/");
      String _plus_2 = (_plus_1 + _replace_1);
      String _plus_3 = (_plus_2 + "/");
      output = _plus_3;
    }
    ((AbstractFileSystemAccess) fsa).setOutputPath(output);
    String _firstUpper = StringExtensions.toFirstUpper(name);
    String _plus_4 = (_firstUpper + ".java");
    CharSequence _compile = this.compile(queries, importManager, name);
    fsa.generateFile(_plus_4, _compile);
  }
  
  public CharSequence compile(final Queries o, final ImportManager importManager, final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = o.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    final ArrayList<CharSequence> contents = this.contents(o, importManager);
    _builder.newLineIfNotEmpty();
    {
      List<String> _imports = importManager.getImports();
      for(final String imp : _imports) {
        _builder.append("import ");
        _builder.append(imp, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(name);
    _builder.append(_firstUpper, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      for(final CharSequence q : contents) {
        _builder.newLine();
        _builder.append(q, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public ArrayList<CharSequence> contents(final Queries o, final ImportManager importManager) {
    ArrayList<CharSequence> _arrayList = new ArrayList<CharSequence>();
    final ArrayList<CharSequence> contents = _arrayList;
    EList<Query> _queries = o.getQueries();
    for (final Query q : _queries) {
      {
        final TreeAppendable appendable = this.createAppendable(o, importManager);
        CharSequence _compile = this.compile(q, importManager, appendable);
        contents.add(_compile);
        List<String> _imports = importManager.getImports();
        List<String> _imports_1 = appendable.getImports();
        _imports.addAll(_imports_1);
      }
    }
    return contents;
  }
  
  public CharSequence compile(final Query o, final ImportManager importManager, final ITreeAppendable appendable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("/**");
    String _documentation = this._jvmTypesBuilder.getDocumentation(o);
    _builder.append(_documentation, "	");
    _builder.append(" */\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("public static  ");
    JvmTypeReference _type = this.compiler.getType(o);
    String _simpleName = _type.getSimpleName();
    _builder.append(_simpleName, "	 ");
    _builder.append(" ");
    String _name = o.getName();
    _builder.append(_name, "	 ");
    _builder.append("(");
    String _parameterList = this.parameterList(o, importManager);
    _builder.append(_parameterList, "	 ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _compile = this.compiler.compile(o, importManager, appendable);
    _builder.append(_compile, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String simpleName(final JvmType p, final ImportManager manager) {
    return p.getSimpleName();
  }
  
  public String parameterList(final Query o, final ImportManager importManager) {
    EList<JvmFormalParameter> _parameters = o.getParameters();
    final Function1<JvmFormalParameter,String> _function = new Function1<JvmFormalParameter,String>() {
        public String apply(final JvmFormalParameter p) {
          JvmTypeReference _parameterType = p.getParameterType();
          JvmType _type = _parameterType.getType();
          String _simpleName = QueryDslGenerator.this.simpleName(_type, importManager);
          String _plus = ("final " + _simpleName);
          String _plus_1 = (_plus + " ");
          String _name = p.getName();
          String _plus_2 = (_plus_1 + _name);
          return _plus_2;
        }
      };
    List<String> _map = ListExtensions.<JvmFormalParameter, String>map(_parameters, _function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", ");
    String _join = IterableExtensions.join(_map, _builder);
    return _join;
  }
}
