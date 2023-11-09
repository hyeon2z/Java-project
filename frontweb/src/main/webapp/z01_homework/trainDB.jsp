<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" import="frontweb.Train" import="java.util.*"
   import="frontweb.database.TrainDao"%>
<%
TrainDao dao = new TrainDao();
System.out.println(dao.getTrainList(null).size());
for(Train train:dao.getTrainList(null)) {
	System.out.print(train.getTraintype()+"\t");
	System.out.print(train.getTno()+"\t");
	System.out.print(train.getDepartstation()+"\t");
	System.out.print(train.getStarttime()+"\t");
	System.out.print(train.getArrivalstation()+"\t");
	System.out.print(train.getEndtime()+"\t");
	System.out.print(train.getDuration()+"\t");
	System.out.print(train.getPrice()+"\t");
	System.out.print(train.getSeatinfo()+"\n");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>DB연동 객체 사용</h2>
   <form>
   <!-- form에 action(요청을 호출하는 페이지)
      지정하지 않으면 현재 페이지를 다시 호출..
      z02_List.jsp?ename=S
       -->
   열차종류 : <input type="text" name="traintype" value="${param.traintype}"/> <br>
   <input type="submit" value="검색"/>
   </form>
   
   
   <table border>
      <tr>
         <th>열차종류</th>
         <th>열차번호</th>
         <th>출발역</th>
         <th>출발시간</th>
         <th>도착역</th>
         <th>도착시간</th>
         <th>소요시간</th>
         <th>가격</th>
         <th>좌석</th>
      </tr>
      <%
      String traintype=request.getParameter("traintype");
      if(traintype==null) traintype="";
      for(Train train:dao.getTrainList(traintype)) {
      %>
      <tr>
         <th><%=train.getTraintype()%></th>
         <th><%=train.getTno()%></th>
         <th><%=train.getDepartstation()%></th>
         <th><%=train.getStarttime()%></th>
         <th><%=train.getArrivalstation()%></th>
         <th><%=train.getEndtime()%></th>
         <th><%=train.getDuration()%></th>
         <th><%=train.getPrice()%></th>
         <th><%=train.getSeatinfo()%></th>
      </tr>
      <%} %>

   </table>
</body>
</html>