<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</head>
<body>
<h2>Hello World!</h2>

<div>
    <form action="javascript:void(0)">
        <label for="email">Email</label>
        <br>
        <input type="email" id="email" name="email" placeholder="Email..">
        <br>
        <label for="password">Password</label><br>
        <input type="password" id="password" name="password" placeholder="Password..">
        <br>
        <input type="submit" id="loginButton" value="Submit">
    </form>
</div>

<script src="<c:url value="/resources/js/login.js"/>"></script>

</body>
</html>
