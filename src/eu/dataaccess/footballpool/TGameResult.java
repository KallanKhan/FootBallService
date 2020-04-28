/**
 * TGameResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGameResult  implements java.io.Serializable {
    private int iGameNumber;

    private java.lang.String sDescription;

    private java.lang.String dtLocalPlayDateTime;

    private java.lang.String dtUTCPlayDateTime;

    private java.lang.String sTeamName1;

    private java.lang.String sTeamName2;

    private int iScoreTeam1;

    private int iScoreTeam2;

    private int iRedCards;

    private int iYellowCards;

    private java.lang.String sGroupCode;

    private boolean bFinished;

    private int iPenaltiesWonTeam1;

    private int iPenaltiesWonTeam2;

    public TGameResult() {
    }

    public TGameResult(
           int iGameNumber,
           java.lang.String sDescription,
           java.lang.String dtLocalPlayDateTime,
           java.lang.String dtUTCPlayDateTime,
           java.lang.String sTeamName1,
           java.lang.String sTeamName2,
           int iScoreTeam1,
           int iScoreTeam2,
           int iRedCards,
           int iYellowCards,
           java.lang.String sGroupCode,
           boolean bFinished,
           int iPenaltiesWonTeam1,
           int iPenaltiesWonTeam2) {
           this.iGameNumber = iGameNumber;
           this.sDescription = sDescription;
           this.dtLocalPlayDateTime = dtLocalPlayDateTime;
           this.dtUTCPlayDateTime = dtUTCPlayDateTime;
           this.sTeamName1 = sTeamName1;
           this.sTeamName2 = sTeamName2;
           this.iScoreTeam1 = iScoreTeam1;
           this.iScoreTeam2 = iScoreTeam2;
           this.iRedCards = iRedCards;
           this.iYellowCards = iYellowCards;
           this.sGroupCode = sGroupCode;
           this.bFinished = bFinished;
           this.iPenaltiesWonTeam1 = iPenaltiesWonTeam1;
           this.iPenaltiesWonTeam2 = iPenaltiesWonTeam2;
    }


    /**
     * Gets the iGameNumber value for this TGameResult.
     * 
     * @return iGameNumber
     */
    public int getIGameNumber() {
        return iGameNumber;
    }


    /**
     * Sets the iGameNumber value for this TGameResult.
     * 
     * @param iGameNumber
     */
    public void setIGameNumber(int iGameNumber) {
        this.iGameNumber = iGameNumber;
    }


    /**
     * Gets the sDescription value for this TGameResult.
     * 
     * @return sDescription
     */
    public java.lang.String getSDescription() {
        return sDescription;
    }


    /**
     * Sets the sDescription value for this TGameResult.
     * 
     * @param sDescription
     */
    public void setSDescription(java.lang.String sDescription) {
        this.sDescription = sDescription;
    }


    /**
     * Gets the dtLocalPlayDateTime value for this TGameResult.
     * 
     * @return dtLocalPlayDateTime
     */
    public java.lang.String getDtLocalPlayDateTime() {
        return dtLocalPlayDateTime;
    }


    /**
     * Sets the dtLocalPlayDateTime value for this TGameResult.
     * 
     * @param dtLocalPlayDateTime
     */
    public void setDtLocalPlayDateTime(java.lang.String dtLocalPlayDateTime) {
        this.dtLocalPlayDateTime = dtLocalPlayDateTime;
    }


    /**
     * Gets the dtUTCPlayDateTime value for this TGameResult.
     * 
     * @return dtUTCPlayDateTime
     */
    public java.lang.String getDtUTCPlayDateTime() {
        return dtUTCPlayDateTime;
    }


    /**
     * Sets the dtUTCPlayDateTime value for this TGameResult.
     * 
     * @param dtUTCPlayDateTime
     */
    public void setDtUTCPlayDateTime(java.lang.String dtUTCPlayDateTime) {
        this.dtUTCPlayDateTime = dtUTCPlayDateTime;
    }


    /**
     * Gets the sTeamName1 value for this TGameResult.
     * 
     * @return sTeamName1
     */
    public java.lang.String getSTeamName1() {
        return sTeamName1;
    }


    /**
     * Sets the sTeamName1 value for this TGameResult.
     * 
     * @param sTeamName1
     */
    public void setSTeamName1(java.lang.String sTeamName1) {
        this.sTeamName1 = sTeamName1;
    }


    /**
     * Gets the sTeamName2 value for this TGameResult.
     * 
     * @return sTeamName2
     */
    public java.lang.String getSTeamName2() {
        return sTeamName2;
    }


    /**
     * Sets the sTeamName2 value for this TGameResult.
     * 
     * @param sTeamName2
     */
    public void setSTeamName2(java.lang.String sTeamName2) {
        this.sTeamName2 = sTeamName2;
    }


    /**
     * Gets the iScoreTeam1 value for this TGameResult.
     * 
     * @return iScoreTeam1
     */
    public int getIScoreTeam1() {
        return iScoreTeam1;
    }


    /**
     * Sets the iScoreTeam1 value for this TGameResult.
     * 
     * @param iScoreTeam1
     */
    public void setIScoreTeam1(int iScoreTeam1) {
        this.iScoreTeam1 = iScoreTeam1;
    }


    /**
     * Gets the iScoreTeam2 value for this TGameResult.
     * 
     * @return iScoreTeam2
     */
    public int getIScoreTeam2() {
        return iScoreTeam2;
    }


    /**
     * Sets the iScoreTeam2 value for this TGameResult.
     * 
     * @param iScoreTeam2
     */
    public void setIScoreTeam2(int iScoreTeam2) {
        this.iScoreTeam2 = iScoreTeam2;
    }


    /**
     * Gets the iRedCards value for this TGameResult.
     * 
     * @return iRedCards
     */
    public int getIRedCards() {
        return iRedCards;
    }


    /**
     * Sets the iRedCards value for this TGameResult.
     * 
     * @param iRedCards
     */
    public void setIRedCards(int iRedCards) {
        this.iRedCards = iRedCards;
    }


    /**
     * Gets the iYellowCards value for this TGameResult.
     * 
     * @return iYellowCards
     */
    public int getIYellowCards() {
        return iYellowCards;
    }


    /**
     * Sets the iYellowCards value for this TGameResult.
     * 
     * @param iYellowCards
     */
    public void setIYellowCards(int iYellowCards) {
        this.iYellowCards = iYellowCards;
    }


    /**
     * Gets the sGroupCode value for this TGameResult.
     * 
     * @return sGroupCode
     */
    public java.lang.String getSGroupCode() {
        return sGroupCode;
    }


    /**
     * Sets the sGroupCode value for this TGameResult.
     * 
     * @param sGroupCode
     */
    public void setSGroupCode(java.lang.String sGroupCode) {
        this.sGroupCode = sGroupCode;
    }


    /**
     * Gets the bFinished value for this TGameResult.
     * 
     * @return bFinished
     */
    public boolean isBFinished() {
        return bFinished;
    }


    /**
     * Sets the bFinished value for this TGameResult.
     * 
     * @param bFinished
     */
    public void setBFinished(boolean bFinished) {
        this.bFinished = bFinished;
    }


    /**
     * Gets the iPenaltiesWonTeam1 value for this TGameResult.
     * 
     * @return iPenaltiesWonTeam1
     */
    public int getIPenaltiesWonTeam1() {
        return iPenaltiesWonTeam1;
    }


    /**
     * Sets the iPenaltiesWonTeam1 value for this TGameResult.
     * 
     * @param iPenaltiesWonTeam1
     */
    public void setIPenaltiesWonTeam1(int iPenaltiesWonTeam1) {
        this.iPenaltiesWonTeam1 = iPenaltiesWonTeam1;
    }


    /**
     * Gets the iPenaltiesWonTeam2 value for this TGameResult.
     * 
     * @return iPenaltiesWonTeam2
     */
    public int getIPenaltiesWonTeam2() {
        return iPenaltiesWonTeam2;
    }


    /**
     * Sets the iPenaltiesWonTeam2 value for this TGameResult.
     * 
     * @param iPenaltiesWonTeam2
     */
    public void setIPenaltiesWonTeam2(int iPenaltiesWonTeam2) {
        this.iPenaltiesWonTeam2 = iPenaltiesWonTeam2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGameResult)) return false;
        TGameResult other = (TGameResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iGameNumber == other.getIGameNumber() &&
            ((this.sDescription==null && other.getSDescription()==null) || 
             (this.sDescription!=null &&
              this.sDescription.equals(other.getSDescription()))) &&
            ((this.dtLocalPlayDateTime==null && other.getDtLocalPlayDateTime()==null) || 
             (this.dtLocalPlayDateTime!=null &&
              this.dtLocalPlayDateTime.equals(other.getDtLocalPlayDateTime()))) &&
            ((this.dtUTCPlayDateTime==null && other.getDtUTCPlayDateTime()==null) || 
             (this.dtUTCPlayDateTime!=null &&
              this.dtUTCPlayDateTime.equals(other.getDtUTCPlayDateTime()))) &&
            ((this.sTeamName1==null && other.getSTeamName1()==null) || 
             (this.sTeamName1!=null &&
              this.sTeamName1.equals(other.getSTeamName1()))) &&
            ((this.sTeamName2==null && other.getSTeamName2()==null) || 
             (this.sTeamName2!=null &&
              this.sTeamName2.equals(other.getSTeamName2()))) &&
            this.iScoreTeam1 == other.getIScoreTeam1() &&
            this.iScoreTeam2 == other.getIScoreTeam2() &&
            this.iRedCards == other.getIRedCards() &&
            this.iYellowCards == other.getIYellowCards() &&
            ((this.sGroupCode==null && other.getSGroupCode()==null) || 
             (this.sGroupCode!=null &&
              this.sGroupCode.equals(other.getSGroupCode()))) &&
            this.bFinished == other.isBFinished() &&
            this.iPenaltiesWonTeam1 == other.getIPenaltiesWonTeam1() &&
            this.iPenaltiesWonTeam2 == other.getIPenaltiesWonTeam2();
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
        _hashCode += getIGameNumber();
        if (getSDescription() != null) {
            _hashCode += getSDescription().hashCode();
        }
        if (getDtLocalPlayDateTime() != null) {
            _hashCode += getDtLocalPlayDateTime().hashCode();
        }
        if (getDtUTCPlayDateTime() != null) {
            _hashCode += getDtUTCPlayDateTime().hashCode();
        }
        if (getSTeamName1() != null) {
            _hashCode += getSTeamName1().hashCode();
        }
        if (getSTeamName2() != null) {
            _hashCode += getSTeamName2().hashCode();
        }
        _hashCode += getIScoreTeam1();
        _hashCode += getIScoreTeam2();
        _hashCode += getIRedCards();
        _hashCode += getIYellowCards();
        if (getSGroupCode() != null) {
            _hashCode += getSGroupCode().hashCode();
        }
        _hashCode += (isBFinished() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getIPenaltiesWonTeam1();
        _hashCode += getIPenaltiesWonTeam2();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGameResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGameNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGameNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtLocalPlayDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "dtLocalPlayDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtUTCPlayDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "dtUTCPlayDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeamName1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeamName1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeamName2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeamName2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IScoreTeam1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iScoreTeam1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IScoreTeam2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iScoreTeam2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRedCards");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iRedCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IYellowCards");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iYellowCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BFinished");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "bFinished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPenaltiesWonTeam1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iPenaltiesWonTeam1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPenaltiesWonTeam2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iPenaltiesWonTeam2"));
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
