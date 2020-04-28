/**
 * TTeamCoachName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TTeamCoachName  implements java.io.Serializable {
    private java.lang.String sTeamName;

    private java.lang.String sCoachName;

    public TTeamCoachName() {
    }

    public TTeamCoachName(
           java.lang.String sTeamName,
           java.lang.String sCoachName) {
           this.sTeamName = sTeamName;
           this.sCoachName = sCoachName;
    }


    /**
     * Gets the sTeamName value for this TTeamCoachName.
     * 
     * @return sTeamName
     */
    public java.lang.String getSTeamName() {
        return sTeamName;
    }


    /**
     * Sets the sTeamName value for this TTeamCoachName.
     * 
     * @param sTeamName
     */
    public void setSTeamName(java.lang.String sTeamName) {
        this.sTeamName = sTeamName;
    }


    /**
     * Gets the sCoachName value for this TTeamCoachName.
     * 
     * @return sCoachName
     */
    public java.lang.String getSCoachName() {
        return sCoachName;
    }


    /**
     * Sets the sCoachName value for this TTeamCoachName.
     * 
     * @param sCoachName
     */
    public void setSCoachName(java.lang.String sCoachName) {
        this.sCoachName = sCoachName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTeamCoachName)) return false;
        TTeamCoachName other = (TTeamCoachName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sTeamName==null && other.getSTeamName()==null) || 
             (this.sTeamName!=null &&
              this.sTeamName.equals(other.getSTeamName()))) &&
            ((this.sCoachName==null && other.getSCoachName()==null) || 
             (this.sCoachName!=null &&
              this.sCoachName.equals(other.getSCoachName())));
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
        if (getSTeamName() != null) {
            _hashCode += getSTeamName().hashCode();
        }
        if (getSCoachName() != null) {
            _hashCode += getSCoachName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTeamCoachName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamCoachName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STeamName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeamName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCoachName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sCoachName"));
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
