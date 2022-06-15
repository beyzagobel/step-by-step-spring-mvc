<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

</head>
<body>
<h2>Kullanıcı Kayıt Formu</h2>

<div>
    <form method="post" action="listele">

        <label for="isim">İsim:</label>
        <br>
        <input type="text" name="isim" id="isim" placeholder="İsim.."/><br>

        <label for="soyisim">Soyisim:</label>
        <br>
        <input type="text" name="soyisim" id="soyisim" placeholder="Soyisim.."/>
        <br>
        <label for="cinsiyet">Cinsiyet</label>
        <br>
        <select name="cinsiyet" id="cinsiyet">
            <option value="0">Kadın</option>
            <option value="1">Erkek</option>
        </select>
        <br>
        <label for="sinif">Sınıf</label>
        <br>
        <select name="sinif" id="sinif">
            <option value="1">1. Sınıf</option>
            <option value="2">2. Sınıf</option>
            <option value="3">3. Sınıf</option>
            <option value="4">4. Sınıf</option>
        </select>
        <br/>
        <input type="submit" value="kaydet"/>
    </form>
</div>

</body>
</html>
