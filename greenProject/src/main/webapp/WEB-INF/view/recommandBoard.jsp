<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판 화면</h1>
	<c:choose>
		<c:when test="${accountList!=null}">
			<!-- 게시글이 있는 경우 -->
			<c:forEach var="boardList" items="${title}">
				<h1>나와라</h1>
			</c:forEach>

		</c:when>
		<c:otherwise>
			<!-- 게시글이 없는 경우 -->
		</c:otherwise>
	</c:choose>


</body>
</html>