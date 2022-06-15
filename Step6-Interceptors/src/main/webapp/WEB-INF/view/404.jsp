<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Internal Server Error</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/404.css"/> ">
</head>
<body>
<body cz-shortcut-listen="true">
<div id="notfound">
    <div class="notfound">
        <div class="notfound-404">
            <h1>4<span>0</span>4</h1>
        </div>
        <p>The page you are looking for might have been removed had its name changed or is temporarily unavailable.</p>
        <a href="${pageContext.request.contextPath}">home page</a>
    </div>
</div>



</body>

</body>
</html>
