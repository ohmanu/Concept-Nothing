<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

	<h2>Upload Shot</h2>
	
	<form:form action="/upload" method="POST" enctype="multipart/form-data">		
		
		<p>	
			<input type="file" name="file">
		</p>
		
		<input type="submit" value="Upload"/>
	</form:form>