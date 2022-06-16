<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>

<div class="log-form">
    <h2>Login to your account</h2>
    <form>
        <input type="text" title="username" placeholder="username" />
        <input type="password" title="username" placeholder="password" />
        <button type="submit" class="btn" id="loginButton">Login</button>

    </form>
</div>


<script>
    $("#loginbtn").click(function () {
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
                    alert("Login Successful!")
                    window.location.href = "welcome";
                },
                dataType: "json"
            });
        }
        else {
            alert("Login Failed!")
        }
    });
</script>
</body>
</html>
