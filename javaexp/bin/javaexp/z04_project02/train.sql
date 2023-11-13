/*
열차종류 열차번호 출발역 출발시간 도착역 도착시간 소요시간 가격 좌석
 */

CREATE TABLE trainReservation(
	traintype varchar2(50),
	tno varchar2(50),
	departstation varchar2(50),
	starttime timestamp,
	arrivalstation varchar2(50),
	endtime timestamp,
	duration varchar2(50),
	price NUMBER,
	seatinfo varchar2(20)	
);
SELECT * FROM TRAINRESERVATION;

INSERT INTO TRAINRESERVATION VALUES(
'KTX산천',
'0201',
'서울',
(To_timestamp('2023-11-14 05:02','YYYY-MM-DD HH24:MI')),
'대구',
(TO_timestamp('2023-11-14 06:45','YYYY-MM-DD HH24:MI')),
'01:43소요',
43500,
'5호차 13A'
);
INSERT INTO TRAINRESERVATION VALUES(
'KTX',
'0003',
'서울',
(To_timestamp('2023-11-15 05:27','YYYY-MM-DD HH24:MI')),
'동대구',
(TO_timestamp('2023-11-15 07:21','YYYY-MM-DD HH24:MI')),
'01:54소요',
43500,
'2호차 4D'
);
INSERT INTO TRAINRESERVATION VALUES(
'무궁화호',
'1201',
'서울',
(To_timestamp('2023-11-13 05:53','YYYY-MM-DD HH24:MI')),
'대전',
(TO_timestamp('2023-11-13 07:59','YYYY-MM-DD HH24:MI')),
'02:06소요',
10800,
'6호차 38'
);
INSERT INTO TRAINRESERVATION VALUES(
'itx새마을',
'1003',
'서울',
(To_timestamp('2023-11-13 08:48','YYYY-MM-DD HH24:MI')),
'대전',
(TO_timestamp('2023-11-13 10:37','YYYY-MM-DD HH24:MI')),
'01:49소요',
16000,
'5호차 10A'
);
INSERT INTO TRAINRESERVATION VALUES(
'KTX',
'0051',
'서울',
(To_timestamp('2023-11-17 17:22','YYYY-MM-DD HH24:MI')),
'천안아산',
(TO_timestamp('2023-11-17 18:03','YYYY-MM-DD HH24:MI')),
'00:41소요',
14100,
'17호차 10A'
);

SELECT * FROM TRAINRESERVATION 
WHERE TRAINTYPE LIKE '%KTX%';
SELECT * FROM TRAINRESERVATION 
WHERE arrivalstation = '대전' AND traintype = 'KTX'
AND departstation = '서울';