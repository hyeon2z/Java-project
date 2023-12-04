<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    import="backendweb.d01_dao.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <!-- 포트원 결제 -->
    <script src="https://cdn.iamport.kr/v1/iamport.js"></script>
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
    <!-- 포트원 결제 -->
</head>

<body>
    <h1>kakaoPay API 이용하기</h1>

    <div>
        <p>카카오 페이 결제 모듈 테스트 해보기</p>
        <button id="check_module" type="button" >카카오 페이 결제 모듈 테스트 해보기</button>
    </div>

    <script>
        $("#check_module").click(function () {
            var IMP = window.IMP;
            IMP.init('imp88601706');
            IMP.request_pay({
                pg: 'kakaopay',
                pay_method: 'card',
                merchant_uid: 'merchant_' + new Date().getTime(),
                name: '주문명:결제테스트',
                amount: ${total},
                buyer_email: 'iamport@siot.do',
                buyer_name: '구매자이름',
                buyer_tel: '010-1234-5678',
                buyer_addr: '서울특별시 강남구 삼성동',
                buyer_postcode: '123-456',
                m_redirect_url: 'http://localhost:7080/onecoffee_svn/onecoffee/index01.jsp'
            }, function (rsp) {
                console.log(rsp);
                if (rsp.success) {
                    var msg = '결제가 완료되었습니다.\n';
                    msg += '고유ID : ' + rsp.imp_uid + '\n';
                    msg += '상점 거래ID : ' + rsp.merchant_uid + '\n';
                    msg += '결제 금액 : ' + rsp.paid_amount + '\n';
                    msg += '카드 승인번호 : ' + rsp.apply_num + '\n';
                    
                     window.location.href = 'index02.jsp';
                   
                } else {
                    var msg = '결제에 실패하였습니다.\n';
                    msg += '에러내용 : ' + rsp.error_msg + '\n';
                }
                alert(msg);
            });
        });
    </script>
</body>

</html>