<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">

</head>
<body>

<table id="employeeDataTable" class="table table-striped table-bordered" style="width:100%">
    <thead>
    <tr>
        <th>employeeId</th>
        <th>fname</th>
    </tr>
    </thead>
</table>


<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>

<script src="<c:url value="/resources/js/database.js"/> "></script>

</body>
</html>
