<%-- 
    Document   : cnfrm
    Created on : 13 Feb, 2024, 12:50:39 PM
    Author     : NCAS LAB2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OOV Company</title>
        <Style>
        *{
            box-sizing: border-box;
            font-family: cursive;
        }
        body{
            padding: 16PX;
            text-align: center;
            background: rgb(238,174,202);
            background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
            width: 95vw;
            height: 95vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        h1{
            font-family: sans-serif;
            font-weight: bolder;
            color: rgb(45, 58, 73);
        }
        div{
            background-color: rgb(253, 229, 239);
            width: fit-content;
            padding: 20px;
            border-radius: 8px;
            box-shadow: inset;
            animation: boxAnimation 5s infinite;
        }
        @keyframes boxAnimation {
            50% {box-shadow: 10px 20px 30px rgb(138, 128, 128);}
        }
         h2 {
            position: relative;
            font-family: sans-serif;
            text-transform: uppercase;
            letter-spacing: 4px;
            overflow: hidden;
            background: linear-gradient(90deg, #000, #fff, #000);
            background-repeat: no-repeat;
            background-size: 80%;
            animation: animate 3s linear infinite;
            -webkit-background-clip: text;
            -webkit-text-fill-color: rgba(255, 255, 255, 0);
          }

          @keyframes animate {
            0% {
              background-position: -500%;
            }
            100% {
              background-position: 500%;
            }
          }

    </Style>
    </head>
    <body>
        <div>
    <h1>OOV Company</h1><br>
    <h2>Your Order is Confirmed</h2>
    
   </div>
    </body>
</html>
