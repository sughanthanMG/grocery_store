<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="details" action="login">
					
					<div class="form-group" >
						<label>Username:</label>
						<form:input path="username" cssClass="form-control"/>
						
					</div>
					<div class="form-group" >
						<label>Password:</label>
						<form:input path="username" cssClass="form-control"/>
						
					</div>
					
					<input type="submit" value="Register" class="btn btn-primary"> 

				</form:form>
</body>
</html>