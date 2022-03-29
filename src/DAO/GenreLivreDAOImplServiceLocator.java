/**
 * GenreLivreDAOImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public class GenreLivreDAOImplServiceLocator extends org.apache.axis.client.Service implements DAO.GenreLivreDAOImplService {

    public GenreLivreDAOImplServiceLocator() {
    }


    public GenreLivreDAOImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GenreLivreDAOImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GenreLivreDAOImplPort
    private java.lang.String GenreLivreDAOImplPort_address = "http://localhost:1921/ws/GenreLivreDAOImpl";

    public java.lang.String getGenreLivreDAOImplPortAddress() {
        return GenreLivreDAOImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GenreLivreDAOImplPortWSDDServiceName = "GenreLivreDAOImplPort";

    public java.lang.String getGenreLivreDAOImplPortWSDDServiceName() {
        return GenreLivreDAOImplPortWSDDServiceName;
    }

    public void setGenreLivreDAOImplPortWSDDServiceName(java.lang.String name) {
        GenreLivreDAOImplPortWSDDServiceName = name;
    }

    public DAO.GenreLivreDAOImpl getGenreLivreDAOImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GenreLivreDAOImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGenreLivreDAOImplPort(endpoint);
    }

    public DAO.GenreLivreDAOImpl getGenreLivreDAOImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DAO.GenreLivreDAOImplPortBindingStub _stub = new DAO.GenreLivreDAOImplPortBindingStub(portAddress, this);
            _stub.setPortName(getGenreLivreDAOImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGenreLivreDAOImplPortEndpointAddress(java.lang.String address) {
        GenreLivreDAOImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DAO.GenreLivreDAOImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                DAO.GenreLivreDAOImplPortBindingStub _stub = new DAO.GenreLivreDAOImplPortBindingStub(new java.net.URL(GenreLivreDAOImplPort_address), this);
                _stub.setPortName(getGenreLivreDAOImplPortWSDDServiceName());
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
        if ("GenreLivreDAOImplPort".equals(inputPortName)) {
            return getGenreLivreDAOImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DAO/", "GenreLivreDAOImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DAO/", "GenreLivreDAOImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GenreLivreDAOImplPort".equals(portName)) {
            setGenreLivreDAOImplPortEndpointAddress(address);
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
