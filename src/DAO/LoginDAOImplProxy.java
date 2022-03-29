package DAO;

public class LoginDAOImplProxy implements DAO.LoginDAOImpl {
  private String _endpoint = null;
  private DAO.LoginDAOImpl loginDAOImpl = null;
  
  public LoginDAOImplProxy() {
    _initLoginDAOImplProxy();
  }
  
  public LoginDAOImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginDAOImplProxy();
  }
  
  private void _initLoginDAOImplProxy() {
    try {
      loginDAOImpl = (new DAO.LoginDAOImplServiceLocator()).getLoginDAOImplPort();
      if (loginDAOImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)loginDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)loginDAOImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (loginDAOImpl != null)
      ((javax.xml.rpc.Stub)loginDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.LoginDAOImpl getLoginDAOImpl() {
    if (loginDAOImpl == null)
      _initLoginDAOImplProxy();
    return loginDAOImpl;
  }
  
  public DAO.User checkLogin(DAO.User user) throws java.rmi.RemoteException{
    if (loginDAOImpl == null)
      _initLoginDAOImplProxy();
    return loginDAOImpl.checkLogin(user);
  }
  
  
}