<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>

<div>
    <form action="javascript:void(0)">
        <label for="email">Email</label>
        <br>
        <input type="email" id="email" name="email" placeholder="Email..">
        <br>
        <label for="password">Password</label><br>
        <input type="password" id="password" name="password" placeholder="Password..">
        <br>
        <input type="submit" id="loginButton" value="Submit">
    </form>
</div>


<script>
    $("#loginButton").click(function () {
        let url = "loginKontrol";
        let email = $("#email").val();
        let password = $("#password").val();
        if (email && password) {
            $.ajax({
                type: "POST",
                url: url,
                data: {
                    email: email,
                    password: password
                },
                success: function (response) {
                    alert("Login Successful!")
                    window.location.href = "welcome";
                },
                dataType: "json"
            });
        } else {
            alert("Login Failed!")
        }
    });
</script>
</body>
</html>
