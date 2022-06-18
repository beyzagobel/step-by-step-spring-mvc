<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h1><c:out value="${baslik}"/> </h1>
<h2></h2>
<a  href="?lang=tr_TR">Turkish</a>
<a href="?lang=en_US">English</a>

<p>Mevcut Locale: ${pageContext.response.locale} / ${locale} </p>

</body>
</html>
