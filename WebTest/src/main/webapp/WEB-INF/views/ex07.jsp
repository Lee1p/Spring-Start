<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://bit.ly/3WJ5ilK">
<style>
</style>
</head>
<body>
	<!-- ex07.jsp  -->
	<h1>데이터 입력하기</h1>

	<form method="POST" action="/web/ex07ok.do">
		<table class="vertical">
			<tr>
				<th>취미</th>
				<td>
				<input type="checkbox" name="cb" value="독서"> 독서
				<input type="checkbox" name="cb" value="운동"> 운동
				<input type="checkbox" name="cb" value="여행"> 여행
				</td>
			</tr>
		</table>
		<div>
			<button>보내기</button>
		</div>
		<input type="hidden" name="seq" value="100">
	</form>



	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script src="https://bit.ly/4cMuheh"></script>
	<script>
	
		function dummy() {
			$('input[name=name]').val('홍길동');
			$('input[name=age]').val('20');
			$('input[name=address]').val('서울시');			
		}
		dummy();
	</script>
</body>
</html>




