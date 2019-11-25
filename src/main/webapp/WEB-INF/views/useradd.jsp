<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:import url="header.jsp">
	<c:param name="Administration utilisateur" value="home" />
</c:import>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Add user</title>
</head>

<body>
	<c:url value="/admin/testvalidator/" context="/forumSpring"
		var="urluseradd" />
	<form:form action='${urluseradd}' method="post"
		modelAttribute="formuser">
		<form:label path="name">Nom (complet)</form:label>
		<form:input path="name" />
		<form:errors path="mobile" />
		<form:label path="mobile">Mobile</form:label>
		<form:input path="email" />
		<!-- form:errors path="email"/>  -->
		<form:label path="username">Username</form:label>
		<form:input path="username" />
		<form:password path="password" />
		<form:label path='password'>Mot de passe</form:label>
		<!-- form:errors path="password"/>  -->


		<!-- <form:label path="address">Adresse</form:label>
    	<form:input type="address" path="address"/>  -->
		<!-- <form:errors path=""/> -->

		<input type="submit" value="enregister" />
	</form:form>
</body>
</html>


