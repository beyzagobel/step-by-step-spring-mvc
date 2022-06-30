<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<h2>All Employess</h2>
<table style="width:100%" border="1">
    <tr>
        <th>Employee ID</th>
        <th>Employee First Name</th>
        <th>Employee Last Name</th>
        <th>Employee Birthdate</th>
        <th>Employee Gender</th>
        <th>Employee Salary</th>
        <th>Department</th>
    </tr>
    <c:forEach items="${employeeList}" var="employee">
        <input type="hidden" value="<c:out value="${employee.fname}"/>" id="fname" name="fname">
        <input type="hidden" value="<c:out value="${employee.lname}"/>" id="lname" name="lname">
        <tr>
            <td><c:out value=" ${employee.employeeId}"></c:out></td>
            <td><c:out value=" ${employee.fname}"></c:out></td>
            <td><c:out value=" ${employee.lname}"></c:out></td>
            <td><c:out value=" ${employee.bdate}"></c:out></td>
            <c:choose>
                <c:when test="${employee.gender == 0}">
                    <td>Female</td>
                </c:when>
                <c:when test="${employee.gender == 1}">
                    <td>Male</td>
                </c:when>
            </c:choose>
            <td><c:out value=" ${employee.salary} $"></c:out></td>
            <td><c:out value=" ${employee.department.departmentName}"></c:out></td>
            <td>
                <a href="${pageContext.request.contextPath}/loadEmployee/${employee.employeeId}">GÜNCELLE</a>
                <button type="button" class="deleteButton"  data-id="${employee.employeeId}">Delete</button>
            </td>
        </tr>
    </c:forEach>


</table>

<br><br>


<button type="button" onclick="window.location.href='saveOrUpdateEmployee'">Add New Employee</button>

<script src="<c:url value="/resources/js/employee.js"/>"></script>

</body>

</html>
