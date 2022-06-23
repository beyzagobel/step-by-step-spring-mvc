<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL SQL QUERY TAG</title>
</head>
<body>
<h2>Employees</h2>

<!-- Bu projede veritabanından sorgu çekmeyi öğrenmediğimiz için
bende burada JSTL kütüphanesinin SQL tag'ı ile veritabanı bağlantısı
ve sonrasında veritabanında veri çekme işlemi gerçekleştirdim. -->

<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/crud?characterEncoding=utf-8"
user="root"/>

<sql:query var="employee" dataSource="${db}">
    SELECT * from Employee;
</sql:query>

<table width="100%" border="1">
    <tr>
        <th>Employee ID</th>
        <th>Employee First Name</th>
        <th>Employee Last Name</th>
        <th>Employee BirthDate</th>
        <th>Employee Gender</th>
    </tr>
    <c:forEach var="table" items="${employee.rows}">
        <tr>
            <td><c:out value="${table.employee_id}"/> </td>
            <td><c:out value="${table.fname}"/></td>
            <td><c:out value="${table.lname}"/></td>
            <td><c:out value="${table.bdate}"/></td>
            <!-- Switch ifadesinin karşılığıdır. Gender(cinsiyet) veritabanında int değer olarak tutulut fakat son kullanıcıya int değer yerine
                 değerin karşıladığı gösterilir.-->
            <c:choose>
                <c:when test="${table.gender == 0}">
                    <td>Female</td>
                </c:when>
                <c:when test="${table.gender == 1}">
                    <td>Male</td>
                </c:when>
            </c:choose>

        </tr>
    </c:forEach>
</table>


</body>
</html>
