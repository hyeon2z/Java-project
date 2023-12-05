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
	category varchar2(30),
	drink_type varchar2(30),
	name varchar2(50),
	price number,
	cnt number
); -- 장바구니 테이블

SELECT * FROM cart;

ALTER TABLE cart
ADD no NUMBER;


INSERT INTO cart (category, drink_type, name, price, cnt)
SELECT category, drink_type, name, price, 1 as cnt
FROM menu
WHERE no = 1;


/*
INSERT INTO cart (category, drink_type, name, price, cnt)
SELECT category, drink_type, name, price, ? as cnt
FROM menu
WHERE no = ?
 * */

DELETE FROM cart;
-- 장바구니 삭제 sql
SELECT * FROM CART ;

DELETE FROM 
-- 장바구니 전체삭제 sql

UPDATE carttest SET cnt=2 WHERE NO=1;
-- 장바구니 수량 변경
DELETE FROM cart where NO = 8;
SELECT * FROM carttest;
SELECT * FROM beverage WHERE kind='커피' AND TYPE =' ' AND name=' ';
SELECT * FROM BEVERAGE WHERE (kind=' ' OR TYPE=upper(' ')) and 

SELECT *
FROM BEVERAGE
WHERE CASE
    WHEN kind = ' ' THEN kind
    WHEN type = UPPER('hot') THEN type
    WHEN name LIKE '% %' THEN name
    ELSE NULL
END IS NOT NULL
ORDER BY no;

/*

 * */

/*
SELECT *
FROM BEVERAGE
WHERE CASE
    WHEN kind = ? THEN kind
    WHEN type = UPPER(?) THEN type
    WHEN name LIKE ? THEN name
    ELSE NULL
END IS NOT NULL;
 * */
SELECT * FROM MEMBER;
SELECT point FROM MEMBER WHERE ID = 'test12';

UPDATE MEMBER SET point = point-2000 WHERE id='dlathf0202';
--SELECT point FROM MEMBER WHERE ID = ?

-- UPDATE MEMBER SET point = point-? WHERE id=?