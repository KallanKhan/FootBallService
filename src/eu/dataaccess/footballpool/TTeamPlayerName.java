/**
 * TTeamPlayerName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TTeamPlayerName  implements java.io.Serializable {
    private int iID;

    private java.lang.String sName;

    private java.lang.String sTeamName;

    public TTeamPlayerName() {
    }

    public TTeamPlayerName(
           int iID,
           java.lang.String sName,
           java.lang.String sTeamName) {
           this.iID = iID;
           this.sName = sName;
           this.sTeamName = sTeamName;
    }


    /**
     * Gets the iID value for this TTeamPlayerName.
     * 
     * @return iID
     */
    public int getIID() {
        return iID;
    }


    /**
     * Sets the iID value for this TTeamPlayerName.
     * 
     * @param iID
     */
    public void setIID(int iID) {
        this.iID = iID;
    }


    /**
     * Gets the sName value for this TTeamPlayerName.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TTeamPlayerName.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the sTeamName value for this TTeamPlayerName.
     * 
     * @return sTeamName
     */
    public java.lang.String getSTeamName() {
        return sTeamName;
    }


    /**
     * Sets the sTeamName value for this TTeamPlayerName.
     * 
     * @param sTeamName
     */
    public void setSTeamName(java.lang.String sTeamName) {
        this.sTeamName = sTeamName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTeamPlayerName)) return false;
        TTeamPlayerName other = (TTeamPlayerName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iID == other.getIID() &&
            ((this.sName==null && other.getSName()==null) || 
             (this.sName!=null &&
              this.sName.equals(other.getSName()))) &&
            ((this.sTeamName==null && other.getSTeamName()==null) || 
             (this.sTeamName!=null &&
              this.sTeamName.equals(other.getSTeamName())));
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
        _hashCode += getIID();
        if (getSName() != null) {
            _hashCode += getSName().hashCode();
        }
        if (getSTeamName() != null) {
            _hashCode += getSTeamName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTeamPlayerName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iID"));
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
        elemField.setFieldName("STeamName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeamName"));
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
