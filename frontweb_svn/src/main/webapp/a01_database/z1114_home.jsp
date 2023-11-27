<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="frontweb.z01_home.A1114Dao"
	import="frontweb.vo.Location"    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>위치정보</h2>
<!-- 
location_id  street_address  postal_code city state_province country_id
 -->
<%
A1114Dao dao = new A1114Dao();
%> 
<table border>
	<tr>
		<th>location_id</th>
		<th>street_address</th>
		<th>postal_code</th>
		<th>city</th>
		<th>state_province</th>
		<th>country_id</th>
	</tr>
	<%for(Location loc:dao.getLocations(new Location("a","a"))){ %>
	<tr>
		<td><%=loc.getLocation_id() %></td>
		<td><%=loc.getStreet_address()%></td>
		<td><%=loc.getPostal_code()%></td>
		<td><%=loc.getCity() %></td>
		<td><%=loc.getState_province() %></td>
		<td><%=loc.getCountry_id() %></td>
	</tr>
	<%}%>
</table>
</body>
</html>