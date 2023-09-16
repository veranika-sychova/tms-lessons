<%@ page contentType="text/html; charset=UTF-8" language= "java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head></head>

<body>

This is search result:

<br/>
<c:forEach items="${books}" var="book">
    ${book.name}
    ${book.id}
    ${book.author}
</c:forEach>

</body>

</html>
