<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="">
        <label for="email"><spring:message code="email"/></label>
        <br>
        <input type="email" id="email" name="email" placeholder="<spring:message code="email"/>">
        <br>
        <label for="password"><spring:message code="sifre"/></label>
        <br>
        <input type="password" id="password" name="password" placeholder="<spring:message code="sifre"/>">
        <br>
        <input type="submit" id="loginButton" value="<spring:message code="giris"/>">
    </form>
</div>
<a href="?lang=tr_TR">Turkish</a>
<a href="?lang=en_US">English</a>
</body>
</html>
