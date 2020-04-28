/**
 * TGroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGroupInfo  implements java.io.Serializable {
    private int iId;

    private int iLevel;

    private java.lang.String sCode;

    private java.lang.String sDescription;

    private java.util.Date dFirstGameDate;

    private java.util.Date dLastGameDate;

    public TGroupInfo() {
    }

    public TGroupInfo(
           int iId,
           int iLevel,
           java.lang.String sCode,
           java.lang.String sDescription,
           java.util.Date dFirstGameDate,
           java.util.Date dLastGameDate) {
           this.iId = iId;
           this.iLevel = iLevel;
           this.sCode = sCode;
           this.sDescription = sDescription;
           this.dFirstGameDate = dFirstGameDate;
           this.dLastGameDate = dLastGameDate;
    }


    /**
     * Gets the iId value for this TGroupInfo.
     * 
     * @return iId
     */
    public int getIId() {
        return iId;
    }


    /**
     * Sets the iId value for this TGroupInfo.
     * 
     * @param iId
     */
    public void setIId(int iId) {
        this.iId = iId;
    }


    /**
     * Gets the iLevel value for this TGroupInfo.
     * 
     * @return iLevel
     */
    public int getILevel() {
        return iLevel;
    }


    /**
     * Sets the iLevel value for this TGroupInfo.
     * 
     * @param iLevel
     */
    public void setILevel(int iLevel) {
        this.iLevel = iLevel;
    }


    /**
     * Gets the sCode value for this TGroupInfo.
     * 
     * @return sCode
     */
    public java.lang.String getSCode() {
        return sCode;
    }


    /**
     * Sets the sCode value for this TGroupInfo.
     * 
     * @param sCode
     */
    public void setSCode(java.lang.String sCode) {
        this.sCode = sCode;
    }


    /**
     * Gets the sDescription value for this TGroupInfo.
     * 
     * @return sDescription
     */
    public java.lang.String getSDescription() {
        return sDescription;
    }


    /**
     * Sets the sDescription value for this TGroupInfo.
     * 
     * @param sDescription
     */
    public void setSDescription(java.lang.String sDescription) {
        this.sDescription = sDescription;
    }


    /**
     * Gets the dFirstGameDate value for this TGroupInfo.
     * 
     * @return dFirstGameDate
     */
    public java.util.Date getDFirstGameDate() {
        return dFirstGameDate;
    }


    /**
     * Sets the dFirstGameDate value for this TGroupInfo.
     * 
     * @param dFirstGameDate
     */
    public void setDFirstGameDate(java.util.Date dFirstGameDate) {
        this.dFirstGameDate = dFirstGameDate;
    }


    /**
     * Gets the dLastGameDate value for this TGroupInfo.
     * 
     * @return dLastGameDate
     */
    public java.util.Date getDLastGameDate() {
        return dLastGameDate;
    }


    /**
     * Sets the dLastGameDate value for this TGroupInfo.
     * 
     * @param dLastGameDate
     */
    public void setDLastGameDate(java.util.Date dLastGameDate) {
        this.dLastGameDate = dLastGameDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGroupInfo)) return false;
        TGroupInfo other = (TGroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iId == other.getIId() &&
            this.iLevel == other.getILevel() &&
            ((this.sCode==null && other.getSCode()==null) || 
             (this.sCode!=null &&
              this.sCode.equals(other.getSCode()))) &&
            ((this.sDescription==null && other.getSDescription()==null) || 
             (this.sDescription!=null &&
              this.sDescription.equals(other.getSDescription()))) &&
            ((this.dFirstGameDate==null && other.getDFirstGameDate()==null) || 
             (this.dFirstGameDate!=null &&
              this.dFirstGameDate.equals(other.getDFirstGameDate()))) &&
            ((this.dLastGameDate==null && other.getDLastGameDate()==null) || 
             (this.dLastGameDate!=null &&
              this.dLastGameDate.equals(other.getDLastGameDate())));
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
        _hashCode += getILevel();
        if (getSCode() != null) {
            _hashCode += getSCode().hashCode();
        }
        if (getSDescription() != null) {
            _hashCode += getSDescription().hashCode();
        }
        if (getDFirstGameDate() != null) {
            _hashCode += getDFirstGameDate().hashCode();
        }
        if (getDLastGameDate() != null) {
            _hashCode += getDLastGameDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFirstGameDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "dFirstGameDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DLastGameDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "dLastGameDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
