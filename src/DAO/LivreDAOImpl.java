/**
 * LivreDAOImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface LivreDAOImpl extends java.rmi.Remote {
    public boolean addLivre(DAO.Livre livre) throws java.rmi.RemoteException;
    public DAO.Livre[] findBookByLangKind(java.lang.Long idGenre, java.lang.Long idLangue) throws java.rmi.RemoteException;
    public void removeLivre(java.lang.Long ISBN) throws java.rmi.RemoteException;
    public DAO.Livre[] findBookAll() throws java.rmi.RemoteException;
    public DAO.Livre findBookByISBN(java.lang.Long isbn) throws java.rmi.RemoteException;
}
