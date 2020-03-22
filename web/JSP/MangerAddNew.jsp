<%@ page import="java.util.Date" %>
<%@ page import="model.news" %>
<%@ page import="data.dataAccess" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Danuja Fernando
  Date: 3/22/2020
  Time: 1:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp page</title>
</head>
<body>
    <%
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String dateTemp = new String(String.valueOf(System.currentTimeMillis()));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(dateTemp);
        String detail = request.getParameter("detail");
        String category = request.getParameter("category");
        String image = request.getParameter("image");

        news n = new news(0,title, date, description, detail, category, image);
        dataAccess da = new dataAccess();
        da.addNew(n);

        response.sendRedirect("allpost");

    %>
</body>
</html>
