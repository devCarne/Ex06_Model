<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String conPath = request.getContextPath();
%>

<form action="<%=conPath%>/create">
    작성자 : <input type="text" name="writer" value="${dto.writer}"><br>
    내용 : <input type="text" name="content" value="${dto.content}"><br>
    <input type="submit" value="전송">
</form>
</body>
</html>
