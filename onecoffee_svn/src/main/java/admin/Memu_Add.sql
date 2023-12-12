--시퀀스 
CREATE SEQUENCE seq
START WITH 1; --1부터 시작 
DROP sequence seq; --시퀀스 삭제 

drop table menu01; --테이블 삭제 
CREATE TABLE menu01 (
  no NUMBER,
  category varchar2(50),
  name varchar2(50),
  drink_type varchar2(50),
  price number,
  detail varchar2(200)
);

SELECT * FROM menu01;
SELECT * FROM member;

SELECT * FROM MEMBER WHERE name LIKE '%근%';

--시퀀스 1부터 시작하 mno 넣기 
INSERT INTO menu VALUES(seq.nextval,'커피', '아메리카노', 'hot', 3000, '에스프레소와 뜨거운 물을 섞은 커피');
INSERT INTO menu VALUES(seq.nextval,'커피', '아메리카노', 'hot', 3000, '에스프레소와 뜨거운 물을 섞은 커피');
INSERT INTO menu VALUES(seq.nextval,'커피', '아메리카노', 'ice', 3000, '에스프레소와 얼음물을 섞은 커피');
INSERT INTO menu VALUES(seq.nextval,'커피', '콜드브루', 'hot', 4000, '콜드 브루 전용 원두를 추출하여 뜨거운 물을 섞은 커피');
INSERT INTO menu VALUES(seq.nextval,'커피', '콜드브루', 'ice', 4000, '콜드 브루 전용 원두를 추출하여 얼음물을 섞은 커피');
INSERT INTO menu VALUES(seq.nextval,'프라푸치노', '자바칩 프라푸치노', 'ice', 4500, '커피,모카소스,초콜릿 칩이 올라간 프라푸치노(ice전용)');
INSERT INTO menu VALUES(seq.nextval,'프라푸치노', '녹차 프라푸치노', 'ice', 5000, '깊고 진한 말차의 맛을 느낄수 있는 프라푸치노(ice전용)');
INSERT INTO menu VALUES(seq.nextval,'티', '민트 블렌드 티', 'ice', 4500, '스피어민트,페퍼민트,레몬머틀이 뜨거운 물과 블렌딩 된 상쾌한 허브티');
INSERT INTO menu VALUES(seq.nextval,'티', '민트 블렌드 티', 'hot', 5000, '스피어민트,페퍼민트,레몬머틀이 얼음물과 블렌딩 된 상쾌한 허브티');
INSERT INTO menu VALUES(seq.nextval,'티', '잉글리쉬 블렉퍼스트 티', 'ice', 4500, '아삼,홍차가 얼음물과 블렌되어 몰트향이 특징인블랙티');
INSERT INTO menu VALUES(seq.nextval,'티', '잉글리쉬 블렉퍼스트 티', 'hot', 5000, '아삼,홍차가 뜨거운 물과 블렌되어 몰트향이 특징인 블랙티');
INSERT INTO menu VALUES(seq.nextval,'쥬스', '오렌지쥬스', 'ice', 3500, '신선한 오렌지 간 시원한 음료');
INSERT INTO menu VALUES(seq.nextval,'우유', '우유', 'hot', 3500,'따뜻하고 신선한 우유');

--no 직접 넣어서 추
--INSERT INTO menu (mno,category, name, drink_type, price, detail)
--VALUES
--(1,'커피', '아메리카노', 'hot', 3000, '에스프레소와 뜨거운 물을 섞은 커피');
—(2,'커피', '아메리카노', 'ice', 3000, '에스프레소와 얼음물을 섞은 커피');
—(3,'커피', '콜드브루', 'hot', 4000, '콜드 브루 전용 원두를 추출하여 뜨거운 물을 섞은 커피');
—(4,'커피', '콜드브루', 'ice', 4000, '콜드 브루 전용 원두를 추출하여 얼음물을 섞은 커피');
—(5,'프라푸치노', '자바칩 프라푸치노', 'ice', 4500, '커피,모카소스,초콜릿 칩이 올라간 프라푸치노(ice전용)');
—(6,'프라푸치노', '녹차 프라푸치노', 'ice', 5000, '깊고 진한 말차의 맛을 느낄수 있는 프라푸치노(ice전용)');
—(7,'티', '민트 블렌드 티', 'ice', 4500, '스피어민트,페퍼민트,레몬머틀이 뜨거운 물과 블렌딩 된 상쾌한 허브티');
—(8,'티', '민트 블렌드 티', 'hot', 5000, '스피어민트,페퍼민트,레몬머틀이 얼음물과 블렌딩 된 상쾌한 허브티');
—(9,'티', '잉글리쉬 블렉퍼스트 티', 'ice', 4500, '아삼,홍차가 얼음물과 블렌되어 몰트향이 특징인블랙티');
—(10,'티', '잉글리쉬 블렉퍼스트 티', 'hot', 5000, '아삼,홍차가 뜨거운 물과 블렌되어 몰트향이 특징인 블랙티');
—(11,'쥬스', '오렌지쥬스', 'ice', 3500, '신선한 오렌지 간 시원한 음료');
—(12,'우유', '우유', 'hot', 3500,'따뜻하고 신선한 우유');

--commit완료 확인 수정 
