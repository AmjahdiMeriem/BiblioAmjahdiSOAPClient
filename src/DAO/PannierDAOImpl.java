/**
 * PannierDAOImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface PannierDAOImpl extends java.rmi.Remote {
    public void addLivrePannier(java.lang.Long idUser, java.lang.Long ISBN) throws java.rmi.RemoteException;
    public DAO.Livre[] findLivrePannierByIdUsr(java.lang.Long idUser) throws java.rmi.RemoteException;
}
