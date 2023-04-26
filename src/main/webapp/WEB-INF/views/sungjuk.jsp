<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>성적처리 프로그램 v6</title>
</head>
<body>
    <h1>성적처리 프로그램 v6</h1>
    <form name="sj" method="post">   <%-- submit 했을 때 자기자신을 부름 --%>
        <div>이름 : <input type = "text" name = "names"></div>
        <div>국어 : <input type = "text" name = "kors"></div>
        <div>영어 : <input type = "text" name = "engs"></div>
        <div>수학 : <input type = "text" name = "mats"></div>
        <div><button type="submit">입력완료</button></div>
    </form>
</body>
</html>
