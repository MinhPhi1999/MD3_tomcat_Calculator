<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/calculator" method="post">
    <h2>Product Description</h2><br>
    <input type="text" name="pd" placeholder="Product Description">
    <h2>List Price</h2><br>
    <input type="text" name="lp" placeholder="List Price"><br>
    <h2>Discount Percent</h2><br>
    <input type="text" name="dp" placeholder="Discount Percent"><br>
    <input type="submit" id="submit" value="Calculator Discount">
</form>
</body>
</html>