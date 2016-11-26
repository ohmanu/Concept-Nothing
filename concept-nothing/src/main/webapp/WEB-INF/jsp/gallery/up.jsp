<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

	<h2>Shot</h2>
	
	<form:form action="/up" method="POST" modelAttribute="shot">		
			<form:hidden path="id" />
		<p>
			<form:label path="title">Title: </form:label>
			<form:input path="title" />
		</p>
		
		<p>
			<form:label path="source">Source: </form:label>
			
			<input type="file" name="file">
		</p>
		
		<p>
			<form:label path="photo">Photo: </form:label>
			<form:input path="photo" />
		</p>
		
		<p>
			<form:label path="bio">Bio: </form:label>
			<form:textarea path="bio" placeholder="Bio of the Character" cols="50" rows="3"/>
		</p>
		
		<input type="submit" value="Save"/>
	</form:form>