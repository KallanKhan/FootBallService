/**
 * TPlayer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TPlayer  implements java.io.Serializable {
    private int iId;

    private java.lang.String sName;

    private java.lang.String sFullName;

    private java.lang.String sFirstName;

    private java.lang.String sLastName;

    public TPlayer() {
    }

    public TPlayer(
           int iId,
           java.lang.String sName,
           java.lang.String sFullName,
           java.lang.String sFirstName,
           java.lang.String sLastName) {
           this.iId = iId;
           this.sName = sName;
           this.sFullName = sFullName;
           this.sFirstName = sFirstName;
           this.sLastName = sLastName;
    }


    /**
     * Gets the iId value for this TPlayer.
     * 
     * @return iId
     */
    public int getIId() {
        return iId;
    }


    /**
     * Sets the iId value for this TPlayer.
     * 
     * @param iId
     */
    public void setIId(int iId) {
        this.iId = iId;
    }


    /**
     * Gets the sName value for this TPlayer.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TPlayer.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the sFullName value for this TPlayer.
     * 
     * @return sFullName
     */
    public java.lang.String getSFullName() {
        return sFullName;
    }


    /**
     * Sets the sFullName value for this TPlayer.
     * 
     * @param sFullName
     */
    public void setSFullName(java.lang.String sFullName) {
        this.sFullName = sFullName;
    }


    /**
     * Gets the sFirstName value for this TPlayer.
     * 
     * @return sFirstName
     */
    public java.lang.String getSFirstName() {
        return sFirstName;
    }


    /**
     * Sets the sFirstName value for this TPlayer.
     * 
     * @param sFirstName
     */
    public void setSFirstName(java.lang.String sFirstName) {
        this.sFirstName = sFirstName;
    }


    /**
     * Gets the sLastName value for this TPlayer.
     * 
     * @return sLastName
     */
    public java.lang.String getSLastName() {
        return sLastName;
    }


    /**
     * Sets the sLastName value for this TPlayer.
     * 
     * @param sLastName
     */
    public void setSLastName(java.lang.String sLastName) {
        this.sLastName = sLastName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPlayer)) return false;
        TPlayer other = (TPlayer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iId == other.getIId() &&
            ((this.sName==null && other.getSName()==null) || 
             (this.sName!=null &&
              this.sName.equals(other.getSName()))) &&
            ((this.sFullName==null && other.getSFullName()==null) || 
             (this.sFullName!=null &&
              this.sFullName.equals(other.getSFullName()))) &&
            ((this.sFirstName==null && other.getSFirstName()==null) || 
             (this.sFirstName!=null &&
              this.sFirstName.equals(other.getSFirstName()))) &&
            ((this.sLastName==null && other.getSLastName()==null) || 
             (this.sLastName!=null &&
              this.sLastName.equals(other.getSLastName())));
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
        _hashCode += getIId();
        if (getSName() != null) {
            _hashCode += getSName().hashCode();
        }
        if (getSFullName() != null) {
            _hashCode += getSFullName().hashCode();
        }
        if (getSFirstName() != null) {
            _hashCode += getSFirstName().hashCode();
        }
        if (getSLastName() != null) {
            _hashCode += getSLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TPlayer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
