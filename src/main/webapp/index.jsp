<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<script src="/js/jquery.min.js"></script>
<script>

</script>
<body>
<a href="login.jsp"><h1>去登录！</h1></a>
<h1>当前用户:</h1>
<h1>您的手机号:</h1>
<a href="contact/addContact.jsp">添加联系人</a>
<table border="1">
    <p th:text="${key } "></p>
    <tr>
        <td>联系人</td>
        <td>性别</td>
        <td>手机号</td>
        <td>操作</td>

    </tr>

    <%--<tr th:each="contact:${contactList}">
        <td th:text="${contact.contactName}"></td>
        <td th:text="${contact.contactSex}"></td>
        <td th:text="${contact.contactPhone}"></td>
        <td>操作咩</td>
    </tr>--%>






    <!-- 遍历出 从后台获取到的当前登陆user的 所有联系人信息，并显示 -->
    <%--<c:forEach items="${contactList }" var="contact">
        <tr>
            <td>${contact.contactName }</td>
            <td>${contact.contactSex }</td>
            <td>${contact.contactPhone }</td>
            <td>
                <a href="ContactServlet?method=selectContactById&contactId=${contact.contactId }">编辑</a> <!-- 访问servlet查询到当前contact对象，并跳转到update界面进行修改 -->
                <a href="ContactServlet?method=deleteContactById&contactId=${contact.contactId }&userId=${contact.userId }">删除</a>
            </td>
        </tr>
    </c:forEach>--%>
</table>
</body>
</html>