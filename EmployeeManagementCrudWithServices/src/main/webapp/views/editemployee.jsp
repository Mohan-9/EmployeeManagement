
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form method="POST" action="/register">
	<body bgcolor="pink">
		<h1 style="color: black;",>Edit Employee</h1>

		<table>
			<tr>
				<td></td>
				<td><form:hidden path="eid" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
			</tr>
	
			<tr>
				<td></td>
				<td><input type="submit" value="EditSave" /></td>
			</tr>

		</table>
	</body>
</form:form>

<a href="/views">View All Employee Details</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/employee"> Add New Employee Data</a>
&nbsp;&nbsp;&nbsp;&nbsp;
