<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/loginpage.css">
</head>
<body>

	<div class="login">
		<h1>Login</h1>
		<form:form action="loginprocesing" method="post">
			<input type="text" name="username" placeholder="Username"
				required="required" />
			<input type="password" name="password" placeholder="Password"
				required="required" />
			<button type="submit" class="btn btn-primary btn-block btn-large">Let
				me in.</button>
		</form:form>
	</div>

</body>
