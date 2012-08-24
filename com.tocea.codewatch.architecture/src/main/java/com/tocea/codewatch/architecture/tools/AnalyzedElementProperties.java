
package com.tocea.codewatch.architecture.tools;



import java.util.ArrayList;
import java.util.List;



/**
 * This type describes an abstract encoder/decoder tool for the properties of an {@link AnalyzedElement}.
 * <p>
 * This type should be override for each language in order to define available properties (e.g., abstract, interface, public, etc.)
 * 
 * @author Antoine Floc'h
 * @since 5 juil. 2012
 * @copyright Copyright (C) 2010-2012 TOCEA
 */
public abstract class AnalyzedElementProperties
{
    
    
    public static class BooleanProperty
    {
        
        
        private final String name;
        private final int    index;
        
        
        
        public BooleanProperty(final String name, final int index) {
        
        
            super();
            this.name = name;
            this.index = index;
        }
        
        
        public int getIndex() {
        
        
            return this.index;
        }
        
        
        public String getName() {
        
        
            return this.name;
        }
        
        
        @Override
        public String toString() {
        
        
            return this.name;
        }
        
    }
    
    
    
    /**
     * This method encode an array of properties as an int value.
     * 
     * @param properties
     * @return the encoded properties
     */
    public static int encode(final int... properties) {
    
    
        if (properties.length > 0) {
            int p = properties[0];
            for (int i = 1; i < properties.length; i++) {
                p |= properties[i];
            }
            return p;
        } else {
            return 0;
        }
    }
    
    
    public static int setProperties(final int value, final int... properties) {
    
    
        if (properties.length > 0) {
            int p = value;
            for (int i = 1; i < properties.length; i++) {
                p |= properties[i];
            }
            return p;
        } else {
            return 0;
        }
    }
    
    
    /**
     * This method test the presence of an array of properties in an encoded value.
     * 
     * @param value
     *            tested value
     * @param properties
     *            tested properties
     * @return true if all properties are encoded in the value
     */
    public static boolean isEnabled(final int value, final int... properties) {
    
    
        for (final int p : properties) {
            if ((value & p) != p) {
                return false;
            }
        }
        return true;
    }
    
    
    /**
     * This method compute the identifier of the i property.
     * 
     * @param i
     * @return the identifier of the i property
     */
    protected final static int property(final int i) {
    
    
        return 1 << i;
    }
    
    
    
    private final List<BooleanProperty> knownProperties;
    
    
    
    public AnalyzedElementProperties() {
    
    
        this.knownProperties = new ArrayList<BooleanProperty>();
    }
    
    
    /**
     * This method add a boolean property in the known properties list.
     * 
     * @param name
     *            name of the new property
     * @return the created property
     */
    public BooleanProperty addBooleanProperty(final String name) {
    
    
        final BooleanProperty booleanProperty = new BooleanProperty(name, property(this.knownProperties.size()));
        this.knownProperties.add(booleanProperty);
        return booleanProperty;
    }
    
    
    /**
     * This method get all known and enabled properties of a value.
     * 
     * @param value
     *            tested value
     * @return all enabled boolean properties.
     */
    public List<BooleanProperty> getBooleanProperties(final int value) {
    
    
        final List<BooleanProperty> properties = new ArrayList<BooleanProperty>();
        for (int i = 0; i < this.knownProperties.size(); i++) {
            final BooleanProperty booleanProperty = this.knownProperties.get(i);
            if (isEnabled(value, booleanProperty.index)) {
                properties.add(booleanProperty);
            }
        }
        return properties;
    }
    
    
    /**
     * This method get the boolean property which has the given name.
     * 
     * @param name
     *            name of the searched property
     * @return the boolean property if it is known, return null otherwise.
     */
    public BooleanProperty getBooleanProperty(final String name) {
    
    
        for (final BooleanProperty p : this.knownProperties) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }
    
}
