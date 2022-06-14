<%@page language="java" contentType="text/html; ISO-8859-1; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Spring MVC</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index.css"> <!-- dinamik prefix/paga context -->
    <link href="<c:url value="/resources/css/index.css" />" rel="stylesheet" > <!-- JSTL kütüphanesi ile de css dosyalarına erişilebilir -->

</head>
<body>

<h2>Hello World!</h2>

<img src="<c:url value="/resources/images/springMvc.png" />" alt=""> <!-- JSTL kütüphanesi ile sabitlere erişebiliriz -->
<img src="resources/springMvc.png" alt="">   <!-- JSTL kütüphanesi eklenmedende static kaynaklara erişilebilir -->

</body>
</html>
