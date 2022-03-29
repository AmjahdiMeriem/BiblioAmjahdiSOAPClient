package DAO;

public class PannierDAOImplProxy implements DAO.PannierDAOImpl {
  private String _endpoint = null;
  private DAO.PannierDAOImpl pannierDAOImpl = null;
  
  public PannierDAOImplProxy() {
    _initPannierDAOImplProxy();
  }
  
  public PannierDAOImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPannierDAOImplProxy();
  }
  
  private void _initPannierDAOImplProxy() {
    try {
      pannierDAOImpl = (new DAO.PannierDAOImplServiceLocator()).getPannierDAOImplPort();
      if (pannierDAOImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pannierDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pannierDAOImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pannierDAOImpl != null)
      ((javax.xml.rpc.Stub)pannierDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.PannierDAOImpl getPannierDAOImpl() {
    if (pannierDAOImpl == null)
      _initPannierDAOImplProxy();
    return pannierDAOImpl;
  }
  
  public void addLivrePannier(java.lang.Long idUser, java.lang.Long ISBN) throws java.rmi.RemoteException{
    if (pannierDAOImpl == null)
      _initPannierDAOImplProxy();
    pannierDAOImpl.addLivrePannier(idUser, ISBN);
  }
  
  public DAO.Livre[] findLivrePannierByIdUsr(java.lang.Long idUser) throws java.rmi.RemoteException{
    if (pannierDAOImpl == null)
      _initPannierDAOImplProxy();
    return pannierDAOImpl.findLivrePannierByIdUsr(idUser);
  }
  
  
}