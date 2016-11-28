<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

	<h2>New Shot</h2>
	
	<form:form action="/upload" method="POST" modelAttribute="shot">		
			<form:hidden path="id" />
		<p>
			<form:label path="title">Title: </form:label>
			<form:input path="title" />
		</p>
		
		<input type="submit" value="Save"/>
	</form:form>