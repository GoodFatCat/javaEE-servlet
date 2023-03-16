<%--
  Created by IntelliJ IDEA.
  User: Crazy
  Date: 17.08.2022
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>First JSP</h1>
    <p>
        <%@ page import="java.util.Date, java.util.Scanner" %>

        <%


            String some = request.getParameter("some");

//            Scanner scanner = new Scanner("somePath");
        %>

        <%= some %>
        <%= new Date() %>
    </p>
</body>
</html>
