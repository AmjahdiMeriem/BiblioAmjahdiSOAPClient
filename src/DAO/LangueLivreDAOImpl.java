/**
 * LangueLivreDAOImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface LangueLivreDAOImpl extends java.rmi.Remote {
    public DAO.LangueLivre[] findLangueAll() throws java.rmi.RemoteException;
    public void removeLangueLivre(java.lang.Long idLangue) throws java.rmi.RemoteException;
    public void addLangueLivre(DAO.LangueLivre langue) throws java.rmi.RemoteException;
}
