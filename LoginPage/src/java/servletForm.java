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
@WebServlet(urlPatterns = {"/servletForm"})
public class servletForm extends HttpServlet {

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
           String username = request.getParameter("username");
           String password = request.getParameter("password");
           
           System.out.println("username : "+username);
           System.out.println("username : "+password);
           PrintWriter writer = response.getWriter();
           String htmlResponse="<!DOCTYPE html> <html lang=\"en\"> <head> <meta charset=\"UTF-8\"> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> <title>Home Page | XYZ Company</title> <link rel=\"icon\" href=\"https://i.postimg.cc/2528K56n/favicon-16x16.png\"> <style> body{ display: flex; justify-content: center; align-items: center; font-family: sans-serif; height: 100vh; width: 100vw; overflow: hidden; background: rgb(192,215,255); background: linear-gradient(117deg, rgba(192,215,255,1) 0%, rgba(201,216,241,1) 20%, rgba(122,172,255,1) 30%, rgba(122,172,255,1) 70%, rgba(201,216,241,1) 80%, rgba(192,215,255,1) 100%); box-sizing: border-box; } .center-container{ padding: 25px; background-color: #21395f; color: white; text-align: center; font-size: larger; width:fit-content; height: fit-content; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.7), 0 6px 20px 0 rgba(0, 0, 0, 0.7); } </style> </head> <body> <div class=\"center-container\"> <table> <tbody> <tr> <td>Username : </td> <td><b>";
           htmlResponse +=username;
           htmlResponse +="</tr> <tr> <td></td> <td></td> </tr> <tr> <td>Password : </td> <td>";
           htmlResponse +=password;
           htmlResponse +="</td></tr></tbody></table></div></body></html>";
           writer.println(htmlResponse);

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
