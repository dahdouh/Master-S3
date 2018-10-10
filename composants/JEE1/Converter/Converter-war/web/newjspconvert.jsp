<%-- 
    Document   : newjspconvert
    Created on : Oct 10, 2018, 10:40:54 AM
    Author     : pmissechanab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean class="converter.ConverterBean" id="beanConv"/>
        <%@page import="java.util.*" %>
        <%String currencyCode = request.getParameter("currencyType");
          String amount=request.getParameter("amount");
          Double d=new Double(1);
          if( amount != null && amount.length()>0)
            {d=new Double(amount);} 
            double res=beanConv.euroToOtherCurrency(d.doubleValue(),currencyCode);
           out.println(amount+" "+currencyCode+"="+res+"Euros.");
        %>

        <h1>Hello World!</h1>
    </body>
</html>
