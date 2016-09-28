/*
 * An XML document type.
 * Localname: sayHelloResponse
 * Namespace: http://ws.axis2Example
 * Java type: axis2example.ws.SayHelloResponseDocument
 *
 * Automatically generated - do not modify.
 */
package axis2example.ws.impl;
/**
 * A document containing one sayHelloResponse(@http://ws.axis2Example) element.
 *
 * This is a complex type.
 */
public class SayHelloResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements axis2example.ws.SayHelloResponseDocument
{
    
    public SayHelloResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAYHELLORESPONSE$0 = 
        new javax.xml.namespace.QName("http://ws.axis2Example", "sayHelloResponse");
    
    
    /**
     * Gets the "sayHelloResponse" element
     */
    public axis2example.ws.SayHelloResponseDocument.SayHelloResponse getSayHelloResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            axis2example.ws.SayHelloResponseDocument.SayHelloResponse target = null;
            target = (axis2example.ws.SayHelloResponseDocument.SayHelloResponse)get_store().find_element_user(SAYHELLORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sayHelloResponse" element
     */
    public void setSayHelloResponse(axis2example.ws.SayHelloResponseDocument.SayHelloResponse sayHelloResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            axis2example.ws.SayHelloResponseDocument.SayHelloResponse target = null;
            target = (axis2example.ws.SayHelloResponseDocument.SayHelloResponse)get_store().find_element_user(SAYHELLORESPONSE$0, 0);
            if (target == null)
            {
                target = (axis2example.ws.SayHelloResponseDocument.SayHelloResponse)get_store().add_element_user(SAYHELLORESPONSE$0);
            }
            target.set(sayHelloResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "sayHelloResponse" element
     */
    public axis2example.ws.SayHelloResponseDocument.SayHelloResponse addNewSayHelloResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            axis2example.ws.SayHelloResponseDocument.SayHelloResponse target = null;
            target = (axis2example.ws.SayHelloResponseDocument.SayHelloResponse)get_store().add_element_user(SAYHELLORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML sayHelloResponse(@http://ws.axis2Example).
     *
     * This is a complex type.
     */
    public static class SayHelloResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements axis2example.ws.SayHelloResponseDocument.SayHelloResponse
    {
        
        public SayHelloResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://ws.axis2Example", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
