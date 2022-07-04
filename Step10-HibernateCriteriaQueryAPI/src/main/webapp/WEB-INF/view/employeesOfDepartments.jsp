<%@ page import="net.sf.json.JSONObject" %>
<%@ page import="java.util.List" %>
<%@ page import="com.beyzagobel.model.Employee" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>


<label for="departmentId">Department</label>
<select name="department" id="departmentId" onchange="window.location.href='employeesOfDepartments/'+this.value">
    <c:forEach items="${departmentList}" var="department">
        <option value="${department.departmentId}">${department.departmentName}</option>
    </c:forEach>
</select>
<br><br>

<div>
    <table style="width:100%" border="1">
        <tr>
            <th>Employee First Name</th>
            <th>Employee First Name</th>
            <th>Employee Last Name</th>
        </tr>

        <c:forEach items="${employeeList}" var="employee">
            <tr>

                <td><c:out value=" ${employee.employeeId}"></c:out></td>
                <td><c:out value=" ${employee.fname}"></c:out></td>
                <td><c:out value=" ${employee.lname}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
</div>


<script src="<c:url value="/resources/js/employeesOfDepartments.js"/> "></script>
</body>
</html>
