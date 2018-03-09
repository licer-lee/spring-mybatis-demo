<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>info</title>
</head>
<body>

	<h1>新增类型</h1>
	<form action="${pageContext.request.contextPath}/type/update" method="post">
		<h3>类型</h3>
		<input type="hidden" name="typeId" value="${t.typeId }">
		类型编号<input type="text" name="typeCode" value="${t.typeCode }"/><br>
		 类型名称<input type="text" name="typeName" value="${t.typeName }"/><br> 
		 
		 <input type="submit" value="save">
	</form>


</body>
</html>
