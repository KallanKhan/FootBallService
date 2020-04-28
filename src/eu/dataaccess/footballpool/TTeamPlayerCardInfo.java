/**
 * TTeamPlayerCardInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TTeamPlayerCardInfo  implements java.io.Serializable {
    private int iID;

    private java.lang.String sName;

    private int iYellowCards;

    private int iRedCards;

    public TTeamPlayerCardInfo() {
    }

    public TTeamPlayerCardInfo(
           int iID,
           java.lang.String sName,
           int iYellowCards,
           int iRedCards) {
           this.iID = iID;
           this.sName = sName;
           this.iYellowCards = iYellowCards;
           this.iRedCards = iRedCards;
    }


    /**
     * Gets the iID value for this TTeamPlayerCardInfo.
     * 
     * @return iID
     */
    public int getIID() {
        return iID;
    }


    /**
     * Sets the iID value for this TTeamPlayerCardInfo.
     * 
     * @param iID
     */
    public void setIID(int iID) {
        this.iID = iID;
    }


    /**
     * Gets the sName value for this TTeamPlayerCardInfo.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TTeamPlayerCardInfo.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the iYellowCards value for this TTeamPlayerCardInfo.
     * 
     * @return iYellowCards
     */
    public int getIYellowCards() {
        return iYellowCards;
    }


    /**
     * Sets the iYellowCards value for this TTeamPlayerCardInfo.
     * 
     * @param iYellowCards
     */
    public void setIYellowCards(int iYellowCards) {
        this.iYellowCards = iYellowCards;
    }


    /**
     * Gets the iRedCards value for this TTeamPlayerCardInfo.
     * 
     * @return iRedCards
     */
    public int getIRedCards() {
        return iRedCards;
    }


    /**
     * Sets the iRedCards value for this TTeamPlayerCardInfo.
     * 
     * @param iRedCards
     */
    public void setIRedCards(int iRedCards) {
        this.iRedCards = iRedCards;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTeamPlayerCardInfo)) return false;
        TTeamPlayerCardInfo other = (TTeamPlayerCardInfo) obj;
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
            this.iYellowCards == other.getIYellowCards() &&
            this.iRedCards == other.getIRedCards();
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
        _hashCode += getIYellowCards();
        _hashCode += getIRedCards();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTeamPlayerCardInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardInfo"));
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
        elemField.setFieldName("IYellowCards");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iYellowCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRedCards");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iRedCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
