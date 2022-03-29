/**
 * RoleUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class RoleUser  implements java.io.Serializable {
    private java.lang.Long idRoleUser;

    private java.lang.String nameRoleUser;

    public RoleUser() {
    }

    public RoleUser(
           java.lang.Long idRoleUser,
           java.lang.String nameRoleUser) {
           this.idRoleUser = idRoleUser;
           this.nameRoleUser = nameRoleUser;
    }


    /**
     * Gets the idRoleUser value for this RoleUser.
     * 
     * @return idRoleUser
     */
    public java.lang.Long getIdRoleUser() {
        return idRoleUser;
    }


    /**
     * Sets the idRoleUser value for this RoleUser.
     * 
     * @param idRoleUser
     */
    public void setIdRoleUser(java.lang.Long idRoleUser) {
        this.idRoleUser = idRoleUser;
    }


    /**
     * Gets the nameRoleUser value for this RoleUser.
     * 
     * @return nameRoleUser
     */
    public java.lang.String getNameRoleUser() {
        return nameRoleUser;
    }


    /**
     * Sets the nameRoleUser value for this RoleUser.
     * 
     * @param nameRoleUser
     */
    public void setNameRoleUser(java.lang.String nameRoleUser) {
        this.nameRoleUser = nameRoleUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoleUser)) return false;
        RoleUser other = (RoleUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idRoleUser==null && other.getIdRoleUser()==null) || 
             (this.idRoleUser!=null &&
              this.idRoleUser.equals(other.getIdRoleUser()))) &&
            ((this.nameRoleUser==null && other.getNameRoleUser()==null) || 
             (this.nameRoleUser!=null &&
              this.nameRoleUser.equals(other.getNameRoleUser())));
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
        if (getIdRoleUser() != null) {
            _hashCode += getIdRoleUser().hashCode();
        }
        if (getNameRoleUser() != null) {
            _hashCode += getNameRoleUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoleUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO/", "roleUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRoleUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRoleUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameRoleUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameRoleUser"));
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
