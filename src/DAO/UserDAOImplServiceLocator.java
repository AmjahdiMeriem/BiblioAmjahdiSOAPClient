/**
 * UserDAOImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class UserDAOImplServiceLocator extends org.apache.axis.client.Service implements DAO.UserDAOImplService {

    public UserDAOImplServiceLocator() {
    }


    public UserDAOImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserDAOImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserDAOImplPort
    private java.lang.String UserDAOImplPort_address = "http://localhost:1918/ws/UserDAOImpl";

    public java.lang.String getUserDAOImplPortAddress() {
        return UserDAOImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserDAOImplPortWSDDServiceName = "UserDAOImplPort";

    public java.lang.String getUserDAOImplPortWSDDServiceName() {
        return UserDAOImplPortWSDDServiceName;
    }

    public void setUserDAOImplPortWSDDServiceName(java.lang.String name) {
        UserDAOImplPortWSDDServiceName = name;
    }

    public DAO.UserDAOImpl getUserDAOImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserDAOImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserDAOImplPort(endpoint);
    }

    public DAO.UserDAOImpl getUserDAOImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DAO.UserDAOImplPortBindingStub _stub = new DAO.UserDAOImplPortBindingStub(portAddress, this);
            _stub.setPortName(getUserDAOImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserDAOImplPortEndpointAddress(java.lang.String address) {
        UserDAOImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DAO.UserDAOImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                DAO.UserDAOImplPortBindingStub _stub = new DAO.UserDAOImplPortBindingStub(new java.net.URL(UserDAOImplPort_address), this);
                _stub.setPortName(getUserDAOImplPortWSDDServiceName());
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
        if ("UserDAOImplPort".equals(inputPortName)) {
            return getUserDAOImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DAO/", "UserDAOImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DAO/", "UserDAOImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserDAOImplPort".equals(portName)) {
            setUserDAOImplPortEndpointAddress(address);
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
