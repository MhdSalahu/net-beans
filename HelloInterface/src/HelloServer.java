/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCAS LAB2
 */
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class HelloServer {

        public static void main(String[] args) {
                try {
                        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
                        r.rebind("Hello", new Hello("Nilgiri College of Arts & Science, Thaloor."));
                        System.out.println("Server is connected and ready for operation.");
                } catch (Exception e) {
                        System.out.println("Server not connected: " + e);
                }
        }
}

