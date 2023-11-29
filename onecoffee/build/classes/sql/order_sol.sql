CREATE TABLE Beverage(
	NO NUMBER,
	kind varchar2(30),
	TYPE varchar2(30),
	name varchar2(50),
	price number
); -- 음료 메뉴 테이블

CREATE SEQUENCE s01; -- 순번

SELECT * FROM Beverage ORDER BY no;

INSERT INTO Beverage VALUES (s01.nextval, '커피', 'HOT', '아메리카노', 3000);
INSERT INTO Beverage VALUES (s01.nextval, '커피', 'ICE', '아메리카노', 3000);

INSERT INTO Beverage VALUES (s01.nextval, '커피', 'HOT', '카페라떼', 3500);
INSERT INTO Beverage VALUES (s01.nextval, '커피', 'ICE', '카페라떼', 3500);


INSERT INTO Beverage VALUES (s01.nextval, '커피', 'HOT', '바닐라라떼', 4000);
INSERT INTO Beverage VALUES (s01.nextval, '커피', 'ICE', '바닐라라떼', 4000);

INSERT INTO Beverage VALUES (s01.nextval, '디카페인', 'HOT', '디카페인아메리카노', 3500);
INSERT INTO Beverage VALUES (s01.nextval, '디카페인', 'ICE', '디카페인아메리카노', 3500);


INSERT INTO Beverage VALUES (s01.nextval, '디카페인', 'HOT', '디카페인라떼', 4500);
INSERT INTO Beverage VALUES (s01.nextval, '디카페인', 'ICE', '디카페인라떼', 4500);

INSERT INTO Beverage VALUES (s01.nextval, '음료', 'HOT', '초코라떼', 5000);
INSERT INTO Beverage VALUES (s01.nextval, '음료', 'ICE', '초코라떼', 5000);

INSERT INTO Beverage VALUES (s01.nextval, '음료', 'HOT', '녹차라떼', 5000);
INSERT INTO Beverage VALUES (s01.nextval, '음료', 'ICE', '녹차라떼', 5000);

INSERT INTO Beverage VALUES (s01.nextval, '음료', 'ICE', '레몬에이드', 5000);
INSERT INTO Beverage VALUES (s01.nextval, '음료', 'ICE', '자몽에이드', 5000);

INSERT INTO Beverage VALUES (s01.nextval, '음료', 'ICE', '딸기스무디', 5500);
INSERT INTO Beverage VALUES (s01.nextval, '음료', 'ICE', '요거트스무디', 5500);

ALTER TABLE carttest ADD cnt number;
INSERT INTO Beverage 


SELECT * FROM BEVERAGE WHERE (kind='커피') OR (TYPE='hot') or (name LIKE '%아%');
-- SELECT * FROM BEVERAGE WHERE (kind=?) OR (TYPE=?) or (name LIKE ?);

CREATE TABLE cart(
	NO NUMBER,
	kind varchar2(30),
	TYPE varchar2(30),
	name varchar2(50),
	price number
); -- 장바구니 테이블

CREATE TABLE carttest(
	NO NUMBER,
	kind varchar2(30),
	TYPE varchar2(30),
	name varchar2(50),
	price number
); -- 내가 가지고 놀 장바구니 테이블

INSERT INTO carttest SELECT * FROM BEVERAGE WHERE (kind='커피') OR (TYPE='hot') or (name LIKE '%아%');
-- 장바구니 추가 sql

DELETE FROM carttest WHERE no = 8;
-- 장바구니 삭제 sql

DELETE FROM 
-- 장바구니 전체삭제 sql

UPDATE carttest SET cnt=2 WHERE NO=1;
-- 장바구니 수량 변경

SELECT * FROM carttest;
