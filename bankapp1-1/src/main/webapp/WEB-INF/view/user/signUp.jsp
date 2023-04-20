<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file='/WEB-INF/view/layout/header.jsp'%>

<div class="col-sm-8">
	<h2>어서오세요</h2>
	<h5>회원가입페이지</h5>
	<br>
	<div class="bg-light p-md-5 h-75"></div>
	<form action="/user/sign-in" method="post">
		<div class="group-form">
			<label for="username">username:</label>
			<input type="text" class="form-control" placeholder="username입력" id="username" name="username">
		</div>
		<div class="group-form">
			<label for="password">password:</label>
			<input type="password" class="form-control" placeholder="password입력" id="password" name="password">
		</div>
		<div class="group-form">
			<label for="fullname">fullname:</label>
			<input type="text" class="form-control" placeholder="fullname입력" id="fullname" name="fullname">
		</div>
		<button type="submit" class="btn btn-primary">회원가입</button>
	</form>
	<div class=mine--css></div>
</div>

<%@ include file='/WEB-INF/view/layout/footer.jsp'%>

