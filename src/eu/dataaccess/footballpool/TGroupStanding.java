/**
 * TGroupStanding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGroupStanding  implements java.io.Serializable {
    private int iTeamId;

    private java.lang.String sTeamName;

    private int iPlayed;

    private int iWon;

    private int iDraw;

    private int iLost;

    private int iGoalsFor;

    private int iGoalsAgainst;

    private int iPlusMin;

    private int iPoints;

    public TGroupStanding() {
    }

    public TGroupStanding(
           int iTeamId,
           java.lang.String sTeamName,
           int iPlayed,
           int iWon,
           int iDraw,
           int iLost,
           int iGoalsFor,
           int iGoalsAgainst,
           int iPlusMin,
           int iPoints) {
           this.iTeamId = iTeamId;
           this.sTeamName = sTeamName;
           this.iPlayed = iPlayed;
           this.iWon = iWon;
           this.iDraw = iDraw;
           this.iLost = iLost;
           this.iGoalsFor = iGoalsFor;
           this.iGoalsAgainst = iGoalsAgainst;
           this.iPlusMin = iPlusMin;
           this.iPoints = iPoints;
    }


    /**
     * Gets the iTeamId value for this TGroupStanding.
     * 
     * @return iTeamId
     */
    public int getITeamId() {
        return iTeamId;
    }


    /**
     * Sets the iTeamId value for this TGroupStanding.
     * 
     * @param iTeamId
     */
    public void setITeamId(int iTeamId) {
        this.iTeamId = iTeamId;
    }


    /**
     * Gets the sTeamName value for this TGroupStanding.
     * 
     * @return sTeamName
     */
    public java.lang.String getSTeamName() {
        return sTeamName;
    }


    /**
     * Sets the sTeamName value for this TGroupStanding.
     * 
     * @param sTeamName
     */
    public void setSTeamName(java.lang.String sTeamName) {
        this.sTeamName = sTeamName;
    }


    /**
     * Gets the iPlayed value for this TGroupStanding.
     * 
     * @return iPlayed
     */
    public int getIPlayed() {
        return iPlayed;
    }


    /**
     * Sets the iPlayed value for this TGroupStanding.
     * 
     * @param iPlayed
     */
    public void setIPlayed(int iPlayed) {
        this.iPlayed = iPlayed;
    }


    /**
     * Gets the iWon value for this TGroupStanding.
     * 
     * @return iWon
     */
    public int getIWon() {
        return iWon;
    }


    /**
     * Sets the iWon value for this TGroupStanding.
     * 
     * @param iWon
     */
    public void setIWon(int iWon) {
        this.iWon = iWon;
    }


    /**
     * Gets the iDraw value for this TGroupStanding.
     * 
     * @return iDraw
     */
    public int getIDraw() {
        return iDraw;
    }


    /**
     * Sets the iDraw value for this TGroupStanding.
     * 
     * @param iDraw
     */
    public void setIDraw(int iDraw) {
        this.iDraw = iDraw;
    }


    /**
     * Gets the iLost value for this TGroupStanding.
     * 
     * @return iLost
     */
    public int getILost() {
        return iLost;
    }


    /**
     * Sets the iLost value for this TGroupStanding.
     * 
     * @param iLost
     */
    public void setILost(int iLost) {
        this.iLost = iLost;
    }


    /**
     * Gets the iGoalsFor value for this TGroupStanding.
     * 
     * @return iGoalsFor
     */
    public int getIGoalsFor() {
        return iGoalsFor;
    }


    /**
     * Sets the iGoalsFor value for this TGroupStanding.
     * 
     * @param iGoalsFor
     */
    public void setIGoalsFor(int iGoalsFor) {
        this.iGoalsFor = iGoalsFor;
    }


    /**
     * Gets the iGoalsAgainst value for this TGroupStanding.
     * 
     * @return iGoalsAgainst
     */
    public int getIGoalsAgainst() {
        return iGoalsAgainst;
    }


    /**
     * Sets the iGoalsAgainst value for this TGroupStanding.
     * 
     * @param iGoalsAgainst
     */
    public void setIGoalsAgainst(int iGoalsAgainst) {
        this.iGoalsAgainst = iGoalsAgainst;
    }


    /**
     * Gets the iPlusMin value for this TGroupStanding.
     * 
     * @return iPlusMin
     */
    public int getIPlusMin() {
        return iPlusMin;
    }


    /**
     * Sets the iPlusMin value for this TGroupStanding.
     * 
     * @param iPlusMin
     */
    public void setIPlusMin(int iPlusMin) {
        this.iPlusMin = iPlusMin;
    }


    /**
     * Gets the iPoints value for this TGroupStanding.
     * 
     * @return iPoints
     */
    public int getIPoints() {
        return iPoints;
    }


    /**
     * Sets the iPoints value for this TGroupStanding.
     * 
     * @param iPoints
     */
    public void setIPoints(int iPoints) {
        this.iPoints = iPoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGroupStanding)) return false;
        TGroupStanding other = (TGroupStanding) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iTeamId == other.getITeamId() &&
            ((this.sTeamName==null && other.getSTeamName()==null) || 
             (this.sTeamName!=null &&
              this.sTeamName.equals(other.getSTeamName()))) &&
            this.iPlayed == other.getIPlayed() &&
            this.iWon == other.getIWon() &&
            this.iDraw == other.getIDraw() &&
            this.iLost == other.getILost() &&
            this.iGoalsFor == other.getIGoalsFor() &&
            this.iGoalsAgainst == other.getIGoalsAgainst() &&
            this.iPlusMin == other.getIPlusMin() &&
            this.iPoints == other.getIPoints();
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
        _hashCode += getITeamId();
        if (getSTeamName() != null) {
            _hashCode += getSTeamName().hashCode();
        }
        _hashCode += getIPlayed();
        _hashCode += getIWon();
        _hashCode += getIDraw();
        _hashCode += getILost();
        _hashCode += getIGoalsFor();
        _hashCode += getIGoalsAgainst();
        _hashCode += getIPlusMin();
        _hashCode += getIPoints();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGroupStanding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupStanding"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITeamId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iTeamId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeamName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeamName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPlayed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iPlayed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IWon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iWon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDraw");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iDraw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iLost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGoalsFor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGoalsFor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGoalsAgainst");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGoalsAgainst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPlusMin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iPlusMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iPoints"));
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
