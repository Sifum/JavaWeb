<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="container">

    <div class="row">
        <form action="${pageContext.request.contextPath}/students/list/search" class="navbar-form navbar-left" role="search">
            <div class="form-group">
                <input type="text" name="userName" class="form-control" placeholder="学生姓名">
            </div>
            <button type="submit" class="btn btn-default">搜索学生</button>
        </form>
    </div>
    <div class="row">
        <c:if test="${! empty errs}">
            <div class="col-md-12">
                <div class="alert alert-danger">
                    <c:out value="${errs}"></c:out>
                </div>
            </div>
        </c:if>
        <c:if test="${! empty msg}">
            <div class="col-md-12">
                <div class="alert alert-info">
                    <c:out value="${msg}"></c:out>
                </div>
            </div>
        </c:if>
    </div>
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading">学生信息登记<div class="pull-right"><a href="#" class="btn btn-warning btn-sm" data-toggle="modal" data-target="#myData">增加</a><c:if test="${!empty emp}"><button  id="clearBtn" class="btn btn-warning btn-sm">清空</button></c:if></div></div>
            <table class="table table-bordered">
                <tr>
                    <th>学生编号</th>
                    <th>学生姓名</th>
                    <th>学生年龄</th>
                    <th>学生地址</th>
                    <th>操作</th>
                </tr>
                <c:choose>
                    <c:when test="${empty users}">
                        <tr>
                            <td colspan="5">
                                <p class="text-center"><b>暂无学生数据</b></p>
                            </td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <c:forEach var="user" items="${users}">
                            <tr>
                                <td><c:out value="${user.id}"></c:out></td>
                                <td><c:out value="${user.userName}"></c:out></td>
                                <td><c:out value="${user.userAge}"></c:out></td>
                                <td><c:out value="${user.userAddress}"></c:out></td>
                                <td><a  href="/student/list/delete/${user.id}" class="btn btn-default btn-sm">删除</a></td>
                            </tr>
                        </c:forEach>
                    </c:otherwise>
                </c:choose>
            </table>
        </div>
    </div>

    <%--弹出添加学生--%>
    <div class="modal fade"  id="myData" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">添加学生</h4>
                </div>
                <form action="${pageContext.request.contextPath}/student/list/insert/user" method="post" class="form-group">
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6"><input type="text" name="userName" class="form-control" placeholder="学生名" /></div>
                        </div>
                        <div class="row">
                            <div class="col-md-6"><input type="number" name="userAge" class="form-control" placeholder="学生年龄" /></div>
                        </div>
                        <div class="row">
                            <div class="col-md-6"><input type="text" name="userAddress" class="form-control" placeholder="地址" /></div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <input type="submit" class="btn btn-primary" value="提交"/>
                        <input type="hidden" name="act" value="insertUser"/>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <%--请求过渡效果--%>
    <div id="loading" state="hide" style="display: none"><span class="glyphicon glyphicon-refresh" style="color:#ed8e8e"></span></div>