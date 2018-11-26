<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<div>
    <ul>
        <c:forEach items="${requestScope.userlist}" var="user">
            <li>
                    ${user.name}
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
