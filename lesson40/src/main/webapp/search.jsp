<%@ page contentType="text/html; charset=UTF-8" language= "java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head></head>

<body>

<spring:message code="greeting.message"/>

<form method="post" action="/40/books">

    <div>
        <br/>
        <input type="text" name="name"/>
    </div>
    <p/>

</form>
</body>

</html>
