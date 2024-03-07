/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NCAS LAB2
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        int operation=0;
        do{
            try {

            int id,rollNo,age;
            String admNo,firstName,lastName,phoneNo,sql;
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String dbURL = "jdbc:ucanaccess://Student.accdb";
            Connection con = DriverManager.getConnection(dbURL);
            Scanner sc = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nSelect Operation(1-3):\n\t1. Student Registration\n\t2. Student Expultion\n\t3. Student List\n\t4. Log out");
            System.out.print("Select your choice : ");
            operation = sc.nextInt();
            
            PreparedStatement pStmnt = null;
            ResultSet result=null;
            
            switch(operation){
                case 1 :
                    sql ="INSERT INTO Student(AdmNo,RollNo,FirstName,LastName,Age,PhoneNo) VALUES(?,?,?,?,?,?)";
                    pStmnt=con.prepareStatement(sql);;
                    System.out.println("\n\n\t\t\t\t\tStudent Registration\n\n");
                    System.out.print("Admission Number : ");
                    admNo = reader.readLine();
                    System.out.print("\nRoll Number : ");
                    rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nFirst Name : ");
                    firstName = reader.readLine();
                    System.out.print("\nLast Name : ");
                    lastName = reader.readLine();
                    System.out.print("\nAge : ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nPhone Number : ");
                    phoneNo = reader.readLine();
                    
                    pStmnt.setString(1, admNo);
                    pStmnt.setInt(2, rollNo);
                    pStmnt.setString(3, firstName);
                    pStmnt.setString(4, lastName);
                    pStmnt.setInt(5, age);
                    pStmnt.setString(6, phoneNo);
                    try{
                        int rows = pStmnt.executeUpdate();
                        if(rows>0)
                        {
                             System.out.println("A new record added");
                        }
                    }catch(SQLException e){
                        System.out.print("An error occured...There have a chance of redundancy or internal failure.");
                    }
                    break;
                case 2 :
                    System.out.println("\n\n\t\t\t\t\tStudent Expultion\n\n");
                    System.out.println("\nWhich method you want to select :\n\t1.By Admission Number \n\t2.By Roll Number");
                    System.out.print("Select your choice : ");
                    int deleteMode = sc.nextInt();
                    if (deleteMode==1)
                    {
                        System.out.print("Enter the number:");
                        String delete = reader.readLine();
                        sql = "DELETE FROM STUDENT WHERE AdmNo = '"+ delete+"'";
                        try{
                             pStmnt =con.prepareStatement(sql);
                             pStmnt.execute();
                             System.out.println("Admission Number matching "+delete +" has been removed. He/She is no longer in database");
                        }catch(SQLException  e){
                            System.out.println(e);
                        }
                    }
                    else if(deleteMode==2){
                        System.out.print("Enter the number:");
                        String delete = reader.readLine();
                        int rollDelete = Integer.parseInt(delete);
                        sql = "DELETE FROM STUDENT WHERE RollNO = "+rollDelete;
                        pStmnt = con.prepareStatement(sql);
                        pStmnt.execute();
                        System.out.println("Roll Number matching "+delete +" has been removed. He/She is no longer in database");
                    }
                    else{
                        System.out.print("Invalid input");
                        break;
                    }
                    operation=3;
                case 3 :
                    System.out.println("\n\n\t\t\t\t\t\t\tStudent List\n\n");
                    sql="SELECT * FROM STUDENT ORDER BY RollNO ASC";
                    pStmnt= con.prepareStatement(sql);
                    result = pStmnt.executeQuery();
                    while(result.next()){
                        id = result.getInt("ID");
                        rollNo = result.getInt("RollNo");
                        age = result.getInt("Age");
                        admNo = result.getString("AdmNo");
                        firstName = result.getString("FirstName");
                        lastName = result.getString("LastName");
                        phoneNo = result.getString("PhoneNo");
                        System.out.println("\n ID :"+ id +"\t Roll Number : "+rollNo +"\t Admission Number : "+admNo+"\t Name:"+firstName+" "+lastName+"\t Age : "+age+"\t Phone Number : "+phoneNo+"\n");
                    } 
                    break;
                case 4:
                    System.out.print("You Log out from server");
                    break;
                default:
                    System.out.print("Invalid Input...try again...");
                    break;
            }
            
            
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.print("Database couldn't load. "+ex);
        }
        }while(operation==1 || operation ==2 || operation ==3);
    }
}
