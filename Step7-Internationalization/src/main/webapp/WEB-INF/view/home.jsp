<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spring MVC 5 Locale Resolver</title>
</head>
<body>
<h1>${baslik} </h1>
<h1><spring:message code="baslik"/></h1>  <!-- Spring JSTL'in sağladığı etiketle .proporties dosyasının okunması -->

<a href="?lang=tr_TR">Turkish</a>
<a href="?lang=en_US">English</a>
<p>Mevcut Locale: ${pageContext.response.locale} / ${locale} </p>

</body>

</html>
