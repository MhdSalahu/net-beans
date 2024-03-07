<%-- 
    Document   : emp
    Created on : 29 Feb, 2024, 10:31:47 AM
    Author     : NCAS LAB2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int bs= Integer.parseInt(request.getParameter("bs"));
            int hra= Integer.parseInt(request.getParameter("hra"));
            int pf= Integer.parseInt(request.getParameter("pf"));
            int net = bs+hra-pf;
            out.println("Employee Name :"+ request.getParameter("name") +"<br>");
            out.println("\nEmployee Number :"+ request.getParameter("number")+"<br>");
            out.println("\nEmployee Basic Salary :"+ bs+"<br>");
            out.println("\nEmployee House rent allowance :"+ hra+"<br>");
            out.println("\nEmployee Provident Fund :"+ pf+"<br>");
            out.println("\n\nEmployee Net Salary :"+ net+"<br>");



            %>
        
    </body>
</html>
