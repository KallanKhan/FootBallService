/**
 * TAllCardsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TAllCardsInfo  implements java.io.Serializable {
    private java.util.Date dDate;

    private int iMinute;

    private java.lang.String sTeam1Name;

    private java.lang.String sTeam1Flag;

    private java.lang.String sTeam2Name;

    private java.lang.String sTeam2Flag;

    private java.lang.String sPlayerName;

    private int iYellow;

    private int iRed;

    public TAllCardsInfo() {
    }

    public TAllCardsInfo(
           java.util.Date dDate,
           int iMinute,
           java.lang.String sTeam1Name,
           java.lang.String sTeam1Flag,
           java.lang.String sTeam2Name,
           java.lang.String sTeam2Flag,
           java.lang.String sPlayerName,
           int iYellow,
           int iRed) {
           this.dDate = dDate;
           this.iMinute = iMinute;
           this.sTeam1Name = sTeam1Name;
           this.sTeam1Flag = sTeam1Flag;
           this.sTeam2Name = sTeam2Name;
           this.sTeam2Flag = sTeam2Flag;
           this.sPlayerName = sPlayerName;
           this.iYellow = iYellow;
           this.iRed = iRed;
    }


    /**
     * Gets the dDate value for this TAllCardsInfo.
     * 
     * @return dDate
     */
    public java.util.Date getDDate() {
        return dDate;
    }


    /**
     * Sets the dDate value for this TAllCardsInfo.
     * 
     * @param dDate
     */
    public void setDDate(java.util.Date dDate) {
        this.dDate = dDate;
    }


    /**
     * Gets the iMinute value for this TAllCardsInfo.
     * 
     * @return iMinute
     */
    public int getIMinute() {
        return iMinute;
    }


    /**
     * Sets the iMinute value for this TAllCardsInfo.
     * 
     * @param iMinute
     */
    public void setIMinute(int iMinute) {
        this.iMinute = iMinute;
    }


    /**
     * Gets the sTeam1Name value for this TAllCardsInfo.
     * 
     * @return sTeam1Name
     */
    public java.lang.String getSTeam1Name() {
        return sTeam1Name;
    }


    /**
     * Sets the sTeam1Name value for this TAllCardsInfo.
     * 
     * @param sTeam1Name
     */
    public void setSTeam1Name(java.lang.String sTeam1Name) {
        this.sTeam1Name = sTeam1Name;
    }


    /**
     * Gets the sTeam1Flag value for this TAllCardsInfo.
     * 
     * @return sTeam1Flag
     */
    public java.lang.String getSTeam1Flag() {
        return sTeam1Flag;
    }


    /**
     * Sets the sTeam1Flag value for this TAllCardsInfo.
     * 
     * @param sTeam1Flag
     */
    public void setSTeam1Flag(java.lang.String sTeam1Flag) {
        this.sTeam1Flag = sTeam1Flag;
    }


    /**
     * Gets the sTeam2Name value for this TAllCardsInfo.
     * 
     * @return sTeam2Name
     */
    public java.lang.String getSTeam2Name() {
        return sTeam2Name;
    }


    /**
     * Sets the sTeam2Name value for this TAllCardsInfo.
     * 
     * @param sTeam2Name
     */
    public void setSTeam2Name(java.lang.String sTeam2Name) {
        this.sTeam2Name = sTeam2Name;
    }


    /**
     * Gets the sTeam2Flag value for this TAllCardsInfo.
     * 
     * @return sTeam2Flag
     */
    public java.lang.String getSTeam2Flag() {
        return sTeam2Flag;
    }


    /**
     * Sets the sTeam2Flag value for this TAllCardsInfo.
     * 
     * @param sTeam2Flag
     */
    public void setSTeam2Flag(java.lang.String sTeam2Flag) {
        this.sTeam2Flag = sTeam2Flag;
    }


    /**
     * Gets the sPlayerName value for this TAllCardsInfo.
     * 
     * @return sPlayerName
     */
    public java.lang.String getSPlayerName() {
        return sPlayerName;
    }


    /**
     * Sets the sPlayerName value for this TAllCardsInfo.
     * 
     * @param sPlayerName
     */
    public void setSPlayerName(java.lang.String sPlayerName) {
        this.sPlayerName = sPlayerName;
    }


    /**
     * Gets the iYellow value for this TAllCardsInfo.
     * 
     * @return iYellow
     */
    public int getIYellow() {
        return iYellow;
    }


    /**
     * Sets the iYellow value for this TAllCardsInfo.
     * 
     * @param iYellow
     */
    public void setIYellow(int iYellow) {
        this.iYellow = iYellow;
    }


    /**
     * Gets the iRed value for this TAllCardsInfo.
     * 
     * @return iRed
     */
    public int getIRed() {
        return iRed;
    }


    /**
     * Sets the iRed value for this TAllCardsInfo.
     * 
     * @param iRed
     */
    public void setIRed(int iRed) {
        this.iRed = iRed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAllCardsInfo)) return false;
        TAllCardsInfo other = (TAllCardsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dDate==null && other.getDDate()==null) || 
             (this.dDate!=null &&
              this.dDate.equals(other.getDDate()))) &&
            this.iMinute == other.getIMinute() &&
            ((this.sTeam1Name==null && other.getSTeam1Name()==null) || 
             (this.sTeam1Name!=null &&
              this.sTeam1Name.equals(other.getSTeam1Name()))) &&
            ((this.sTeam1Flag==null && other.getSTeam1Flag()==null) || 
             (this.sTeam1Flag!=null &&
              this.sTeam1Flag.equals(other.getSTeam1Flag()))) &&
            ((this.sTeam2Name==null && other.getSTeam2Name()==null) || 
             (this.sTeam2Name!=null &&
              this.sTeam2Name.equals(other.getSTeam2Name()))) &&
            ((this.sTeam2Flag==null && other.getSTeam2Flag()==null) || 
             (this.sTeam2Flag!=null &&
              this.sTeam2Flag.equals(other.getSTeam2Flag()))) &&
            ((this.sPlayerName==null && other.getSPlayerName()==null) || 
             (this.sPlayerName!=null &&
              this.sPlayerName.equals(other.getSPlayerName()))) &&
            this.iYellow == other.getIYellow() &&
            this.iRed == other.getIRed();
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
        if (getDDate() != null) {
            _hashCode += getDDate().hashCode();
        }
        _hashCode += getIMinute();
        if (getSTeam1Name() != null) {
            _hashCode += getSTeam1Name().hashCode();
        }
        if (getSTeam1Flag() != null) {
            _hashCode += getSTeam1Flag().hashCode();
        }
        if (getSTeam2Name() != null) {
            _hashCode += getSTeam2Name().hashCode();
        }
        if (getSTeam2Flag() != null) {
            _hashCode += getSTeam2Flag().hashCode();
        }
        if (getSPlayerName() != null) {
            _hashCode += getSPlayerName().hashCode();
        }
        _hashCode += getIYellow();
        _hashCode += getIRed();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TAllCardsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tAllCardsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "dDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeam1Name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeam1Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeam1Flag");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeam1Flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeam2Name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeam2Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeam2Flag");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeam2Flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPlayerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sPlayerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IYellow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iYellow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iRed"));
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
