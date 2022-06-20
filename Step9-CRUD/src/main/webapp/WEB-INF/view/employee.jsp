<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
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



<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script>
    $("#buttonUpdate").click(function () {
        let url = "";
        let email = $("#email").val();

        if(email ) {
            $.ajax({
                type: "POST",
                url: url,
                data: {
                    email : email,

                },
                success: function (response) {
                    alert("Success!")
                },
                dataType: "json"
            });
        }
        else {
            alert("Failed!")
        }
    });
</script>

</body>
</html>
