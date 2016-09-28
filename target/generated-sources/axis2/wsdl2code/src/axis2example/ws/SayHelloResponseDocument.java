/*
 * An XML document type.
 * Localname: sayHelloResponse
 * Namespace: http://ws.axis2Example
 * Java type: axis2example.ws.SayHelloResponseDocument
 *
 * Automatically generated - do not modify.
 */
package axis2example.ws;


/**
 * A document containing one sayHelloResponse(@http://ws.axis2Example) element.
 *
 * This is a complex type.
 */
public interface SayHelloResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SayHelloResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s13670D36A0F32F4786C354FC96C39E38").resolveHandle("sayhelloresponse6498doctype");
    
    /**
     * Gets the "sayHelloResponse" element
     */
    axis2example.ws.SayHelloResponseDocument.SayHelloResponse getSayHelloResponse();
    
    /**
     * Sets the "sayHelloResponse" element
     */
    void setSayHelloResponse(axis2example.ws.SayHelloResponseDocument.SayHelloResponse sayHelloResponse);
    
    /**
     * Appends and returns a new empty "sayHelloResponse" element
     */
    axis2example.ws.SayHelloResponseDocument.SayHelloResponse addNewSayHelloResponse();
    
    /**
     * An XML sayHelloResponse(@http://ws.axis2Example).
     *
     * This is a complex type.
     */
    public interface SayHelloResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SayHelloResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s13670D36A0F32F4786C354FC96C39E38").resolveHandle("sayhelloresponsef93celemtype");
        
        /**
         * Gets the "return" element
         */
        java.lang.String getReturn();
        
        /**
         * Gets (as xml) the "return" element
         */
        org.apache.xmlbeans.XmlString xgetReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * True if has "return" element
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(java.lang.String xreturn);
        
        /**
         * Sets (as xml) the "return" element
         */
        void xsetReturn(org.apache.xmlbeans.XmlString xreturn);
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * Unsets the "return" element
         */
        void unsetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static axis2example.ws.SayHelloResponseDocument.SayHelloResponse newInstance() {
              return (axis2example.ws.SayHelloResponseDocument.SayHelloResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static axis2example.ws.SayHelloResponseDocument.SayHelloResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (axis2example.ws.SayHelloResponseDocument.SayHelloResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static axis2example.ws.SayHelloResponseDocument newInstance() {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static axis2example.ws.SayHelloResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static axis2example.ws.SayHelloResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static axis2example.ws.SayHelloResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static axis2example.ws.SayHelloResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static axis2example.ws.SayHelloResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static axis2example.ws.SayHelloResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (axis2example.ws.SayHelloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
