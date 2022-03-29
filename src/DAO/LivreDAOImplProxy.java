package DAO;

public class LivreDAOImplProxy implements DAO.LivreDAOImpl {
  private String _endpoint = null;
  private DAO.LivreDAOImpl livreDAOImpl = null;
  
  public LivreDAOImplProxy() {
    _initLivreDAOImplProxy();
  }
  
  public LivreDAOImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initLivreDAOImplProxy();
  }
  
  private void _initLivreDAOImplProxy() {
    try {
      livreDAOImpl = (new DAO.LivreDAOImplServiceLocator()).getLivreDAOImplPort();
      if (livreDAOImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)livreDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)livreDAOImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (livreDAOImpl != null)
      ((javax.xml.rpc.Stub)livreDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.LivreDAOImpl getLivreDAOImpl() {
    if (livreDAOImpl == null)
      _initLivreDAOImplProxy();
    return livreDAOImpl;
  }
  
  public boolean addLivre(DAO.Livre livre) throws java.rmi.RemoteException{
    if (livreDAOImpl == null)
      _initLivreDAOImplProxy();
    return livreDAOImpl.addLivre(livre);
  }
  
  public DAO.Livre[] findBookByLangKind(java.lang.Long idGenre, java.lang.Long idLangue) throws java.rmi.RemoteException{
    if (livreDAOImpl == null)
      _initLivreDAOImplProxy();
    return livreDAOImpl.findBookByLangKind(idGenre, idLangue);
  }
  
  public void removeLivre(java.lang.Long ISBN) throws java.rmi.RemoteException{
    if (livreDAOImpl == null)
      _initLivreDAOImplProxy();
    livreDAOImpl.removeLivre(ISBN);
  }
  
  public DAO.Livre[] findBookAll() throws java.rmi.RemoteException{
    if (livreDAOImpl == null)
      _initLivreDAOImplProxy();
    return livreDAOImpl.findBookAll();
  }
  
  public DAO.Livre findBookByISBN(java.lang.Long isbn) throws java.rmi.RemoteException{
    if (livreDAOImpl == null)
      _initLivreDAOImplProxy();
    return livreDAOImpl.findBookByISBN(isbn);
  }
  
  
}