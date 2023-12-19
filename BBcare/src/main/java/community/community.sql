--게시판 테이블
CREATE TABLE pet_board( --board 이미 있어서 사용x
NO int, --게시판번호(실사용X)
id varchar2(30), --USER id
name varchar2(30), --USER name
time DATE, --작성날짜
title varchar2(50), --제목
img varchar2(100), --이미지 경로 잡을 부분..ㅠㅠ 
content varchar2(100), --내용
likes NUMBER, --좋아요
click NUMBER --조회수
);

--조회
SELECT * FROM pet_BOARD;

--시퀀스 
CREATE SEQUENCE pet_seq;
START WITH 1; --1부터 시작 

--삭제
DROP sequence pet_seq;
DROP TABLE pet_BOARD;

--추가
INSERT INTO PET_BOARD VALUES(pet_seq.nextval, 'iamboori', '부리', sysdate, '나는부리~', '부리사진~', '부리굳~', 999,999);
INSERT INTO PET_BOARD VALUES(pet_seq.nextval, 'bong2', '봉이', sysdate, '봉이~', '봉이사진~', '봉이굳~', 999,999);


------------------------------------------------------------------------
--댓글 테이블
CREATE TABLE comments(
NO int, --댓글번호 
id varchar2(30), --id
name varchar2(30), --닉네임
content varchar2(300), --내용
likes int, --좋아요
time DATE --작성날짜
);
--조회
SELECT * FROM Comments;
--시퀀스 추가
CREATE SEQUENCE Com_seq
START WITH 1; --1부터 시작 
--삭제
DROP sequence Com_seq;
DROP TABLE COMMENTS;

INSERT INTO comments VALUES(Com_seq.nextval, 'iamcat', '냥냥이', '강아지홈페이지 꼽사리~',0,sysdate);
INSERT INTO comments VALUES(Com_seq.nextval, 'iamdog', '리트리버','사람 좋아 강아지 좋아~',59,sysdate);
