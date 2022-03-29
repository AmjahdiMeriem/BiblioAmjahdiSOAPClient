/**
 * LoginDAOImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class LoginDAOImplServiceLocator extends org.apache.axis.client.Service implements DAO.LoginDAOImplService {

    public LoginDAOImplServiceLocator() {
    }


    public LoginDAOImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginDAOImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginDAOImplPort
    private java.lang.String LoginDAOImplPort_address = "http://localhost:1919/ws/LoginDAOImpl";

    public java.lang.String getLoginDAOImplPortAddress() {
        return LoginDAOImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginDAOImplPortWSDDServiceName = "LoginDAOImplPort";

    public java.lang.String getLoginDAOImplPortWSDDServiceName() {
        return LoginDAOImplPortWSDDServiceName;
    }

    public void setLoginDAOImplPortWSDDServiceName(java.lang.String name) {
        LoginDAOImplPortWSDDServiceName = name;
    }

    public DAO.LoginDAOImpl getLoginDAOImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginDAOImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginDAOImplPort(endpoint);
    }

    public DAO.LoginDAOImpl getLoginDAOImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DAO.LoginDAOImplPortBindingStub _stub = new DAO.LoginDAOImplPortBindingStub(portAddress, this);
            _stub.setPortName(getLoginDAOImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginDAOImplPortEndpointAddress(java.lang.String address) {
        LoginDAOImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DAO.LoginDAOImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                DAO.LoginDAOImplPortBindingStub _stub = new DAO.LoginDAOImplPortBindingStub(new java.net.URL(LoginDAOImplPort_address), this);
                _stub.setPortName(getLoginDAOImplPortWSDDServiceName());
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
        if ("LoginDAOImplPort".equals(inputPortName)) {
            return getLoginDAOImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DAO/", "LoginDAOImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DAO/", "LoginDAOImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginDAOImplPort".equals(portName)) {
            setLoginDAOImplPortEndpointAddress(address);
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
