<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="frontweb.homework.A1114Dao"
	import="frontweb.homework_vo.Location"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>지역정보조회</h2>
	<%
	A1114Dao dao = new A1114Dao();
	%>
	<table border>
		<tr>
			<th>Location_id</th>
			<th>Street_address</th>
			<th>Postal_code</th>
			<th>City</th>
			<th>State_province</th>
			<th>Country_id</th>
		</tr>
		<%
		for(Location loc:dao.getLoc("","")) {
		%>
		<tr>
			<th><%=loc.getLocation_id() %></th>
			<th><%=loc.getStreet_address() %></th>
			<th><%=loc.getPostal_code() %></th>
			<th><%=loc.getCity() %></th>
			<th><%=loc.getState_province() %></th>
			<th><%=loc.getCountry_id() %></th>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>