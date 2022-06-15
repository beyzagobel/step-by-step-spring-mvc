<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listele</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/listele.css"/> ">

</head>
<body>

<table class="table table-hover table-bordered" id="dataTables" style="width:50%">
    <thead>
    <tr>
        <th>İsim </th>
        <th>Soyisim</th>
        <th>Cinsiyet</th>
        <th>Sinifi</th>
    </tr>
    </thead>

    <tbody>
    <tr>

        <!--JSTL kütüphanesi ile cinsiyete karşılık gelen sayıyıya göre Erkek veya Kadın olarak ekrana yazdırır-->
        <td><c:out value=" ${isim}"></c:out></td>
        <td><c:out value=" ${soyisim}"></c:out></td>

        <c:if test="${cinsiyet==0}">
            <td>Kadın</td>
        </c:if>
        <c:if test="${cinsiyet == 1}">
            <td>Erkek</td>
        </c:if>


        <td><c:out value=" ${sinif}"></c:out></td>
    </tr>
    </tbody>
</table>

<a href="${pageContext.request.contextPath}/kaydet">Kullanıcı Kayıt Formu</a>


</body>
</html>
