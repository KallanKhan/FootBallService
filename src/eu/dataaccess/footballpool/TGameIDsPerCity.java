/**
 * TGameIDsPerCity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGameIDsPerCity  implements java.io.Serializable {
    private java.lang.String sCity;

    private int[] iGameIDs;

    public TGameIDsPerCity() {
    }

    public TGameIDsPerCity(
           java.lang.String sCity,
           int[] iGameIDs) {
           this.sCity = sCity;
           this.iGameIDs = iGameIDs;
    }


    /**
     * Gets the sCity value for this TGameIDsPerCity.
     * 
     * @return sCity
     */
    public java.lang.String getSCity() {
        return sCity;
    }


    /**
     * Sets the sCity value for this TGameIDsPerCity.
     * 
     * @param sCity
     */
    public void setSCity(java.lang.String sCity) {
        this.sCity = sCity;
    }


    /**
     * Gets the iGameIDs value for this TGameIDsPerCity.
     * 
     * @return iGameIDs
     */
    public int[] getIGameIDs() {
        return iGameIDs;
    }


    /**
     * Sets the iGameIDs value for this TGameIDsPerCity.
     * 
     * @param iGameIDs
     */
    public void setIGameIDs(int[] iGameIDs) {
        this.iGameIDs = iGameIDs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGameIDsPerCity)) return false;
        TGameIDsPerCity other = (TGameIDsPerCity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sCity==null && other.getSCity()==null) || 
             (this.sCity!=null &&
              this.sCity.equals(other.getSCity()))) &&
            ((this.iGameIDs==null && other.getIGameIDs()==null) || 
             (this.iGameIDs!=null &&
              java.util.Arrays.equals(this.iGameIDs, other.getIGameIDs())));
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
        if (getSCity() != null) {
            _hashCode += getSCity().hashCode();
        }
        if (getIGameIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIGameIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIGameIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGameIDsPerCity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameIDsPerCity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGameIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGameIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "int"));
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
