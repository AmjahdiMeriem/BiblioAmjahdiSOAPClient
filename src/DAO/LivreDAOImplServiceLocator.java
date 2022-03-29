/**
 * LivreDAOImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class LivreDAOImplServiceLocator extends org.apache.axis.client.Service implements DAO.LivreDAOImplService {

    public LivreDAOImplServiceLocator() {
    }


    public LivreDAOImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LivreDAOImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LivreDAOImplPort
    private java.lang.String LivreDAOImplPort_address = "http://localhost:1917/ws/LivreDAOImpl";

    public java.lang.String getLivreDAOImplPortAddress() {
        return LivreDAOImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LivreDAOImplPortWSDDServiceName = "LivreDAOImplPort";

    public java.lang.String getLivreDAOImplPortWSDDServiceName() {
        return LivreDAOImplPortWSDDServiceName;
    }

    public void setLivreDAOImplPortWSDDServiceName(java.lang.String name) {
        LivreDAOImplPortWSDDServiceName = name;
    }

    public DAO.LivreDAOImpl getLivreDAOImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LivreDAOImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLivreDAOImplPort(endpoint);
    }

    public DAO.LivreDAOImpl getLivreDAOImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DAO.LivreDAOImplPortBindingStub _stub = new DAO.LivreDAOImplPortBindingStub(portAddress, this);
            _stub.setPortName(getLivreDAOImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLivreDAOImplPortEndpointAddress(java.lang.String address) {
        LivreDAOImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DAO.LivreDAOImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                DAO.LivreDAOImplPortBindingStub _stub = new DAO.LivreDAOImplPortBindingStub(new java.net.URL(LivreDAOImplPort_address), this);
                _stub.setPortName(getLivreDAOImplPortWSDDServiceName());
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
        if ("LivreDAOImplPort".equals(inputPortName)) {
            return getLivreDAOImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DAO/", "LivreDAOImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DAO/", "LivreDAOImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LivreDAOImplPort".equals(portName)) {
            setLivreDAOImplPortEndpointAddress(address);
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
