<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="../assets/css/index.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <p class="text-center"><h1>This is navigation page</h1></p>
    </div>
    <div class="row">
        <div class="list-group">
            <a href="/students/list" class="list-group-item">go学生操作页面</a>
        </div>
        <div class="list-group">
            <a href="/home" class="list-group-item">go home page</a>
        </div>
    </div>
</div>

    <script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/js/app.js"></script>
</body>
</html>
