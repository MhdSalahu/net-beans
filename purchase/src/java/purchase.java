/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NCAS LAB2
 */
@WebServlet(urlPatterns = {"/purchase"})
public class purchase extends HttpServlet {
    
    
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int quantity = Integer.parseInt(request.getParameter("qty"));
        int price = Integer.parseInt(request.getParameter("price"));
        String name = request.getParameter("iname");
        name=name.substring(0, 1).toUpperCase()+name.substring(1);
        int totalamount = quantity*price;
        
        int quantity1 = Integer.parseInt(request.getParameter("qty1"));
        int price1 = Integer.parseInt(request.getParameter("price1"));
        String name1 = request.getParameter("iname1");
        name1=name1.substring(0, 1).toUpperCase()+name1.substring(1);
        int totalamount1 = quantity1*price1;
        
        int quantity2 = Integer.parseInt(request.getParameter("qty2"));
        int price2 = Integer.parseInt(request.getParameter("price2"));
        String name2 = request.getParameter("iname2");
        name2=name2.substring(0, 1).toUpperCase()+name2.substring(1);
        int totalamount2 = quantity2*price2;

        int totalamount3 = totalamount1+totalamount2+totalamount;
        
        PrintWriter writer = response.getWriter();
        String htmlResponse = "<!DOCTYPE html> <html lang=\"en\"> <head> <meta charset=\"UTF-8\"> "
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> <title>Calculator</title> <style> body{ box-sizing: border-box; padding: 10px; font-family: sans-serif; text-align: center; } table { font-family: arial, sans-serif; border-collapse: collapse; width: 75%; } thead{ font-weight: bolder; padding: 10px; } td, th { border: 1px solid #dddddd; padding: 10px; } input{ border: 0px solid black; width: 100%; height: 5vh; } input[type=submit] { background-color: #4CAF50; color: white; width: fit-content; margin: 5px; padding-inline: 10px; font-size: medium; border: none; border-radius: 4px; cursor: pointer; } input[type=submit]:hover{ scale: 1.1; background-color: #d48831; } span{ font-size: xx-large; color: #ce693a; } div{ justify-content: center; width: 100%; display: flex; } span:hover{ color: rgb(122, 184, 163); } </style> </head> <body> <h1>PURCHASE TOTAL FORM</h1> <div>";
               
        htmlResponse+="  <table> <thead> <tr> <td>Item Name</td> <td>Total Price</td> </tr> </thead> <tbody> <tr> <td>"+name+"</td> <td>"+totalamount+"</td> </tr> <tr> <td>"+name1+"</td> <td>"+totalamount1+"</td> </tr> <tr> <td>"+name2+"</td> <td>"+totalamount2+"</td> </tr> </tbody> </table> </div> <h2>Total amount is &nbsp;&nbsp;<span>"+totalamount3+"</span> </h2> </body> </html>";
        

        writer.println(htmlResponse);
        
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet purchase</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet purchase at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet purchase</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet purchase at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */




    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */


