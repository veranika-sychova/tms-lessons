<%@ page contentType="text/html; charset=UTF-8" language= "java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head></head>

<body>

<spring:message code="result.message"/>

<br/>
<c:forEach items="${books}" var="book">
    ${book.name}
    ${book.id}
    ${book.author}
</c:forEach>

</body>

</html>
