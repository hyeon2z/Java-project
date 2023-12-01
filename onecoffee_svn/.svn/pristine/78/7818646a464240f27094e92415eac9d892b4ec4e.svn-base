--시퀀스 
CREATE SEQUENCE seq_notice
START WITH 1; --1부터 시작 
DROP sequence seq_notice; --시퀀스 삭제 

drop table notice; --테이블 삭제 
CREATE TABLE notice ( 
  no NUMBER, --순번
  title varchar2(100), --제목
  content varchar2(3000), --내용
  adddate DATE --현재날짜
);

SELECT * FROM notice;
SELECT * FROM notice order by NO desc;

--시퀀스 1부터 시작하 no 넣기 

INSERT INTO notice VALUES(seq_notice.nextval,
'사칭 피싱 문자 및 SNS(카카오톡 오픈채팅, 페이스북 등) 이용 주의 안내',
'안녕하세요. one coffee 입니다. 
최근 one coffee를 사칭한 피싱 문자 및 SNS(카카오톡 오픈채팅, 페이스북 등)를 통해
채용공고, 상품결제/구매, 개인정보 요 구 등의 사기 행위가 이루어지고 있어 고객 여러분의 각별한 주의를 부탁드립니다.
당사는 카카오톡 오픈채팅 1:1 채팅, 페이스북 등으로 채용, 결제, 구매를 진행하거나 개인정보를 요구하지 않으니 이 점 유의해 주시기 바랍니다.
불법 스팸, 피싱, 해킹 등이 의심되는 경우 아래 기관으로 신고하여 상담 받을 수 있습니다.
※ 한국인터넷 진흥원 대국민서비스(118사이버도우미) 
1. 국번없이 118
2. 홈페이지 https://www.kisa.or.kr/cyberhelper118
감사합니다.',sysdate);

INSERT INTO notice VALUES(seq_notice.nextval,
'에어컨 공사 매장 휴점 안내',
'안녕하세요. onecoffee 입니다. 
에어컨 공사 휴점 기간 안내 드립니다. 
- 휴점기간:'|| to_char(sysdate, 'yyyy-mm-dd'),
sysdate);


INSERT INTO notice VALUES(seq_notice.nextval,'크리스마스 스마트폰 케이스 증정 안내', 
'안녕하세요. onecoffee 입니다.
크리스마스 스마트폰 케이스 증정 이벤트의 진행 기간을 아래와 같이 안내 드립니다.  
단, 준비된 물량 소진시 해당 이벤트는 종료 됩니다.
감사드립니다.
이벤트 참여기간 : 2023년12월25일',sysdate);


INSERT INTO notice(NO,title,content,adddate) 
VALUES(seq_notice.nextval,
'아메리카노 1+1 이벤트(포장전용)', 
'아메리카노 한정 포장 주문시 1잔에 1잔을 더 드립니다!
이벤트 기간:'|| to_char(sysdate, 'yyyy-mm-dd') || ' ~  ' || to_char(sysdate+3, 'yyyy-mm-dd'),
sysdate);
