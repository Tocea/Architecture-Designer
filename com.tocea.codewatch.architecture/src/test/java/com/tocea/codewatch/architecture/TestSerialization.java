
package com.tocea.codewatch.architecture;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.tocea.codewatch.architecture.core.api.IProject;
import com.tocea.codewatch.architecture.core.api.IType;
import com.tocea.codewatch.architecture.factory.ArchitectureFactory;
import com.tocea.codewatch.architecture.factory.api.IArchitectureFactory;
import com.tocea.codewatch.architecture.xml.ArchitectureXMLTools;



public class TestSerialization
{
    
    
    private final static IArchitectureFactory FACTORY = new ArchitectureFactory();
    private final static IProject             PROJECT = populate(1000);
    
    
    
    @Test
    public void testJaxbSave() throws JAXBException, IOException {
    
    
        ArchitectureXMLTools.serialize(new File("bkp-jaxb.xml"), PROJECT);
        
    }
    
    
    @Test
    public void testXstreamSave() throws JAXBException, IOException {
    
    
        new XStream().toXML(PROJECT, new BufferedOutputStream(new FileOutputStream(new File("bkp-xstream.xml"))));
        
    }
    
    
    @Test
    public void testJaxbLoad() throws JAXBException, IOException {
    
    
        File file = new File("bkp-jaxb.xml");
        ArchitectureXMLTools.deserializeProject(file);
        file.delete();
    }
    
    
    @Test
    public void testXstreamLoad() throws JAXBException, IOException {
    
    
        File file = new File("bkp-xstream.xml");
        new XStream().fromXML(new BufferedInputStream(new FileInputStream(file)));
        file.delete();
    }
    
    
    private final static IProject populate(int size) {
    
    
        IType types[] = new IType[size];
        IProject p = FACTORY.newProject("projet");
        
        for (int i = 0; i < size; ++i) {
            types[i] = FACTORY.newType("MaClass" + i, "test.MaClass" + i);
        }
        p.getContainedElements().addAll(Arrays.asList(types));
        return p;
    }
}
