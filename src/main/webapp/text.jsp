<%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 25.02.2024
  Time: 6:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Text operations</title>
</head>
<body>
<h1>Введите текст (русский)</h1>
<form method =POST action ="text-servlet">
    <div class ="table-header">
        <textarea class="description-from-type-label" id="Textarea1" name= "text" rows="3"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<p>RESULT</p>
<div class ="table-header">
    <label>vowels</label><br>
    <textarea class="description-from-type-label"   rows="3"><%=request.getAttribute("vow")%></textarea>
</div>
<div class="mb-3">
    <label>number of vowels </label><br>
    <textarea class="description-from-type-label"   rows="3"><%=request.getAttribute("vow_count")%></textarea>
</div>

<div class ="table-header">
    <label>consonants</label><br>
    <textarea class="description-from-type-label"   rows="3"><%=request.getAttribute("con")%></textarea>
</div>
<div class="mb-3">
    <label>number of consonants </label><br>
    <textarea class="description-from-type-label"   rows="3"><%=request.getAttribute("con_count")%></textarea>
</div>

<div class ="table-header">
    <label>Punctuation marks</label><br>
    <textarea class="description-from-type-label"   rows="3"><%=request.getAttribute("marks")%></textarea>
</div>
<div class="mb-3">
    <label>number of punctuation marks </label><br>
    <textarea class="description-from-type-label"   rows="3"><%=request.getAttribute("marks_count")%></textarea>
</div>
<a href="index.jsp">на главную</a><br>
</body>
</html>
