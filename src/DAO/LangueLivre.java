/**
 * LangueLivre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class LangueLivre  implements java.io.Serializable {
    private java.lang.Long idLangueLivre;

    private java.lang.String nomLangueLivre;

    public LangueLivre() {
    }

    public LangueLivre(
           java.lang.Long idLangueLivre,
           java.lang.String nomLangueLivre) {
           this.idLangueLivre = idLangueLivre;
           this.nomLangueLivre = nomLangueLivre;
    }


    /**
     * Gets the idLangueLivre value for this LangueLivre.
     * 
     * @return idLangueLivre
     */
    public java.lang.Long getIdLangueLivre() {
        return idLangueLivre;
    }


    /**
     * Sets the idLangueLivre value for this LangueLivre.
     * 
     * @param idLangueLivre
     */
    public void setIdLangueLivre(java.lang.Long idLangueLivre) {
        this.idLangueLivre = idLangueLivre;
    }


    /**
     * Gets the nomLangueLivre value for this LangueLivre.
     * 
     * @return nomLangueLivre
     */
    public java.lang.String getNomLangueLivre() {
        return nomLangueLivre;
    }


    /**
     * Sets the nomLangueLivre value for this LangueLivre.
     * 
     * @param nomLangueLivre
     */
    public void setNomLangueLivre(java.lang.String nomLangueLivre) {
        this.nomLangueLivre = nomLangueLivre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LangueLivre)) return false;
        LangueLivre other = (LangueLivre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idLangueLivre==null && other.getIdLangueLivre()==null) || 
             (this.idLangueLivre!=null &&
              this.idLangueLivre.equals(other.getIdLangueLivre()))) &&
            ((this.nomLangueLivre==null && other.getNomLangueLivre()==null) || 
             (this.nomLangueLivre!=null &&
              this.nomLangueLivre.equals(other.getNomLangueLivre())));
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
        if (getIdLangueLivre() != null) {
            _hashCode += getIdLangueLivre().hashCode();
        }
        if (getNomLangueLivre() != null) {
            _hashCode += getNomLangueLivre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LangueLivre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO/", "langueLivre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idLangueLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idLangueLivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomLangueLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomLangueLivre"));
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
