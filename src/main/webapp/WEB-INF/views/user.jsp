<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="header.jsp">
    <c:param name="Administration utilisateur" value="home"/>
</c:import>
<table class="table">
<tfhead>
<tr>
    <th>Prénom</th>
    <th>Nom</th>
    <th>Email</th>
</tr>    
</tfhead>
<tbody>
    <c:forEach var="user" items="${users}">
   
    <tr>
        <c:url var="urldel" value="/admin/userdelete/${user.id }" context="/springmvc"/>
        <td><c:out value="${user.firstName}"/></td>
        <td><c:out value="${user.lastName}"/></td>
        <td><c:out value="${user.email}"/></td>
        <td><a class ="btn btn-danger" href="${urldel}">Supprimer</a></td>
    </tr>
   </c:forEach>
</tbody>
</table>
<c:import url="footer.jsp"/>