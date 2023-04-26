<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>성적 조회 결과</title>
</head>
<body>
<h1>성적 조회 결과</h1>
<%--<ul>
  <li>${sj.sjno}</li>
  <li>${sj.names}</li>
  <li>${sj.kors}</li>
  <li>${sj.engs}</li>
  <li>${sj.mats}</li>
  <li>${sj.tots}</li>
  <li>${sj.avgs}</li>
  <li>${sj.grds}</li>
</ul>--%>

<table border="1" width="750px" cellpadding="10px" cellspacing="0" style="margin: 0 auto">
  <tr>
    <th>번호</th>
    <th>이름</th>
    <th>국어</th>
    <th>영어</th>
    <th>수학</th>
    <th>총점</th>
    <th>평균</th>
    <th>학점</th>
  </tr>

  <c:forEach items="${sj}" var="sj">
    <tr style="text-align: center">
      <td>${sj.sjno}"</td>
      <td>${sj.names}"</td>
      <td>${sj.kors}</td>
      <td>${sj.engs}</td>
      <td>${sj.mats}</td>
      <td>${sj.tots}</td>
      <td>${sj.avgs}</td>
      <td>${sj.grds}</td>
    </tr>
  </c:forEach>
</table>

<p><a href="/modify?sjno=?${sj.sjno}">수정하기</a></p>
<p><a href="/remove?sjno=?${sj.sjno}">삭제하기</a></p>

</body>
</html>
