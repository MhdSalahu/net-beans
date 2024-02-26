<%-- 
    Document   : ms
    Created on : 13 Feb, 2024, 10:39:12 AM
    Author     : NCAS LAB2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Board</title>
        <link rel="icon" href="https://i.postimg.cc/2528K56n/favicon-16x16.png">
    <style>
         *{
            box-sizing: border-box;
        }
        body{
            padding: 16px;
            text-align: center;
            background-color: #1B1A55;
            color: white;
            font-family:cursive;
        }
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            font-size: larger;
            padding: 15px;
            width: 50%;
            }

        td, th {
        border: 1px solid #dddddd;
        padding: 15px;
        }
        #table{
            width: 100%;
            display: flex;
            justify-content: center;
        }
        b{
            font-size: x-large;
        }
        span{
            width: 17rem;
            padding: 15px;
            font-size: large;
        }
        #details{
            text-align: left;
            font-size: medium;
            background-color: #535C91;
            border-radius: 5px;
            width: 100%;
            padding: 16px;
            margin: 10px;
        }
        #colour{
            color:red;
            font-weight:bold;
            background-color: #FEFBF6;
            animation: boxAnimation 5s infinite;
        }
        @keyframes boxAnimation {
            50% {box-shadow: inset rgba(60, 70, 85, 0.5) 0px 0px 40px 0px, inset rgba(60, 70, 85, 0.5) 0px 0px 40px 0px, inset rgba(0, 0, 0, 1) 0px 0px 36px -24px;}
        }
        
        <%
            int DM = Integer.parseInt(request.getParameter("DM"));
            int AOS = Integer.parseInt(request.getParameter("AOS"));
            int PHP = Integer.parseInt(request.getParameter("PHP"));
            String reg = request.getParameter("regno");
            String name = request.getParameter("name");
            
            String valueStatus;

            int total = DM+AOS+PHP;
            double avg = total/3;
            double ratio = total/300.0;
            
            if(ratio>0.5){
                               valueStatus="Passed";
                            }
                            else{
                                valueStatus="Failed";
                            }
            %>
    </style>
    </head>
    <body onload="status()">
        <h1>Result Board</h1>
    <br>
    <div id="details">
        <span>Reg Number </span>: 
        <%
            out.print(reg);
            %>
        <br><br>
        <span>Name </span>:
        <%
            out.print(name);
            %>
    </div id="table">
    <br>
    <div id="table">
        <table>
            <thead>
                <tr>
                    <th>Sub</th>
                    <th colspan="2">Mark</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>DM</td>
                    <td colspan="2">
                        <%
                            out.print(DM);
                            %>
                    </td>
                </tr>
                <tr>
                    <td>AOS</td>
                    <td colspan="2">
                         <%
                            out.print(AOS);
                            %>
                    </td>
                </tr>
                <tr>
                    <td>PHP</td>
                    <td colspan="2">
                         <%
                            out.print(PHP);
                            %>
                    </td>
                </tr>
                <tr>
                    <td rowspan="2" id="colour" >
                        <%
                                out.print(valueStatus);
                            %>
                    </td>
                    <td><b>Total</b></td>
                    <td><b>Average</b></td>
                </tr>
                <tr>
                    <td>
                         <%
                            out.print(total);
                            %>
                    </td>
                    <td>
                         <%
                            out.print(avg);
                            %>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
                    <script>
                                function status()
                                {
                                    var status = <%= ratio %>;
                                    var dm = <%= DM %>;
                                    var aos = <%= AOS %>;
                                    var php = <%= PHP %>;
                                    if(dm >100 || aos >100 || php > 100)
                                    {
                                        alert("Entered Mark Exceeded Limit (100)");
                                        window.close();
                                        window.history.back();
                                    }
                                    if(status>0.5)
                                    {
                                        document.getElementById("colour").style.color="green";
                                    }

                                }
                    </script>
    </body>
</html>
