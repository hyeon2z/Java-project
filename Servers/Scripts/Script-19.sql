-- 하나의 속성에 여러개의 데이터가 입력
CREATE TABLE customer(
	cu_id varchar(50) PRIMARY KEY,
	name varchar2(50),
	address varchar2(100),
	phone varchar2(200)
);
INSERT INTO customer VALUES ('himan', '홍길동', '서울시', '010-1111-2222;010-5555-4444;010-7777-6666');
CREATE TABLE customer2(
	cu_id varchar(50) PRIMARY KEY,
	name varchar2(50),
	address varchar2(100)
);
INSERT INTO customer2 VALUES ('himan', '홍길동', '서울시');
CREATE TABLE phoneInfo01(
	cu_id varchar2(50),
	phone varchar2(100),
	etc varchar2(100)
);
-- 속성에 다중데이터가 들어갈 때, entity를 분리 시키는 경우가 있는데
-- 1. 해당 다중데이터가 수정할 가능성이 높고,
-- 2. 다중데이터 뿐만 아니라 연계된 속성도 포함되어 있을 때
INSERT INTO phoneInfo01 values('himan','010-1111-2222','개인용');
INSERT INTO phoneInfo01 values('himan','010-5555-4444','회사영업');
INSERT INTO phoneInfo01 values('himan','010-7777-6666','회사사무');

SELECT * FROM customer2;
SELECT * FROM phoneInfo01;

SELECT * FROM CUSTOMER2 a, phoneInfo01 b
WHERE a.cu_id = b.cu_id;