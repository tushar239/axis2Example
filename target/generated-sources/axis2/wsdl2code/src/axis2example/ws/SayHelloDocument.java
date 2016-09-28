/*
 * An XML document type.
 * Localname: sayHello
 * Namespace: http://ws.axis2Example
 * Java type: axis2example.ws.SayHelloDocument
 *
 * Automatically generated - do not modify.
 */
package axis2example.ws;


/**
 * A document containing one sayHello(@http://ws.axis2Example) element.
 *
 * This is a complex type.
 */
public interface SayHelloDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SayHelloDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s13670D36A0F32F4786C354FC96C39E38").resolveHandle("sayhello9a19doctype");
    
    /**
     * Gets the "sayHello" element
     */
    axis2example.ws.SayHelloDocument.SayHello getSayHello();
    
    /**
     * Sets the "sayHello" element
     */
    void setSayHello(axis2example.ws.SayHelloDocument.SayHello sayHello);
    
    /**
     * Appends and returns a new empty "sayHello" element
     */
    axis2example.ws.SayHelloDocument.SayHello addNewSayHello();
    
    /**
     * An XML sayHello(@http://ws.axis2Example).
     *
     * This is a complex type.
     */
    public interface SayHello extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SayHello.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s13670D36A0F32F4786C354FC96C39E38").resolveHandle("sayhelloe19celemtype");
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Tests for nil "name" element
         */
        boolean isNilName();
        
        /**
         * True if has "name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Nils the "name" element
         */
        void setNilName();
        
        /**
         * Unsets the "name" element
         */
        void unsetName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static axis2example.ws.SayHelloDocument.SayHello newInstance() {
              return (axis2example.ws.SayHelloDocument.SayHello) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static axis2example.ws.SayHelloDocument.SayHello newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (axis2example.ws.SayHelloDocument.SayHello) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static axis2example.ws.SayHelloDocument newInstance() {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static axis2example.ws.SayHelloDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static axis2example.ws.SayHelloDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static axis2example.ws.SayHelloDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static axis2example.ws.SayHelloDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static axis2example.ws.SayHelloDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static axis2example.ws.SayHelloDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static axis2example.ws.SayHelloDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static axis2example.ws.SayHelloDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static axis2example.ws.SayHelloDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static axis2example.ws.SayHelloDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static axis2example.ws.SayHelloDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static axis2example.ws.SayHelloDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static axis2example.ws.SayHelloDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static axis2example.ws.SayHelloDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static axis2example.ws.SayHelloDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static axis2example.ws.SayHelloDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static axis2example.ws.SayHelloDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (axis2example.ws.SayHelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
