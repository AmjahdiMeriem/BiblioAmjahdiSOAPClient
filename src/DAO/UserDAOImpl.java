/**
 * UserDAOImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DAO;

public interface UserDAOImpl extends java.rmi.Remote {
    public boolean saveClient(DAO.User user) throws java.rmi.RemoteException, DAO.UnsupportedEncodingException;
    public boolean editColRole(java.lang.Long idUser, DAO.RoleUser roleUser) throws java.rmi.RemoteException;
    public void deletClient(java.lang.Long idUser) throws java.rmi.RemoteException;
    public DAO.User[] findClientAll() throws java.rmi.RemoteException;
}
