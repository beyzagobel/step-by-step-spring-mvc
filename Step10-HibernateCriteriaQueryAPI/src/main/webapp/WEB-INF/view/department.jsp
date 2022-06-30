<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<table style="width:100%" border="1">
    <tr>
        <th>Department ID</th>
        <th>Department Name</th>

    </tr>
    <c:forEach items="${departmentList}" var="department">

        <input type="hidden" value="<c:out value="${department.departmentame}"/>" id="departmentame" name="departmentame">
        <tr>
            <td><c:out value=" ${department.departmentId}"></c:out></td>
            <td><c:out value=" ${department.departmentName}"></c:out></td>

            <td>
                <a href="${pageContext.request.contextPath}/loadDepartment/${department.departmentId}">GÜNCELLE</a>
                <button type="button" class="deleteDepartmentButton"  data-id="${department.departmentId}">Delete</button>
            </td>
        </tr>
    </c:forEach>

</table>

<script src="<c:url value="/resources/js/department.js"/>"></script>

</body>
</html>
