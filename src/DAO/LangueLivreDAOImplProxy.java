package DAO;

public class LangueLivreDAOImplProxy implements DAO.LangueLivreDAOImpl {
  private String _endpoint = null;
  private DAO.LangueLivreDAOImpl langueLivreDAOImpl = null;
  
  public LangueLivreDAOImplProxy() {
    _initLangueLivreDAOImplProxy();
  }
  
  public LangueLivreDAOImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initLangueLivreDAOImplProxy();
  }
  
  private void _initLangueLivreDAOImplProxy() {
    try {
      langueLivreDAOImpl = (new DAO.LangueLivreDAOImplServiceLocator()).getLangueLivreDAOImplPort();
      if (langueLivreDAOImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)langueLivreDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)langueLivreDAOImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (langueLivreDAOImpl != null)
      ((javax.xml.rpc.Stub)langueLivreDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.LangueLivreDAOImpl getLangueLivreDAOImpl() {
    if (langueLivreDAOImpl == null)
      _initLangueLivreDAOImplProxy();
    return langueLivreDAOImpl;
  }
  
  public DAO.LangueLivre[] findLangueAll() throws java.rmi.RemoteException{
    if (langueLivreDAOImpl == null)
      _initLangueLivreDAOImplProxy();
    return langueLivreDAOImpl.findLangueAll();
  }
  
  public void removeLangueLivre(java.lang.Long idLangue) throws java.rmi.RemoteException{
    if (langueLivreDAOImpl == null)
      _initLangueLivreDAOImplProxy();
    langueLivreDAOImpl.removeLangueLivre(idLangue);
  }
  
  public void addLangueLivre(DAO.LangueLivre langue) throws java.rmi.RemoteException{
    if (langueLivreDAOImpl == null)
      _initLangueLivreDAOImplProxy();
    langueLivreDAOImpl.addLangueLivre(langue);
  }
  
  
}