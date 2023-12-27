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
<!DOCTYPE html>
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
    

    <script>
   
        var IMP = window.IMP;
        IMP.init('imp88601706'); // [변경] 상점 키 입력

        // 현재 날짜를 생성
        var currentDate = new Date();

        // 한 달 후의 날짜를 계산
        var nextMonthDate = new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, currentDate.getDate());

        // Timestamp로 변환 (초 단위)
        var timestamp = Math.floor(nextMonthDate.getTime() / 1000);

        IMP.request_pay({
            pg: 'kakaopay',
            pay_method: 'card',
            merchant_uid: 'merchant_' + new Date().getTime(),
            name: '뽀봉케어 구독결제',
            amount: 3300, // 결제할 금액
            buyer_email: 'iamport@siot.do', // 구매자 이메일
            buyer_name: '구매자이름',
            buyer_tel: '010-1234-5678',
            buyer_addr: '서울특별시 강남구 삼성동',
            buyer_postcode: '123-456',
            m_redirect_url: 'BBcare/Mypage.jsp', // 리다이렉트 URL
            schedules: [
                {
                    merchant_uid: 'your-unique-schedule-id',
                    schedule_at: timestamp, // 정기결제 예약 시간 (timestamp)
                    amount: 3300,
                },
            ],
        }, function (rsp) {
            console.log(rsp);
            if (rsp.success) {
                var msg = '결제가 완료되었습니다.\n';
                msg += '고유ID : ' + rsp.imp_uid + '\n';
                msg += '상점 거래ID : ' + rsp.merchant_uid + '\n';
                msg += '결제 금액 : ' + rsp.paid_amount + '\n';
                msg += '카드 승인번호 : ' + rsp.apply_num + '\n';

                // 결제가 성공한 경우 서버에 다시 결제 요청을 보내는 코드
                fetch('https://api.iamport.kr/subscribe/payments/again', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json',
                    },
                    body: JSON.stringify({
                        customer_uid: 'your-customer-unique-id',
                        merchant_uid: 'order_id_8237352',
                        amount: 3000,
                    }),
                })
                    .then(response => response.json())
                    .then(data => {
                        console.log(data);
                        // 서버 응답에 대한 처리를 수행할 수 있습니다.
                    })
                    .catch(error => console.error('Error:', error));

                window.location.href = 'sub_Info.jsp';
            } else {
                var msg = '결제에 실패하였습니다.\n';
                msg += '에러내용 : ' + rsp.error_msg + '\n';
                alert(msg);
            }
        });
  
    </script>
</body>

</html>