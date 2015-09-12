<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h1>
		<c:forEach items="${animals}" var="animal">
            <c:out value="${animal.id}"/>
        </c:forEach>
	</h1>
</body>
</html>