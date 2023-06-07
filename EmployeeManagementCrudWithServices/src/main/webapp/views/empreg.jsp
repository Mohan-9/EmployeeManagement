
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<a href="/views">View All Employees Details</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<body bgcolor="pink">
	<h1 style="color: black;">Employee Invoice Application </h1>
	<form:form  modelAttribute="employee" action="/register">
		<table>
			<tr>
				<td>Enter Employee Id:</td>
				<td><form:input path="eid" />
					<p></p></td>
			</tr>
			<tr>
				<td>Enter Employee Name:</td>
				<td><form:input path="name" />
					<p></p></td>
			</tr>
			<tr>
				<td>Employee Salary:</td>
				<td><form:input path="salary" />
					<p></p></td>
			</tr>
			<tr>
				<td></td>


				<td><input type="submit" value="PrintInvoice"></td>
		</table>
	</form:form>

</body>