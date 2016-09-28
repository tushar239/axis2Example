/*
 * An XML document type.
 * Localname: sayHello
 * Namespace: http://ws.axis2Example
 * Java type: axis2example.ws.SayHelloDocument
 *
 * Automatically generated - do not modify.
 */
package axis2example.ws.impl;
/**
 * A document containing one sayHello(@http://ws.axis2Example) element.
 *
 * This is a complex type.
 */
public class SayHelloDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements axis2example.ws.SayHelloDocument
{
    
    public SayHelloDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAYHELLO$0 = 
        new javax.xml.namespace.QName("http://ws.axis2Example", "sayHello");
    
    
    /**
     * Gets the "sayHello" element
     */
    public axis2example.ws.SayHelloDocument.SayHello getSayHello()
    {
        synchronized (monitor())
        {
            check_orphaned();
            axis2example.ws.SayHelloDocument.SayHello target = null;
            target = (axis2example.ws.SayHelloDocument.SayHello)get_store().find_element_user(SAYHELLO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sayHello" element
     */
    public void setSayHello(axis2example.ws.SayHelloDocument.SayHello sayHello)
    {
        synchronized (monitor())
        {
            check_orphaned();
            axis2example.ws.SayHelloDocument.SayHello target = null;
            target = (axis2example.ws.SayHelloDocument.SayHello)get_store().find_element_user(SAYHELLO$0, 0);
            if (target == null)
            {
                target = (axis2example.ws.SayHelloDocument.SayHello)get_store().add_element_user(SAYHELLO$0);
            }
            target.set(sayHello);
        }
    }
    
    /**
     * Appends and returns a new empty "sayHello" element
     */
    public axis2example.ws.SayHelloDocument.SayHello addNewSayHello()
    {
        synchronized (monitor())
        {
            check_orphaned();
            axis2example.ws.SayHelloDocument.SayHello target = null;
            target = (axis2example.ws.SayHelloDocument.SayHello)get_store().add_element_user(SAYHELLO$0);
            return target;
        }
    }
    /**
     * An XML sayHello(@http://ws.axis2Example).
     *
     * This is a complex type.
     */
    public static class SayHelloImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements axis2example.ws.SayHelloDocument.SayHello
    {
        
        public SayHelloImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://ws.axis2Example", "name");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "name" element
         */
        public boolean isNilName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0) != 0;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Nils the "name" element
         */
        public void setNilName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, 0);
            }
        }
    }
}
