/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellointerface;

/**
 *
 * @author NCAS LAB2
 */
import java.rmi.*;

public interface HelloInterface extends Remote {

        public String say() throws RemoteException;
}

