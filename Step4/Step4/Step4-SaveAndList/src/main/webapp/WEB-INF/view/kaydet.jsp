<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<form method="post" action="listele">
    <fieldset>
        <legend>Kullanıcı Kayıt Formu</legend>
        İsim: <input type="text" name="isim" id="isim"/><br />
        Soyisim: <input type="text" name="soyisim" id="soyisim" /><br />
        Cinsiyet:
        <select name="cinsiyet" id="cinsiyet">
            <option value="0">Kadın</option>
            <option value="1">Erkek</option>
        </select>
        Sınıf:
        <select name="sinif" id="sinif">
        <option value="1">1. Sınıf</option>
        <option value="2">2. Sınıf</option>
        <option value="3">3. Sınıf</option>
        <option value="4">4. Sınıf</option>
    </select>
    </fieldset>
    <input type="submit" value="kaydet" />
</form>

</body>
</html>
