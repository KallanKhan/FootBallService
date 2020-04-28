/**
 * TGameLevelInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class TGameLevelInfo  implements java.io.Serializable {
    private int iLevel;

    private java.util.Date dFirstGame;

    private int iFirstGameID;

    private java.util.Date dLastGame;

    private int iLastGameID;

    public TGameLevelInfo() {
    }

    public TGameLevelInfo(
           int iLevel,
           java.util.Date dFirstGame,
           int iFirstGameID,
           java.util.Date dLastGame,
           int iLastGameID) {
           this.iLevel = iLevel;
           this.dFirstGame = dFirstGame;
           this.iFirstGameID = iFirstGameID;
           this.dLastGame = dLastGame;
           this.iLastGameID = iLastGameID;
    }


    /**
     * Gets the iLevel value for this TGameLevelInfo.
     * 
     * @return iLevel
     */
    public int getILevel() {
        return iLevel;
    }


    /**
     * Sets the iLevel value for this TGameLevelInfo.
     * 
     * @param iLevel
     */
    public void setILevel(int iLevel) {
        this.iLevel = iLevel;
    }


    /**
     * Gets the dFirstGame value for this TGameLevelInfo.
     * 
     * @return dFirstGame
     */
    public java.util.Date getDFirstGame() {
        return dFirstGame;
    }


    /**
     * Sets the dFirstGame value for this TGameLevelInfo.
     * 
     * @param dFirstGame
     */
    public void setDFirstGame(java.util.Date dFirstGame) {
        this.dFirstGame = dFirstGame;
    }


    /**
     * Gets the iFirstGameID value for this TGameLevelInfo.
     * 
     * @return iFirstGameID
     */
    public int getIFirstGameID() {
        return iFirstGameID;
    }


    /**
     * Sets the iFirstGameID value for this TGameLevelInfo.
     * 
     * @param iFirstGameID
     */
    public void setIFirstGameID(int iFirstGameID) {
        this.iFirstGameID = iFirstGameID;
    }


    /**
     * Gets the dLastGame value for this TGameLevelInfo.
     * 
     * @return dLastGame
     */
    public java.util.Date getDLastGame() {
        return dLastGame;
    }


    /**
     * Sets the dLastGame value for this TGameLevelInfo.
     * 
     * @param dLastGame
     */
    public void setDLastGame(java.util.Date dLastGame) {
        this.dLastGame = dLastGame;
    }


    /**
     * Gets the iLastGameID value for this TGameLevelInfo.
     * 
     * @return iLastGameID
     */
    public int getILastGameID() {
        return iLastGameID;
    }


    /**
     * Sets the iLastGameID value for this TGameLevelInfo.
     * 
     * @param iLastGameID
     */
    public void setILastGameID(int iLastGameID) {
        this.iLastGameID = iLastGameID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGameLevelInfo)) return false;
        TGameLevelInfo other = (TGameLevelInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.iLevel == other.getILevel() &&
            ((this.dFirstGame==null && other.getDFirstGame()==null) || 
             (this.dFirstGame!=null &&
              this.dFirstGame.equals(other.getDFirstGame()))) &&
            this.iFirstGameID == other.getIFirstGameID() &&
            ((this.dLastGame==null && other.getDLastGame()==null) || 
             (this.dLastGame!=null &&
              this.dLastGame.equals(other.getDLastGame()))) &&
            this.iLastGameID == other.getILastGameID();
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
        _hashCode += getILevel();
        if (getDFirstGame() != null) {
            _hashCode += getDFirstGame().hashCode();
        }
        _hashCode += getIFirstGameID();
        if (getDLastGame() != null) {
            _hashCode += getDLastGame().hashCode();
        }
        _hashCode += getILastGameID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGameLevelInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameLevelInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFirstGame");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "dFirstGame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IFirstGameID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iFirstGameID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DLastGame");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "dLastGame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILastGameID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iLastGameID"));
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
