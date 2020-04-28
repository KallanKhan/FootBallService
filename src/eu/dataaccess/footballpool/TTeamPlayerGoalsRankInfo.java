/**
 * TTeamPlayerGoalsRankInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TTeamPlayerGoalsRankInfo  implements java.io.Serializable {
    private int iRank;

    private int iID;

    private java.lang.String sName;

    private int iGoals;

    public TTeamPlayerGoalsRankInfo() {
    }

    public TTeamPlayerGoalsRankInfo(
           int iRank,
           int iID,
           java.lang.String sName,
           int iGoals) {
           this.iRank = iRank;
           this.iID = iID;
           this.sName = sName;
           this.iGoals = iGoals;
    }


    /**
     * Gets the iRank value for this TTeamPlayerGoalsRankInfo.
     * 
     * @return iRank
     */
    public int getIRank() {
        return iRank;
    }


    /**
     * Sets the iRank value for this TTeamPlayerGoalsRankInfo.
     * 
     * @param iRank
     */
    public void setIRank(int iRank) {
        this.iRank = iRank;
    }


    /**
     * Gets the iID value for this TTeamPlayerGoalsRankInfo.
     * 
     * @return iID
     */
    public int getIID() {
        return iID;
    }


    /**
     * Sets the iID value for this TTeamPlayerGoalsRankInfo.
     * 
     * @param iID
     */
    public void setIID(int iID) {
        this.iID = iID;
    }


    /**
     * Gets the sName value for this TTeamPlayerGoalsRankInfo.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TTeamPlayerGoalsRankInfo.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the iGoals value for this TTeamPlayerGoalsRankInfo.
     * 
     * @return iGoals
     */
    public int getIGoals() {
        return iGoals;
    }


    /**
     * Sets the iGoals value for this TTeamPlayerGoalsRankInfo.
     * 
     * @param iGoals
     */
    public void setIGoals(int iGoals) {
        this.iGoals = iGoals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTeamPlayerGoalsRankInfo)) return false;
        TTeamPlayerGoalsRankInfo other = (TTeamPlayerGoalsRankInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iRank == other.getIRank() &&
            this.iID == other.getIID() &&
            ((this.sName==null && other.getSName()==null) || 
             (this.sName!=null &&
              this.sName.equals(other.getSName()))) &&
            this.iGoals == other.getIGoals();
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
        _hashCode += getIRank();
        _hashCode += getIID();
        if (getSName() != null) {
            _hashCode += getSName().hashCode();
        }
        _hashCode += getIGoals();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTeamPlayerGoalsRankInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerGoalsRankInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRank");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iRank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("IGoals");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGoals"));
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
