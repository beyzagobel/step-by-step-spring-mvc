<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table class="table table-hover table-bordered" id="dataTables">
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

        <!-- JSP ile direk java kodları yazarak da aynı işlemi yapabilirz
       <% String cinsiyet = request.getParameter("cinsiyet");
        if(cinsiyet.equals("0")){
            cinsiyet = "Kadın";
        }
        else{
            cinsiyet="Erkek";
        }
        %>
        <td> <%=cinsiyet%> </td>
        -->

        <td><c:out value=" ${sinif}"></c:out></td>

    </tr>
    </tbody>
</table>
</body>
</html>
