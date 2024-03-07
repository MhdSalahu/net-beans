/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NCAS LAB2
 */
public class JDBCconnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String dbURL = "jdbc:ucanaccess://C:\\msc1\\java\\prgrm10\\Student.accdb";
            Connection con = DriverManager.getConnection(dbURL);
            
//            String sql = "INSERT INTO Student(Student_ID,FirstName,LastName,Age,PhoneNumber) VALUES"
//                    +"(1,'Mhd','Salahu',20,'9876543210')";
//            Statement stmnt = con.createStatement();
//            int rows = stmnt.executeUpdate(sql);

//            String sql = "INSERT INTO Student(Student_ID,FirstName,LastName,Age,PhoneNumber) VALUES(?,?,?,?,?)";
//                    
//            PreparedStatement stmnt = con.prepareStatement(sql);
//            
//            stmnt.setInt(1, 2);
//            stmnt.setString(2, "Mhd");
//            stmnt.setString(3, "Bishr");
//            stmnt.setInt(4, 21);
//            stmnt.setString(5,"1234567890");
//
//            int rows = stmnt.executeUpdate();
//            
//            if(rows>0)
//            {
//                System.out.println("A new record added");
//            }

            String sql="SELECT * FROM STUDENT";
            Statement stmnt = con.createStatement();
            ResultSet result = stmnt.executeQuery(sql);
            System.out.println("ID"+" "+"First name"+"     "+"lastName"+"      "+"age"+"      "+"phone");
            while(result.next())
            {
                int id =result.getInt("Student_ID");
                String firstName = result.getString("FirstName");
                String lastName = result.getString("LastName");
                int age = result.getInt("Age");
                String phone = result.getString("PhoneNumber");

                System.out.println(id+"       "+firstName+"         "+lastName+"      "+age+"    "+phone);
            }
            
            con.close();
            System.out.println("MS access db connected"+con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCconnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
