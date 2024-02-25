<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.ignateva.test1.ThreeServlet" %>
<%@ page import="com.ignateva.test1.Calculation" %><%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 24.02.2024
  Time: 7:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Three number</title>
</head>
<body>
<h1>Enter 3 numbers</h1>
<form method = POST action="three-servlet">
    <div class="mb-3">
        <label>first number</label><br>
        <input type="number" id="a" name ="number1">
    </div>
    <div class="mb-3">
        <label>second number</label><br>
        <input type="number" id="b" name ="number2">
    </div>
    <div class="mb-3">
        <label>third number</label><br>
        <input type="number" id="c" name ="number3">
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="choice" id="Radios1" value="1">
        <label class="form-check-label">
            maximum value
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="choice" id="Radios2" value="2">
        <label class="form-check-label">
            minimum value
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="choice" id="Radios3" value="3">
        <label class="form-check-label">
            average value
        </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>



<p>RESULT</p>

<h1 style ="color: brown">
<%=request.getAttribute("res")%>

</h1>

<a href="index.jsp">на главную</a><br>
</body>
</html>
