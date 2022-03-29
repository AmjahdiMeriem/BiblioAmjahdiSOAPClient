/**
 * GenreLivre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class GenreLivre  implements java.io.Serializable {
    private java.lang.Long idGenreLivre;

    private java.lang.String nomGenreLivre;

    public GenreLivre() {
    }

    public GenreLivre(
           java.lang.Long idGenreLivre,
           java.lang.String nomGenreLivre) {
           this.idGenreLivre = idGenreLivre;
           this.nomGenreLivre = nomGenreLivre;
    }


    /**
     * Gets the idGenreLivre value for this GenreLivre.
     * 
     * @return idGenreLivre
     */
    public java.lang.Long getIdGenreLivre() {
        return idGenreLivre;
    }


    /**
     * Sets the idGenreLivre value for this GenreLivre.
     * 
     * @param idGenreLivre
     */
    public void setIdGenreLivre(java.lang.Long idGenreLivre) {
        this.idGenreLivre = idGenreLivre;
    }


    /**
     * Gets the nomGenreLivre value for this GenreLivre.
     * 
     * @return nomGenreLivre
     */
    public java.lang.String getNomGenreLivre() {
        return nomGenreLivre;
    }


    /**
     * Sets the nomGenreLivre value for this GenreLivre.
     * 
     * @param nomGenreLivre
     */
    public void setNomGenreLivre(java.lang.String nomGenreLivre) {
        this.nomGenreLivre = nomGenreLivre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenreLivre)) return false;
        GenreLivre other = (GenreLivre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idGenreLivre==null && other.getIdGenreLivre()==null) || 
             (this.idGenreLivre!=null &&
              this.idGenreLivre.equals(other.getIdGenreLivre()))) &&
            ((this.nomGenreLivre==null && other.getNomGenreLivre()==null) || 
             (this.nomGenreLivre!=null &&
              this.nomGenreLivre.equals(other.getNomGenreLivre())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdGenreLivre() != null) {
            _hashCode += getIdGenreLivre().hashCode();
        }
        if (getNomGenreLivre() != null) {
            _hashCode += getNomGenreLivre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenreLivre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO/", "genreLivre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idGenreLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idGenreLivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomGenreLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomGenreLivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
