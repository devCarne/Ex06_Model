<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.println("model(Sub) : Hello Spring!!");
%>
<br>
${ObjectTest}
<br>
${list}
<br><br>

<c:forEach var="l" items="${list}">
    ${l}<br>
</c:forEach>
<br>
당신의 이름은 ${name}입니다.
</body>
</html>
