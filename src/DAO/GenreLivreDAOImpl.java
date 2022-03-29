/**
 * GenreLivreDAOImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface GenreLivreDAOImpl extends java.rmi.Remote {
    public DAO.GenreLivre[] findGenreLivre() throws java.rmi.RemoteException;
    public void removeGenreLivre(java.lang.Long idGenreLivre) throws java.rmi.RemoteException;
    public void addGenreLivre(DAO.GenreLivre genre) throws java.rmi.RemoteException;
}
