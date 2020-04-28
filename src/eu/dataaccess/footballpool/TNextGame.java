/**
 * TNextGame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TNextGame  implements java.io.Serializable {
    private int iGameNumber;

    private java.lang.String sLocalDateTime;

    private java.lang.String sUTCDateTime;

    private java.lang.String sTeam1;

    private java.lang.String sTeam2;

    public TNextGame() {
    }

    public TNextGame(
           int iGameNumber,
           java.lang.String sLocalDateTime,
           java.lang.String sUTCDateTime,
           java.lang.String sTeam1,
           java.lang.String sTeam2) {
           this.iGameNumber = iGameNumber;
           this.sLocalDateTime = sLocalDateTime;
           this.sUTCDateTime = sUTCDateTime;
           this.sTeam1 = sTeam1;
           this.sTeam2 = sTeam2;
    }


    /**
     * Gets the iGameNumber value for this TNextGame.
     * 
     * @return iGameNumber
     */
    public int getIGameNumber() {
        return iGameNumber;
    }


    /**
     * Sets the iGameNumber value for this TNextGame.
     * 
     * @param iGameNumber
     */
    public void setIGameNumber(int iGameNumber) {
        this.iGameNumber = iGameNumber;
    }


    /**
     * Gets the sLocalDateTime value for this TNextGame.
     * 
     * @return sLocalDateTime
     */
    public java.lang.String getSLocalDateTime() {
        return sLocalDateTime;
    }


    /**
     * Sets the sLocalDateTime value for this TNextGame.
     * 
     * @param sLocalDateTime
     */
    public void setSLocalDateTime(java.lang.String sLocalDateTime) {
        this.sLocalDateTime = sLocalDateTime;
    }


    /**
     * Gets the sUTCDateTime value for this TNextGame.
     * 
     * @return sUTCDateTime
     */
    public java.lang.String getSUTCDateTime() {
        return sUTCDateTime;
    }


    /**
     * Sets the sUTCDateTime value for this TNextGame.
     * 
     * @param sUTCDateTime
     */
    public void setSUTCDateTime(java.lang.String sUTCDateTime) {
        this.sUTCDateTime = sUTCDateTime;
    }


    /**
     * Gets the sTeam1 value for this TNextGame.
     * 
     * @return sTeam1
     */
    public java.lang.String getSTeam1() {
        return sTeam1;
    }


    /**
     * Sets the sTeam1 value for this TNextGame.
     * 
     * @param sTeam1
     */
    public void setSTeam1(java.lang.String sTeam1) {
        this.sTeam1 = sTeam1;
    }


    /**
     * Gets the sTeam2 value for this TNextGame.
     * 
     * @return sTeam2
     */
    public java.lang.String getSTeam2() {
        return sTeam2;
    }


    /**
     * Sets the sTeam2 value for this TNextGame.
     * 
     * @param sTeam2
     */
    public void setSTeam2(java.lang.String sTeam2) {
        this.sTeam2 = sTeam2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TNextGame)) return false;
        TNextGame other = (TNextGame) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iGameNumber == other.getIGameNumber() &&
            ((this.sLocalDateTime==null && other.getSLocalDateTime()==null) || 
             (this.sLocalDateTime!=null &&
              this.sLocalDateTime.equals(other.getSLocalDateTime()))) &&
            ((this.sUTCDateTime==null && other.getSUTCDateTime()==null) || 
             (this.sUTCDateTime!=null &&
              this.sUTCDateTime.equals(other.getSUTCDateTime()))) &&
            ((this.sTeam1==null && other.getSTeam1()==null) || 
             (this.sTeam1!=null &&
              this.sTeam1.equals(other.getSTeam1()))) &&
            ((this.sTeam2==null && other.getSTeam2()==null) || 
             (this.sTeam2!=null &&
              this.sTeam2.equals(other.getSTeam2())));
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
        if (getSLocalDateTime() != null) {
            _hashCode += getSLocalDateTime().hashCode();
        }
        if (getSUTCDateTime() != null) {
            _hashCode += getSUTCDateTime().hashCode();
        }
        if (getSTeam1() != null) {
            _hashCode += getSTeam1().hashCode();
        }
        if (getSTeam2() != null) {
            _hashCode += getSTeam2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TNextGame.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tNextGame"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGameNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGameNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLocalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sLocalDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUTCDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sUTCDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeam1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeam1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeam2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeam2"));
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
