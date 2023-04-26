<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>성적 리스트</title>
</head>
<body>
    <h1 style="text-align: center">성적 리스트</h1>
    <table border="1" width="750px" cellpadding="10px" cellspacing="0" style="margin: 0 auto">
        <tr>
            <th>이름</th>
            <th>국어</th>
            <th>영어</th>
            <th>수학</th>
        </tr>

        <%--
            for (SungJuk sj : sjs)
         --%>
        <c:forEach items="${sjs}" var="sj">
            <tr style="text-align: center">
                <td><a href="/view?sjno=${sj.sjno}">${sj.names}</a></td>
                <td>${sj.kors}</td>
                <td>${sj.engs}</td>
                <td>${sj.mats}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

<%-- 결과를 보여주는 코드 --%>