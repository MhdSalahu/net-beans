<%-- 
    Document   : session
    Created on : 26 Feb, 2024, 3:09:26 PM
    Author     : NCAS LAB2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            text-align: center;
            overflow: hidden;
        }
        a {
            box-shadow: inset 0 0 0 0 #54b3d6;
            color: #54b3d6;
            padding: 0 .25rem;
            margin: 0 -.25rem;
            transition: color .3s ease-in-out, box-shadow .3s ease-in-out;
        }
            a:hover {
            color: #fff;
            box-shadow: inset 200px 0 0 0 #54b3d6;;
        }

        a {
            color: #54b3d6;
            font-family: 'Poppins', sans-serif;
            font-size: 27px;
            font-weight: 700;
            line-height: 1.5;
            text-decoration: none;
        }

            body {
            display: grid;
            height: 100vh;
            place-items: center;
        }
    </style>
</head>
<body>
    <%
        String uname = request.getParameter("name");
        session.setAttribute("sessionName", uname);
        %>
    <h1>
        <% out.print("Welcome "+uname); %><br><br>
        <a href="output.jsp">Click Here</a>
    </h1>
</body>
</html>