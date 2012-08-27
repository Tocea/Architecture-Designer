
package com.tocea.codewatch.architecture.dsl;



import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;



public class ArchitectureDslFileSystemAccess extends EclipseResourceFileSystemAccess2
{
    
    
    private final static String DEFAULT_OUTPUT_PATH = "src-gen";
    private final static String PROPERTIES          = "adl.properties";
    
    private final static String EXTENSION_OUTPUT    = "xadl.output";
    
    
    
    public String getExtensionOutput() throws IOException, CoreException {
    
    
        IFolder folder = getFolder(getOutputConfig(DEFAULT_OUTPUT));
        IFile file = folder.getProject().getFile(PROPERTIES);
        
        if (file.exists()) {
            Properties properties = new Properties();
  
            properties.load(new BufferedInputStream(file.getContents()));
            String property = properties.getProperty(EXTENSION_OUTPUT);
            if (property != null) return property;
        }
        return DEFAULT_OUTPUT_PATH;
    }
}
