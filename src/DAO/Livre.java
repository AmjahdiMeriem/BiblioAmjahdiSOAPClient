/**
 * Livre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class Livre  implements java.io.Serializable {
    private int annee;

    private java.lang.String auteur;

    private java.lang.String description;

    private java.lang.String editeur;

    private java.lang.Long ISBN;

    private java.lang.Long idGenreLivre;

    private java.lang.Long idLangueLivre;

    private int prix;

    private java.lang.String titre;

    private java.lang.String urlImage;

    public Livre() {
    }

    public Livre(
           int annee,
           java.lang.String auteur,
           java.lang.String description,
           java.lang.String editeur,
           java.lang.Long ISBN,
           java.lang.Long idGenreLivre,
           java.lang.Long idLangueLivre,
           int prix,
           java.lang.String titre,
           java.lang.String urlImage) {
           this.annee = annee;
           this.auteur = auteur;
           this.description = description;
           this.editeur = editeur;
           this.ISBN = ISBN;
           this.idGenreLivre = idGenreLivre;
           this.idLangueLivre = idLangueLivre;
           this.prix = prix;
           this.titre = titre;
           this.urlImage = urlImage;
    }


    /**
     * Gets the annee value for this Livre.
     * 
     * @return annee
     */
    public int getAnnee() {
        return annee;
    }


    /**
     * Sets the annee value for this Livre.
     * 
     * @param annee
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }


    /**
     * Gets the auteur value for this Livre.
     * 
     * @return auteur
     */
    public java.lang.String getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this Livre.
     * 
     * @param auteur
     */
    public void setAuteur(java.lang.String auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the description value for this Livre.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Livre.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the editeur value for this Livre.
     * 
     * @return editeur
     */
    public java.lang.String getEditeur() {
        return editeur;
    }


    /**
     * Sets the editeur value for this Livre.
     * 
     * @param editeur
     */
    public void setEditeur(java.lang.String editeur) {
        this.editeur = editeur;
    }


    /**
     * Gets the ISBN value for this Livre.
     * 
     * @return ISBN
     */
    public java.lang.Long getISBN() {
        return ISBN;
    }


    /**
     * Sets the ISBN value for this Livre.
     * 
     * @param ISBN
     */
    public void setISBN(java.lang.Long ISBN) {
        this.ISBN = ISBN;
    }


    /**
     * Gets the idGenreLivre value for this Livre.
     * 
     * @return idGenreLivre
     */
    public java.lang.Long getIdGenreLivre() {
        return idGenreLivre;
    }


    /**
     * Sets the idGenreLivre value for this Livre.
     * 
     * @param idGenreLivre
     */
    public void setIdGenreLivre(java.lang.Long idGenreLivre) {
        this.idGenreLivre = idGenreLivre;
    }


    /**
     * Gets the idLangueLivre value for this Livre.
     * 
     * @return idLangueLivre
     */
    public java.lang.Long getIdLangueLivre() {
        return idLangueLivre;
    }


    /**
     * Sets the idLangueLivre value for this Livre.
     * 
     * @param idLangueLivre
     */
    public void setIdLangueLivre(java.lang.Long idLangueLivre) {
        this.idLangueLivre = idLangueLivre;
    }


    /**
     * Gets the prix value for this Livre.
     * 
     * @return prix
     */
    public int getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this Livre.
     * 
     * @param prix
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }


    /**
     * Gets the titre value for this Livre.
     * 
     * @return titre
     */
    public java.lang.String getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this Livre.
     * 
     * @param titre
     */
    public void setTitre(java.lang.String titre) {
        this.titre = titre;
    }


    /**
     * Gets the urlImage value for this Livre.
     * 
     * @return urlImage
     */
    public java.lang.String getUrlImage() {
        return urlImage;
    }


    /**
     * Sets the urlImage value for this Livre.
     * 
     * @param urlImage
     */
    public void setUrlImage(java.lang.String urlImage) {
        this.urlImage = urlImage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Livre)) return false;
        Livre other = (Livre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.annee == other.getAnnee() &&
            ((this.auteur==null && other.getAuteur()==null) || 
             (this.auteur!=null &&
              this.auteur.equals(other.getAuteur()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.editeur==null && other.getEditeur()==null) || 
             (this.editeur!=null &&
              this.editeur.equals(other.getEditeur()))) &&
            ((this.ISBN==null && other.getISBN()==null) || 
             (this.ISBN!=null &&
              this.ISBN.equals(other.getISBN()))) &&
            ((this.idGenreLivre==null && other.getIdGenreLivre()==null) || 
             (this.idGenreLivre!=null &&
              this.idGenreLivre.equals(other.getIdGenreLivre()))) &&
            ((this.idLangueLivre==null && other.getIdLangueLivre()==null) || 
             (this.idLangueLivre!=null &&
              this.idLangueLivre.equals(other.getIdLangueLivre()))) &&
            this.prix == other.getPrix() &&
            ((this.titre==null && other.getTitre()==null) || 
             (this.titre!=null &&
              this.titre.equals(other.getTitre()))) &&
            ((this.urlImage==null && other.getUrlImage()==null) || 
             (this.urlImage!=null &&
              this.urlImage.equals(other.getUrlImage())));
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
        _hashCode += getAnnee();
        if (getAuteur() != null) {
            _hashCode += getAuteur().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEditeur() != null) {
            _hashCode += getEditeur().hashCode();
        }
        if (getISBN() != null) {
            _hashCode += getISBN().hashCode();
        }
        if (getIdGenreLivre() != null) {
            _hashCode += getIdGenreLivre().hashCode();
        }
        if (getIdLangueLivre() != null) {
            _hashCode += getIdLangueLivre().hashCode();
        }
        _hashCode += getPrix();
        if (getTitre() != null) {
            _hashCode += getTitre().hashCode();
        }
        if (getUrlImage() != null) {
            _hashCode += getUrlImage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Livre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://DAO/", "livre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editeur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editeur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISBN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ISBN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idGenreLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idGenreLivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idLangueLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idLangueLivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlImage"));
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
