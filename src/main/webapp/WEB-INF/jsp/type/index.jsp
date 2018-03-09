<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>type demo</title>
</head>
<body>

    <h1>列表</h1>
    <table border="1">
        <thead>
        <tr>
            <td>id</td>
            <td>编号</td>
            <td>名称</td>
            <td colspan="2">操作</td>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${types}" var="t" >
            <tr>
                <td>${t.typeId}</td>
                <td>${t.typeCode}</td>
                <td>${t.typeName}</td>
                <td><a href="${pageContext.request.contextPath}/type/delete/${t.typeId}">删除</a> </td>
                <td><a href="${pageContext.request.contextPath}/type/info/${t.typeId}">修改</a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <h1>新增类型</h1>
    <form action="${pageContext.request.contextPath}/type/save" method="post" >
        <h3>类型</h3>
        
        类型编号<input type="text" name="typeCode" /><br>
        类型名称<input type="text" name="typeName" /><br>

        <input type="submit" value="save">

    </form>

</body>
</html>
