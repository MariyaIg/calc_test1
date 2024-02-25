<%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 24.02.2024
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple calculator</h1>
<form method = POST action="calc-servlet">
    <div class="mb-3">
        <label>first number</label><br>
        <input type="number" id="a" name ="number1">
    </div>

    <div class="btn-group" role="group" aria-label="Basic checkbox toggle button group">
        <input type="checkbox" class="btn-check" name="choice" id="btncheck1" value = "1" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck1">+</label><br>

        <input type="checkbox" class="btn-check" name="choice" id="btncheck2" value = "2" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck2">-</label><br>

        <input type="checkbox" class="btn-check" name="choice" id="btncheck3" value = "3" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck3">*</label><br>

        <input type="checkbox" class="btn-check" name="choice" id="btncheck4" value = "4" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck4">/</label><br>

        <input type="checkbox" class="btn-check" name="choice" id="btncheck5" value = "5" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck5">^</label><br>

        <input type="checkbox" class="btn-check" name="choice" id="btncheck6" value = "6" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck6">%</label><br>
    </div>
    <div class="mb-3">
        <label>second number</label><br>
        <input type="number" id="b" name ="number2">
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
