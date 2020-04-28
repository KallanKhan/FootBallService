/**
 * Info.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public interface Info extends javax.xml.rpc.Service {

/**
 * DataFlex Web Service for public information from the DataFlex Football
 * Pool
 */
    public java.lang.String getInfoSoapAddress();

    public eu.dataaccess.footballpool.InfoSoapType getInfoSoap() throws javax.xml.rpc.ServiceException;

    public eu.dataaccess.footballpool.InfoSoapType getInfoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
