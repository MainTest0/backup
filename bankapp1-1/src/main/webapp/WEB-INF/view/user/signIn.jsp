<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/layout/header.jsp"%>



<div class="col-sm-8">
	<h2>어서오세요</h2>
	<h5>로그인페이지</h5>
	<br>
	<div class="bg-light p-md-5 h-75">
	<form action="/user/sign-in" method="post">
		<div class="form-group">
			<label for="username">username:</label> <input type="text" class="form-control" placeholder="username입력" id="username" name="username"value="길동">
		</div>
		<div class="form-group">
			<label for="password">password:</label> <input type="password" class="form-control" placeholder="password입력" id="password" name="password"value="1234">
		</div>
		<button type="submit" class="btn btn-primary">로그인</button>
	</form>
	</div>
	<br>
</div>

<%@ include file='/WEB-INF/view/layout/footer.jsp'%>

