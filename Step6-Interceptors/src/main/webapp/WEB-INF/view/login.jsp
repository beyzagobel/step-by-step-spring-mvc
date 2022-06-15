<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <title>LOGIN</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/login.css"/> ">

</head>
<body>

<div>
    <form action="javascript:void(0)">
        <label for="email">First Name</label><br>
        <input type="email" id="email" name="email" placeholder="Email..">
        <br>
        <label for="password">Last Name</label>,
        <br>
        <input type="password" id="password" name="password" placeholder="Password..">

        <br>
        <input type="submit" id="loginButton" value="Submit">
    </form>
</div>

<script>
    $("#loginButton").click(function() {
        let url = "loginKontrol";
        let email = $("#email").val();
        let password = $("#password").val();
        if(email &&password) {
            $.ajax({
                type: "POST",
                url: url,
                data: {
                    email : email,
                    password : password
                },
                success: function (response) {
                    alert("Giriş Başarılı!")
                    window.location.href = "welcome";
                },
                dataType: "json"
            });
        }
        else {
            alert("Giriş Başarısız!")
        }
    });
</script>

</body>
</html>
