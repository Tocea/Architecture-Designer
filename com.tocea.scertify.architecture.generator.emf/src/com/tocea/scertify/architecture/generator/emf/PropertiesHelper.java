package com.tocea.scertify.architecture.generator.emf;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

import com.tocea.scertify.architecture.xadl.architectureDSL.ArchitectureExtension;

@SuppressWarnings("all")
public class PropertiesHelper {
	private final static String DEFAULT_OUTPUT_PATH = "src-gen";
	private final static String DEFAULT_EXTENSION_URI_PREFIX = "http://www.tocea.com/codewatch/architecture/extension/";

	private final static String PROPERTIES = "adl.properties";

	private final static String EXTENSION_OUTPUT = "xadl.output";
	private final static String EXTENSION_URI = "xadl.uri";

	private final Map<Object, Object> properties;

	private final IProject project;

	public PropertiesHelper(final IProject project) {

		this.project = project;
		IFile file = project.getFile(PropertiesHelper.PROPERTIES);
		try {
			boolean _exists = file.exists();
			if (_exists) {
				Properties _properties = new Properties();
				Properties properties = _properties;
				InputStream _contents = file.getContents();
				BufferedInputStream _bufferedInputStream = new BufferedInputStream(
						_contents);
				properties.load(_bufferedInputStream);
				this.properties = properties;
			} else {
				HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
				this.properties = _hashMap;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public String getExtensionURI(ArchitectureExtension extension) {
		if (this.properties.containsKey(PropertiesHelper.EXTENSION_URI)) {
			return (String) this.properties.get(EXTENSION_URI);
		}
		String replace = extension.getName().replace("\\.", "/");
		return PropertiesHelper.DEFAULT_EXTENSION_URI_PREFIX + "/" + replace;

	}

	public String getOutputPath() {
		String _xifexpression = null;
		boolean _containsKey = this.properties
				.containsKey(PropertiesHelper.EXTENSION_OUTPUT);
		if (_containsKey) {
			Object _get = this.properties
					.get(PropertiesHelper.EXTENSION_OUTPUT);
			String _string = _get.toString();
			_xifexpression = _string;
		} else {
			_xifexpression = PropertiesHelper.DEFAULT_OUTPUT_PATH;
		}
		return _xifexpression;
	}

	public String getName(ArchitectureExtension extension) {
		String[] split = extension.getName().split("\\.");

		return split[split.length - 1];
	}

	public String getPrefix(ArchitectureExtension extension) {
		return extension.getName();
	}

}
