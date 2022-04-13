<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	* {
	background-color: #FFCCCC;
	text-align: left;
	}
	form {
	margin-left: 30px;
	font-weight: bold;
	}
</style>
<body>
	
	<h1>아래 내용을 입력해주세요.</h1>
	<form action="abc" method="post">
	
		이름 : <input type="text" name="userName"><br>
		거주 지역 : <input type="text" name="address"><br>
		나이 : <input type="text" name="age"><br>
		<input type="submit">
	
	</form>
	
</body>
</html>