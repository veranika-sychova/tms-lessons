<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>My Account</title>
</head>
<body>
<h1>Welcome back!</h1>

<div>
    <ul>

        <c:forEach items="${tasks}" var="task">
        <li>
            <strong>Status:</strong> ${task.taskStatus}
            <br>
            <strong>Summary:</strong> ${task.text}
            <button onclick="changeStatus(this)">Change</button>
        </li>
        </c:forEach>

    </ul>
</div>
</p>

Create a new task:

<form method="post" action="http://localhost:8080/27/tasks">
    <div>
        <b>New task:</b>
        <input name="text"/>
    </div>

    <div>
        <input type="submit" name="submit" value="Submit">
    </div>

</form>

</body>
</html>