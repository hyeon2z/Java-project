<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <jsp:useBean id="dao" class="backendweb.d01_dao.MemberDao"/>
--%>
<jsp:useBean id="dao" class="backendweb.d01_dao.PreparedStmtDao"/>
{"login":${dao.login(param.id, param.pwd)}}
<%--
{"hasMember":${dao.ckMemberId(param.id)}}
1. 위 코드가 어떤 의미 있는지
    1) 요청값을 넘기는 이유 : param.id를
    2) dao객체 생성하는 방법 중 useBean을 사용한 이유
    3) 마지막으로 {}와 같이 json형식을 사용하면 client단에서 어떻게 처리할건지?
    
    
--%>