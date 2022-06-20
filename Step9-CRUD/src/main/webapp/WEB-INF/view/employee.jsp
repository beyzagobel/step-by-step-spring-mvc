<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <link rel="stylesheet" href="<c:url value="/resources/js/employee.js"/>">
</head>
<body>
<h2>All Employess</h2>
<table style="width:100%" border="1">
    <tr>
        <th>Employee ID</th>
        <th>Employee First Name</th>
        <th>Employee Last Name</th>
        <th>Employee Gender</th>
        <th>Employee BirthDate</th>
        <th> </th>
    </tr>
    <tr>
        <td><c:out value=""/> </td>
        <td>Tobias</td>
        <td>Linus</td>
        <td>Emil</td>
        <td>Tobias</td>
        <td>
            <button type="button" id="buttonUpdate">Update</button>
            <button type="button" id="buttonDelete">Delete</button>
        </td>
    </tr>

</table>

<br><br>

<button type="button">Add</button>

</body>
</html>
