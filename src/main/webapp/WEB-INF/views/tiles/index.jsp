<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="container">
    <div class="row">
        <p class="text-center"><h1>This is navigation page页面</h1></p>
    </div>
    <div class="row">
        <div class="list-group">
            <a href="/students/list" class="list-group-item">go学生操作页面${name}</a>
        </div>
    </div>
</div>
