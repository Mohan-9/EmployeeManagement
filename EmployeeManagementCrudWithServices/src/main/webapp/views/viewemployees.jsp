<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="pink">
	<h1>Employee Details</h1>
	<table border="2" width="100%" cellpadding="2">
		<tr>
			<th>Eid</th>
			<th>Name</th>
			<th>Salary</th>
			<th>TA</th>
			<th>DA</th>
			<th>HRA</th>
			<th>PF</th>
			<th>Gross_Sal</th>
			<th>Net_Sal</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="emp" items="${employees}">
			<tr>
				<td>${emp.eid}</td>
				<td>${emp.name}</td>
				<td>${emp.salary}</td>
				<td>${emp.tA}</td>
				<td>${emp.dA}</td>
				<td>${emp.hra}</td>
				<td>${emp.pf}</td>
				<td>${emp.gross_sal}</td>
				<td>${emp.net_sal}</td>
				
				<td><a href="/editemployee/${emp.eid}">Edit</a></td>
				<td><a href="/deleteemployee/${emp.eid}">Delete</a></td>

			</tr>
		</c:forEach>
	</table>
	<br />
</body>

