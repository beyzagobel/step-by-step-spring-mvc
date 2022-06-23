<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</head>
<body>
<h2>All Employess</h2>
    <table style="width:100%" border="1">
        <tr>
            <th>Employee ID</th>
            <th>Employee First Name</th>
            <th>Employee Last Name</th>
            <th>Employee BirthDate</th>
            <th>Employee Gender</th>
            <th></th>
        </tr>
        <c:forEach items="${employeeList}" var="employeeList">
            <tr>
                <td><c:out value=" ${employeeList.employeeId}"></c:out></td>
                <td><c:out value=" ${employeeList.fname}"></c:out></td>
                <td><c:out value=" ${employeeList.lname}"></c:out></td>
                <td><c:out value=" ${employeeList.bdate}"></c:out></td>
                <c:choose>
                    <c:when test="${employeeList.gender == 0}">
                        <td>Female</td>
                    </c:when>
                    <c:when test="${employeeList.gender == 1}">
                        <td>Male</td>
                    </c:when>
                </c:choose>
                <td>
                    <button type="button" id="updateButton">Update</button>
                    <button type="button" id="deleteButton">Delete</button>
                </td>
            </tr>
        </c:forEach>


    </table>

<br><br>

<button type="button" onclick="window.location.href='saveOrUpdateEmployee'">Add</button>

<script src="<c:url value="/resources/js/employees.js"/>"></script>

</body>
</html>
