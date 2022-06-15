<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

</head>
<body>
<h2>Kullanıcı Kayıt Formu</h2>

<div>
    <form method="post" action="listele">

            İsim: <br /><input type="text" name="isim" id="isim"/><br />
            Soyisim: <br /><input type="text" name="soyisim" id="soyisim" /><br />
            Cinsiyet:<br/>
            <select name="cinsiyet" id="cinsiyet">
                <option value="0">Kadın</option>
                <option value="1">Erkek</option>
            </select>
            <br/>Sınıf:<br/>
            <select name="sinif" id="sinif">
                <option value="1">1. Sınıf</option>
                <option value="2">2. Sınıf</option>
                <option value="3">3. Sınıf</option>
                <option value="4">4. Sınıf</option>
            </select>
        <br/>
        <input type="submit" value="kaydet" />
    </form>
</div>

</body>
</html>
