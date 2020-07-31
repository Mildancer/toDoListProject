<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<h2>TODO list</h2>

<h1>your list</h1>

<table>
    <tr>
        <th>ID</th>
        <th>name Of Task</th>
        <th>isItDone</th>
        <th>startingDate</th>
        <th>endDate</th>
        <th>comment</th>
    </tr>
    <c:forEach items="${toDoList}" var="singleTask">
        <tr>
            <td>${singleTask.id}</td>
            <td>${singleTask.nameOfTask}</td>
            <td>${singleTask.isItDone}</td>
            <td>${singleTask.startingDate}</td>
            <td>${singleTask.endDate}</td>
            <td>${singleTask.comment}</td>
        </tr>
    </c:forEach>
</table>



<%--<table>--%>
<%--    <c:forEach items="${products}" var="product">--%>
<%--        <tr>--%>
<%--            <td>${product.name}</td>--%>
<%--            <td><a href="product?id=${product.id}">detail</a></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>




</body>
</html>
