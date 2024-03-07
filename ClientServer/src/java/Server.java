
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
public class Server {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ServerSocket s3 = new ServerSocket(4000);
        Socket s = s3.accept();
        InputStream i = s.getInputStream();
        DataInputStream dis = new DataInputStream(i);
        OutputStream o = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(o);
        while(true)
        {
            System.out.println("Enter the message : ");
            String st = br.readLine();
            dos.writeUTF(st);
            String s1 = dis.readUTF().toString();
            System.out.println(s1);
            if(st.equals("bye"))
                break;
        }
        dos.close();
        o.close();
        s.close();
    }
    
}
