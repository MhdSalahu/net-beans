/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCAS LAB2
 */
import hellointerface.HelloInterface;
import java.rmi.Naming;

public class HelloClient {

        public static void main(String[] argv) {
                try {
                        HelloInterface hello = (HelloInterface) Naming.lookup("//localhost/Hello");
                        System.out.println(hello.say());
                } catch (Exception e) {
                        System.out.println("HelloClient exception: " + e);
                }
        }
}
