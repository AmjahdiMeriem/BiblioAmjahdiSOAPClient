/**
 * LangueLivreDAOImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class LangueLivreDAOImplServiceLocator extends org.apache.axis.client.Service implements DAO.LangueLivreDAOImplService {

    public LangueLivreDAOImplServiceLocator() {
    }


    public LangueLivreDAOImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LangueLivreDAOImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LangueLivreDAOImplPort
    private java.lang.String LangueLivreDAOImplPort_address = "http://localhost:1922/ws/LangueLivreDAOImpl";

    public java.lang.String getLangueLivreDAOImplPortAddress() {
        return LangueLivreDAOImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LangueLivreDAOImplPortWSDDServiceName = "LangueLivreDAOImplPort";

    public java.lang.String getLangueLivreDAOImplPortWSDDServiceName() {
        return LangueLivreDAOImplPortWSDDServiceName;
    }

    public void setLangueLivreDAOImplPortWSDDServiceName(java.lang.String name) {
        LangueLivreDAOImplPortWSDDServiceName = name;
    }

    public DAO.LangueLivreDAOImpl getLangueLivreDAOImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LangueLivreDAOImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLangueLivreDAOImplPort(endpoint);
    }

    public DAO.LangueLivreDAOImpl getLangueLivreDAOImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DAO.LangueLivreDAOImplPortBindingStub _stub = new DAO.LangueLivreDAOImplPortBindingStub(portAddress, this);
            _stub.setPortName(getLangueLivreDAOImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLangueLivreDAOImplPortEndpointAddress(java.lang.String address) {
        LangueLivreDAOImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DAO.LangueLivreDAOImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                DAO.LangueLivreDAOImplPortBindingStub _stub = new DAO.LangueLivreDAOImplPortBindingStub(new java.net.URL(LangueLivreDAOImplPort_address), this);
                _stub.setPortName(getLangueLivreDAOImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LangueLivreDAOImplPort".equals(inputPortName)) {
            return getLangueLivreDAOImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DAO/", "LangueLivreDAOImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DAO/", "LangueLivreDAOImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LangueLivreDAOImplPort".equals(portName)) {
            setLangueLivreDAOImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
