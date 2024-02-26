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
@WebServlet(urlPatterns = {"/table"})
public class table extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int dm1 = Integer.parseInt( request.getParameter("dm1"));
            int dm2 = Integer.parseInt( request.getParameter("dm2"));
            int dm3 = Integer.parseInt( request.getParameter("dm3"));
            int dm4 = Integer.parseInt( request.getParameter("dm4"));
            
            int os1 = Integer.parseInt( request.getParameter("os1"));
            int os2 = Integer.parseInt( request.getParameter("os2"));
            int os3 = Integer.parseInt( request.getParameter("os3"));
            int os4 = Integer.parseInt( request.getParameter("os4"));
            
            int java1 = Integer.parseInt( request.getParameter("java1"));
            int java2 = Integer.parseInt( request.getParameter("java2"));
            int java3 = Integer.parseInt( request.getParameter("java3"));
            int java4 = Integer.parseInt( request.getParameter("java4"));
            
            int ai1 = Integer.parseInt( request.getParameter("ai1"));
            int ai2 = Integer.parseInt( request.getParameter("ai2"));
            int ai3 = Integer.parseInt( request.getParameter("ai3"));
            int ai4 = Integer.parseInt( request.getParameter("ai4"));
            
            int php1 = Integer.parseInt( request.getParameter("php1"));
            int php2 = Integer.parseInt( request.getParameter("php2"));
            int php3 = Integer.parseInt( request.getParameter("php3"));
            int php4 = Integer.parseInt( request.getParameter("php4"));
            
            int total1 = dm1+os1+java1+ai1+php1;
            int total2 = dm2+os2+java2+ai2+php2;
            int total3 = dm3+os3+java3+ai3+php3;
            int total4 = dm4+os4+java4+ai4+php4;
            
            double perc1 = (total1/500.0)*100;
            double perc2 = (total2/500.0)*100;
            double perc3 = (total3/500.0)*100;
            double perc4 = (total4/500.0)*100;

            
            PrintWriter write = response.getWriter();
            
            String sname1 = request.getParameter("sname1");
            String sname2 = request.getParameter("sname2");
            String sname3 = request.getParameter("sname3");
            String sname4 = request.getParameter("sname4");
            
            String rno1 = request.getParameter("rno1");
            String rno2 = request.getParameter("rno2");
            String rno3 = request.getParameter("rno3");
            String rno4 = request.getParameter("rno4");

            
            String htmlResponse = "<html lang=\"en\"> <head> <meta charset=\"UTF-8\"> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> <title>Student Mark</title> <style> *{ box-sizing: border-box; } body{ text-align: center; font-family: sans-serif; } table{ width: 100%; table-layout: fixed; white-space: pre-wrap; word-break: break-word; padding: 15px; } table { font-family: arial, sans-serif; border-collapse: collapse; } thead{ font-weight: bolder; padding: 7px; } td, th { border: 1px solid #dddddd; padding: 7px; } </style> </head> <body> <h1>Student Database</h1> <table> <thead> <tr> <td>Sl.no</td> <td>Reg No</td> <td>Name</td> <td>Total</td> <td>Perc</td> </tr> </thead> <tbody> <tr> <td>1</td> <td>";
            htmlResponse +=rno1;
            htmlResponse += "</td><td>";
            htmlResponse +=sname1;
            htmlResponse += "</td><td>";
            htmlResponse +=total1;
            htmlResponse += "</td><td>";
            htmlResponse +=perc1+"%";
            htmlResponse += "</td></tr></thead><tbody><tr><td>2</td><td>";
            
            htmlResponse +=rno2;
            htmlResponse += "</td><td>";
            htmlResponse +=sname2;
            htmlResponse += "</td><td>";
            htmlResponse +=total2;
            htmlResponse += "</td><td>";
            htmlResponse +=perc2+"%";
            htmlResponse += "</td></tr><tr><td>3</td><td>";
            
            htmlResponse +=rno3;
            htmlResponse += "</td><td>";
            htmlResponse +=sname3;
            htmlResponse += "</td><td>";
            htmlResponse +=total3;
            htmlResponse += "</td><td>";
            htmlResponse +=perc3+"%";
            htmlResponse += "</td></tr><tr><td>4</td><td>";
            
            htmlResponse +=rno4;
            htmlResponse += "</td><td>";
            htmlResponse +=sname4;
            htmlResponse += "</td><td>";
            htmlResponse +=total4;
            htmlResponse += "</td><td>";
            htmlResponse +=perc4+"%";
            htmlResponse += "</td></tr></tbody></table></body></html>";
            
            write.println(htmlResponse);
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
