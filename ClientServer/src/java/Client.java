
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCAS LAB2
 */
public class Client {
    public static void main(String args[]) throws IOException{
        Socket s = new Socket(InetAddress.getLocalHost(),4000);
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Waiting for response...");
        InputStream i = s.getInputStream();
        DataInputStream dis = new DataInputStream(i);
        OutputStream o = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(o);
        String s1 = null;
        while(true)
        {
            try{
                s1 = dis.readUTF().toString();
                System.out.println("Message recieved from server");
                System.out.println(s1);
                System.out.println("Enter the Message");
                String str = b.readLine();
                dos.writeUTF(str);
            }catch(IOException e){}
            
            if(s1.equals("bye"))
                break;
        }
        dis.close();
        i.close();
        System.out.flush();
    }
}
