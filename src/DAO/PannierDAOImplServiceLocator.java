/**
 * PannierDAOImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class PannierDAOImplServiceLocator extends org.apache.axis.client.Service implements DAO.PannierDAOImplService {

    public PannierDAOImplServiceLocator() {
    }


    public PannierDAOImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PannierDAOImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PannierDAOImplPort
    private java.lang.String PannierDAOImplPort_address = "http://localhost:1920/ws/PannierDAOImpl";

    public java.lang.String getPannierDAOImplPortAddress() {
        return PannierDAOImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PannierDAOImplPortWSDDServiceName = "PannierDAOImplPort";

    public java.lang.String getPannierDAOImplPortWSDDServiceName() {
        return PannierDAOImplPortWSDDServiceName;
    }

    public void setPannierDAOImplPortWSDDServiceName(java.lang.String name) {
        PannierDAOImplPortWSDDServiceName = name;
    }

    public DAO.PannierDAOImpl getPannierDAOImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PannierDAOImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPannierDAOImplPort(endpoint);
    }

    public DAO.PannierDAOImpl getPannierDAOImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DAO.PannierDAOImplPortBindingStub _stub = new DAO.PannierDAOImplPortBindingStub(portAddress, this);
            _stub.setPortName(getPannierDAOImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPannierDAOImplPortEndpointAddress(java.lang.String address) {
        PannierDAOImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DAO.PannierDAOImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                DAO.PannierDAOImplPortBindingStub _stub = new DAO.PannierDAOImplPortBindingStub(new java.net.URL(PannierDAOImplPort_address), this);
                _stub.setPortName(getPannierDAOImplPortWSDDServiceName());
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
        if ("PannierDAOImplPort".equals(inputPortName)) {
            return getPannierDAOImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DAO/", "PannierDAOImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DAO/", "PannierDAOImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PannierDAOImplPort".equals(portName)) {
            setPannierDAOImplPortEndpointAddress(address);
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
