package DAO;

public class GenreLivreDAOImplProxy implements DAO.GenreLivreDAOImpl {
  private String _endpoint = null;
  private DAO.GenreLivreDAOImpl genreLivreDAOImpl = null;
  
  public GenreLivreDAOImplProxy() {
    _initGenreLivreDAOImplProxy();
  }
  
  public GenreLivreDAOImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initGenreLivreDAOImplProxy();
  }
  
  private void _initGenreLivreDAOImplProxy() {
    try {
      genreLivreDAOImpl = (new DAO.GenreLivreDAOImplServiceLocator()).getGenreLivreDAOImplPort();
      if (genreLivreDAOImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)genreLivreDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)genreLivreDAOImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (genreLivreDAOImpl != null)
      ((javax.xml.rpc.Stub)genreLivreDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.GenreLivreDAOImpl getGenreLivreDAOImpl() {
    if (genreLivreDAOImpl == null)
      _initGenreLivreDAOImplProxy();
    return genreLivreDAOImpl;
  }
  
  public DAO.GenreLivre[] findGenreLivre() throws java.rmi.RemoteException{
    if (genreLivreDAOImpl == null)
      _initGenreLivreDAOImplProxy();
    return genreLivreDAOImpl.findGenreLivre();
  }
  
  public void removeGenreLivre(java.lang.Long idGenreLivre) throws java.rmi.RemoteException{
    if (genreLivreDAOImpl == null)
      _initGenreLivreDAOImplProxy();
    genreLivreDAOImpl.removeGenreLivre(idGenreLivre);
  }
  
  public void addGenreLivre(DAO.GenreLivre genre) throws java.rmi.RemoteException{
    if (genreLivreDAOImpl == null)
      _initGenreLivreDAOImplProxy();
    genreLivreDAOImpl.addGenreLivre(genre);
  }
  
  
}