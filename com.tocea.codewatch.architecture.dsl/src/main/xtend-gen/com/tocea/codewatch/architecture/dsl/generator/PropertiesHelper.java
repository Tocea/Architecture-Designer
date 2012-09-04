package com.tocea.codewatch.architecture.dsl.generator;

import com.google.common.base.Objects;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class PropertiesHelper {
  private final static String DEFAULT_OUTPUT_PATH = "src-gen";
  
  private final static String DEFAULT_ANNOTATIONS_OUTPUT = "annotations";
  
  private final static String PROPERTIES = "adl.properties";
  
  private final static String EXTENSION_OUTPUT = "xadl.output";
  
  private final static String ANNOTATIONS_OUTPUT = "xadl.annotations_output";
  
  private final Map<Object,Object> properties;
  
  private final IProject project;
  
  public PropertiesHelper(final IProject project) {
    try {
      this.project = project;
      IFile file = project.getFile(PropertiesHelper.PROPERTIES);
      boolean _exists = file.exists();
      if (_exists) {
        Properties _properties = new Properties();
        Properties properties = _properties;
        InputStream _contents = file.getContents();
        BufferedInputStream _bufferedInputStream = new BufferedInputStream(_contents);
        properties.load(_bufferedInputStream);
        this.properties = properties;
      } else {
        HashMap<Object,Object> _hashMap = new HashMap<Object,Object>();
        this.properties = _hashMap;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String getOutputPath() {
    String _xifexpression = null;
    boolean _containsKey = this.properties.containsKey(PropertiesHelper.EXTENSION_OUTPUT);
    if (_containsKey) {
      Object _get = this.properties.get(PropertiesHelper.EXTENSION_OUTPUT);
      String _string = _get.toString();
      _xifexpression = _string;
    } else {
      _xifexpression = PropertiesHelper.DEFAULT_OUTPUT_PATH;
    }
    return _xifexpression;
  }
  
  public String getAnnotationsOutputPath() {
    String _xifexpression = null;
    boolean _containsKey = this.properties.containsKey(PropertiesHelper.ANNOTATIONS_OUTPUT);
    if (_containsKey) {
      Object _get = this.properties.get(PropertiesHelper.ANNOTATIONS_OUTPUT);
      String _string = _get.toString();
      _xifexpression = _string;
    } else {
      _xifexpression = PropertiesHelper.DEFAULT_ANNOTATIONS_OUTPUT;
    }
    return _xifexpression;
  }
  
  public IFile getAnnotationFile(final String fileName) {
    IFile _xblockexpression = null;
    {
      String _annotationsOutputPath = this.getAnnotationsOutputPath();
      final IFolder folder = this.project.getFolder(_annotationsOutputPath);
      boolean _exists = folder.exists();
      boolean _not = (!_exists);
      if (_not) {
        this.createFolder(folder);
      }
      IFile _file = folder.getFile(fileName);
      _xblockexpression = (_file);
    }
    return _xblockexpression;
  }
  
  private void createFolder(final IContainer container) {
    try {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(container, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _exists = container.exists();
        boolean _not = (!_exists);
        _and = (_notEquals && _not);
      }
      if (_and) {
        IContainer _parent = container.getParent();
        this.createFolder(_parent);
        ((IFolder) container).create(true, true, null);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
