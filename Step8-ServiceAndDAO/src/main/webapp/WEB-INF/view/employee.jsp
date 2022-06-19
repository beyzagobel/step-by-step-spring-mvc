<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <title></title>
</head>
<body>
<h2>Save Employee</h2>
<form action="javascript:void(0)">
    <label for="fname">First name:</label>
    <input type="text" id="fname" name="fname">
    <br><br>
    <label for="lname">Last name:</label>
    <input type="text" id="lname" name="lname">
    <br><br>
    <label for="bdate">Date:</label>
    <input type="date" id="bdate" >
    <br><br>
    <label for="gender">Gender</label>
    <select name="gender" id="gender">
        <option value="0">Female</option>
        <option value="1">Male</option>
    </select>
    <br><br>
    <input type="submit" id="saveButton" value="Kaydet">
</form>

<script>
    $("#saveButton").click(function (){
        let url ="kaydet";
        let fname = $("#fname").val();
        let lname = $("#lname").val();
        let bdate = $("#bdate").val();
        let gender = $("#gender").val();

        if(fname && lname) {
            $.ajax({
                type: "POST",
                url: url,
                data:{
                    fname : fname ,
                    lname : lname ,
                    bdate : bdate ,
                    gender : gender
                },
                success: function (response){
                    alert("Successful!")
                    window.location.href = "welcomeEmployee";
                },
                dataType: "json"
            });
        }
        else{
            alert("Failed!")
            }
    });
</script>

</body>
</html>
