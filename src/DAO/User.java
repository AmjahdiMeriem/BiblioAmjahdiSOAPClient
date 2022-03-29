/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class User  implements java.io.Serializable {
    private java.lang.String emailUser;

    private java.lang.Long idRoleUser;

    private java.lang.Long idUser;

    private java.lang.String nameUser;

    private java.lang.String passwordUser;

    public User() {
    }

    public User(
           java.lang.String emailUser,
           java.lang.Long idRoleUser,
           java.lang.Long idUser,
           java.lang.String nameUser,
           java.lang.String passwordUser) {
           this.emailUser = emailUser;
           this.idRoleUser = idRoleUser;
           this.idUser = idUser;
           this.nameUser = nameUser;
           this.passwordUser = passwordUser;
    }


    /**
     * Gets the emailUser value for this User.
     * 
     * @return emailUser
     */
    public java.lang.String getEmailUser() {
        return emailUser;
    }


    /**
     * Sets the emailUser value for this User.
     * 
     * @param emailUser
     */
    public void setEmailUser(java.lang.String emailUser) {
        this.emailUser = emailUser;
    }


    /**
     * Gets the idRoleUser value for this User.
     * 
     * @return idRoleUser
     */
    public java.lang.Long getIdRoleUser() {
        return idRoleUser;
    }


    /**
     * Sets the idRoleUser value for this User.
     * 
     * @param idRoleUser
     */
    public void setIdRoleUser(java.lang.Long idRoleUser) {
        this.idRoleUser = idRoleUser;
    }


    /**
     * Gets the idUser value for this User.
     * 
     * @return idUser
     */
    public java.lang.Long getIdUser() {
        return idUser;
    }


    /**
     * Sets the idUser value for this User.
     * 
     * @param idUser
     */
    public void setIdUser(java.lang.Long idUser) {
        this.idUser = idUser;
    }


    /**
     * Gets the nameUser value for this User.
     * 
     * @return nameUser
     */
    public java.lang.String getNameUser() {
        return nameUser;
    }


    /**
     * Sets the nameUser value for this User.
     * 
     * @param nameUser
     */
    public void setNameUser(java.lang.String nameUser) {
        this.nameUser = nameUser;
    }


    /**
     * Gets the passwordUser value for this User.
     * 
     * @return passwordUser
     */
    public java.lang.String getPasswordUser() {
        return passwordUser;
    }


    /**
     * Sets the passwordUser value for this User.
     * 
     * @param passwordUser
     */
    public void setPasswordUser(java.lang.String passwordUser) {
        this.passwordUser = passwordUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailUser==null && other.getEmailUser()==null) || 
             (this.emailUser!=null &&
              this.emailUser.equals(other.getEmailUser()))) &&
            ((this.idRoleUser==null && other.getIdRoleUser()==null) || 
             (this.idRoleUser!=null &&
              this.idRoleUser.equals(other.getIdRoleUser()))) &&
            ((this.idUser==null && other.getIdUser()==null) || 
             (this.idUser!=null &&
              this.idUser.equals(other.getIdUser()))) &&
            ((this.nameUser==null && other.getNameUser()==null) || 
             (this.nameUser!=null &&
              this.nameUser.equals(other.getNameUser()))) &&
            ((this.passwordUser==null && other.getPasswordUser()==null) || 
             (this.passwordUser!=null &&
              this.passwordUser.equals(other.getPasswordUser())));
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
        if (getEmailUser() != null) {
            _hashCode += getEmailUser().hashCode();
        }
        if (getIdRoleUser() != null) {
            _hashCode += getIdRoleUser().hashCode();
        }
        if (getIdUser() != null) {
            _hashCode += getIdUser().hashCode();
        }
        if (getNameUser() != null) {
            _hashCode += getNameUser().hashCode();
        }
        if (getPasswordUser() != null) {
            _hashCode += getPasswordUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO/", "user"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRoleUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRoleUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordUser"));
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
