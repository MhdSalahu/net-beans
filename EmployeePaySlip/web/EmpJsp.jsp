<%-- 
    Document   : EmpJsp
    Created on : 19 Feb, 2024, 11:14:42 AM
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
         body {
            margin: auto;
            font-family: -apple-system, BlinkMacSystemFont, sans-serif;
            overflow: auto;
            background: linear-gradient(315deg, rgba(101,0,94,1) 3%, rgba(60,132,206,1) 38%, rgba(48,238,226,1) 68%, rgba(255,25,25,1) 98%);
            animation: gradient 15s ease infinite;
            background-size: 400% 400%;
            background-attachment: fixed;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;            
        }
        @keyframes gradient {
            0% {
                background-position: 0% 0%;
            }
            50% {
                background-position: 100% 100%;
            }
            100% {
                background-position: 0% 0%;
            }
        }
        .center-box{
            height: fit-content;
            width: fit-content;
            padding: 20px;
            background: linear-gradient(315deg, rgb(112, 3, 105) 3%, rgb(79, 154, 230) 38%, rgb(79, 224, 215) 68%, rgb(231, 81, 81) 98%);
            animation: gradient 15s ease infinite;
            background-size: 400% 400%;
            background-attachment: fixed;
            text-align: center;
            border-radius: 7px;
            color: white;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        }
        td{
            padding: 10px;
            background-color: white;
            color: black;
            border-radius: 5px;
        }
        table{
            border-spacing: 10px;
            font-size: large;
        }
    </style>
</head>
<body>
    <%
        String name=request.getParameter("empname");
        String no=request.getParameter("empno");
        int bs=Integer.parseInt(request.getParameter("bs"));
        int hra=Integer.parseInt(request.getParameter("hra"));
        int pf=Integer.parseInt(request.getParameter("pf"));
        int professionalTax;
        int deductions;
        int gross = bs+hra;
        int pt = gross - pf;
        if(pt <11999){
        professionalTax = 0;
    }
        else if(pt<17999)
        {
            professionalTax = 120;
        }
        else if(pt<29999)
        {
            professionalTax = 180;
        }
        else if(pt<44999)
        {
            professionalTax = 300;
        }
        else if(pt<59999)
        {
            professionalTax = 450;
        }
        else if(pt<74999)
        {
            professionalTax = 600;
        }
        else if(pt<99999)
        {
            professionalTax = 750;
        }
        else if(pt<124999)
        {
            professionalTax = 1000;
        }
        else
        {
            professionalTax = 1250;
        }
        deductions=professionalTax+pf;
        int netSalary = gross - deductions;
        %>
    <div class="center-box">
        <table>
            <tbody>
                <tr>
                    <td>Employee Name</td>
                    <td><b><% out.print(name); %></b></td>
                </tr>
                <tr>
                    <td>Employee Number</td>
                    <td><% out.print(no); %></td>
                </tr>
                <tr>
                    <td>Basic Salary</td>
                    <td><% out.print(bs); %></td>
                </tr>
                <tr>
                    <td>Provident Fund</td>
                    <td><% out.print(pf); %></td>
                </tr>
                <tr>
                    <td>House Rent Allowance</td>
                    <td><% out.print(hra); %></td>
                </tr>
                <tr>
                    <td><b>Net Salary</b></td>
                    <td><b><% out.print(netSalary); %></b></td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
