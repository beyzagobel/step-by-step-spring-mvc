
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Kayıt Form</h2>

<form action="kaydedilen" method="post">
    <!-- Controller'ın istek türü post ve istek yolu /kaydedilen olan metoduna
    forma yazılan ad ve soyad parametreleri ile gidilir.-->
    <label for="ad">First name:</label><br>
    <input type="text" id="ad" name="ad"><br>
    <label for="soyad">Last name:</label><br>
    <input type="text" id="soyad" name="soyad"><br><br>
    <input type="submit" value="kaydet" onclick="">
</form>


</body>
</html>
