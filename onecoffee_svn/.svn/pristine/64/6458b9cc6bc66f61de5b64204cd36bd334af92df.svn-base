CREATE SEQUENCE mem_seq;
CREATE SEQUENCE mem_test;

CREATE TABLE Member(
	mem_id number, -- mem_seq , mem_test
	name varchar(50) not null,
	id varchar(20) primary key,
	pwd varchar(20) not null,
	phoneNum varchar(20) not null,
	address varchar(50) not null,
	pwdAnswer varchar(50) not null,
	point number(7) DEFAULT 0
);
INSERT INTO MEMBER VALUES (
	0,
	'admin',
	'admin',
	'1111',
	'0',
	'0',
	'0',
	0
);
INSERT INTO MEMBER VALUES (
	mem_seq.nextval,
	'임솔',
	'dlathf0202',
	'1111',
	'010-1234-5678',
	'경기도 남양주',
	'임솔',
	1000000
);
DROP TABLE MEMBER;
SELECT * FROM MEMBER;

SELECT USER FROM dual;
/*
INSERT INTO MEMBER VALUES (
	mem_test.nextval,
	?,
	?,
	?,
	?,
	?,
	?,
	0
);
*/

SELECT name, id, pwd, phonenum, address, point
FROM MEMBER
WHERE id = 'dlathf0202';
SELECT pwd, phonenum, address
FROM MEMBER
WHERE id = 'hyeon2';

UPDATE MEMBER SET
pwd = '1111', phonenum = '010-1234-5678', address = '서울'
WHERE id = 'hyeon2';