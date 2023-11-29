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
	terms varchar(1) not NULL,
	point number(7)
);
INSERT INTO MEMBER VALUES (
	0,
	'admin',
	'admin',
	'1111',
	'0',
	'0',
	'0',
	'0',
	'0'
);
INSERT INTO MEMBER VALUES (
	mem_test.nextval,
	'게스트',
	'guest1',
	'guest1122',
	'010-1234-5678',
	'서울시 강남구',
	'서울시',
	'1',
	0
);
DROP TABLE MEMBER;
SELECT * FROM MEMBER;

SELECT USER FROM dual;
