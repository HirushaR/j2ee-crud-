<%--
  Created by IntelliJ IDEA.
  User: Danuja Fernando
  Date: 3/22/2020
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<html>
<head>
    <title>all post</title>
</head>
<body>
 <div style="width: 1200px; margin-right: auto;margin-left: auto">
     <table cellpadding="10">
         <tr>
             <th>Id</th>
             <th>Title</th>
             <th>Description</th>
             <th>details</th>
             <th>categoty</th>
             <th>date</th>
             <th>image</th>
             <th></th>
         </tr>
         <c:forEach item="${allpost}" var="p">
         <tr>
             <td>${p.id}</td>
             <td>${p.title}</td>
             <td>${p.description}</td>
             <td>${p.detail}</td>
             <td>${p.category}</td>
             <td>${p.date}</td>
             <td>${p.image}</td>
             <td>
                 <a href="edit?id=${p.id}">Edit</a>
                 <a href="delete?id=${p.id}">Delete</a>
             </td>
         </tr>
         </c:forEach>
     </table>
 </div>
</body>
</html>
