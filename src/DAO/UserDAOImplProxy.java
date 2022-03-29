package DAO;

public class UserDAOImplProxy implements DAO.UserDAOImpl {
  private String _endpoint = null;
  private DAO.UserDAOImpl userDAOImpl = null;
  
  public UserDAOImplProxy() {
    _initUserDAOImplProxy();
  }
  
  public UserDAOImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserDAOImplProxy();
  }
  
  private void _initUserDAOImplProxy() {
    try {
      userDAOImpl = (new DAO.UserDAOImplServiceLocator()).getUserDAOImplPort();
      if (userDAOImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userDAOImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userDAOImpl != null)
      ((javax.xml.rpc.Stub)userDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.UserDAOImpl getUserDAOImpl() {
    if (userDAOImpl == null)
      _initUserDAOImplProxy();
    return userDAOImpl;
  }
  
  public boolean saveClient(DAO.User user) throws java.rmi.RemoteException, DAO.UnsupportedEncodingException{
    if (userDAOImpl == null)
      _initUserDAOImplProxy();
    return userDAOImpl.saveClient(user);
  }
  
  public boolean editColRole(java.lang.Long idUser, DAO.RoleUser roleUser) throws java.rmi.RemoteException{
    if (userDAOImpl == null)
      _initUserDAOImplProxy();
    return userDAOImpl.editColRole(idUser, roleUser);
  }
  
  public void deletClient(java.lang.Long idUser) throws java.rmi.RemoteException{
    if (userDAOImpl == null)
      _initUserDAOImplProxy();
    userDAOImpl.deletClient(idUser);
  }
  
  public DAO.User[] findClientAll() throws java.rmi.RemoteException{
    if (userDAOImpl == null)
      _initUserDAOImplProxy();
    return userDAOImpl.findClientAll();
  }
  
  
}