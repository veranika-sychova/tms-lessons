<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Запись на курс</title>
</head>

<body>

<h1>Запись на курсы</h1>
<hr style="border-width: 2px;"/>

<div style="color: red">
<%= (request.getAttribute("errorMessage") != null) ? request.getAttribute("errorMessage") : "" %>
</div>

<form method="post" action="/26/enrollment">

    <div>
        <b>Имя:</b>
        <br/>
        <input type="text" name="name" value="<%= (request.getAttribute("formName") != null) ? request.getAttribute("formName") : "" %>"/>
    </div>
    <p/>

    <div>
        <b>Язык программирования:</b>
        <br/>
        <input type="radio" name="programming-language" value="C++" <%= "C++".equals(request.getAttribute("formPL")) ? "checked" : "" %>> C++ </input>
        <br/>
        <input type="radio" name="programming-language" value="PHP" <%= "PHP".equals(request.getAttribute("formPL")) ? "checked" : "" %>> PHP </input>
        <br/>
        <input type="radio" name="programming-language" value="Python" <%= "Python".equals(request.getAttribute("formPL")) ? "checked" : "" %>> Python </input>
    </div>
    <p/>


    <p/>
    <div>
        <b>Секретное слово:</b>
        <br/>
        <input type="password" name="password"></input>
    </div>

    <p/>
    <div>
        <input type="submit" name="submit" value="Отправить">
        <input type="reset" name="cancel" value="Очистить">
    </div>

</form>

</body>
</html>