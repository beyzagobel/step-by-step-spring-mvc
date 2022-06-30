<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Department</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<div>
    <form action="javascript:void(0)">

        <input type="hidden" value="<c:out value="${department.departmentId}"/>" id="departmentId" name="employeeId">
        <input type="hidden" value="${pageContext.request.contextPath}/saveOrUpdateDepartment" id="saveOrUpdateDepartmentUrl">
        <input type="hidden" value="${pageContext.request.contextPath}/department" id="departmentRedirectUrl">

        <label for="departmentName">Department Name:</label>
        <input type="text" id="departmentName" name="departmentName" value="<c:out value="${department.departmentName}"/>">
        <br><br>
        <input type="submit" id="saveOrUpdateDepartment" value="Save Department">


    </form>
</div>

<script src="<c:url value="/resources/js/department.js"/>"></script>

</body>
</html>
