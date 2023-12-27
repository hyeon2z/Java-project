CREATE SEQUENCE report_seq START WITH 1;

SELECT * FROM users
ORDER BY joindate;
WHERE role = 'user' AND (userid LIKE '%%' OR name LIKE '%%' OR username LIKE '%%')
SELECT * FROM reports;

INSERT INTO Reports
VALUES (
    report_seq.nextval,  -- 신고 고유 키
    '123',             -- 신고된 컨텐츠 ID
    '게시글',           -- 컨텐츠 타입
    'dlathf0202',             -- 신고자 ID
    '11',             -- 신고 받은 사람 ID
    TO_DATE(sysdate, 'YYYY-MM-DD'), -- 날짜를 NULL로 설정
    '욕설',             -- 신고 이유
    default              -- 상태 (기본값 '처리대기' 사용)
);
INSERT INTO reports
VALUES (
	report_seq.nextval,
	'0',
	'채팅',
	'관리자',
	?,
	TO_DATE(sysdate, 'YYYY-MM-DD'),
	?,
	default
)

DELETE reports;
/*
CREATE TABLE Reports (
    ReportID NUMBER PRIMARY KEY, -- 신고 고유 키
    ReportedContentID NUMBER, -- 신고 한 컨텐츠의 고유 키
    ContentType VARCHAR2(50) CHECK (ContentType IN ('게시글', '댓글', '채팅')) , -- 신고 한 컨텐츠의 종류
    ReporterUserID VARCHAR2(50) REFERENCES Users(UserID) ON DELETE SET NULL, -- 신고자의 아이디
    ReportedUserID VARCHAR2(50) REFERENCES Users(UserID) ON DELETE SET NULL, -- 피 신고자 아이디
    ReportDate varchar2(20), -- 신고 날짜
    ReportReason VARCHAR2(255), -- 신고 사유
    Status VARCHAR2(100) DEFAULT '처리대기' CHECK (Status IN ('처리완료', '처리대기', '기각'))-- 신고 처리 상태(기각,처리완료)
);

*/
SELECT * FROM REPORTS;
WHERE STATUS = '처리완료';

UPDATE reports
	SET status = '처리완료'
WHERE reportID = 14; -- 업데이트 처리상태

UPDATE users 
SET WarningCount = WarningCount + 1,
LastWarningDate = SYSDATE
WHERE userID = 
(SELECT ReportedUserID FROM reports WHERE reportID = 14);

CREATE TABLE ReportAlert ( -- 회원 경고 테이블
    UserID varchar2(50) NOT NULL REFERENCES Users(UserID) ON DELETE CASCADE, 
    -- 신고받은 사용자 아이디. 회원 탈퇴 시 해당 회원 행 삭제처리
    AlertCount number DEFAULT 0 NOT NULL, -- 사용자에 대한 경고 카운트
    PRIMARY KEY (UserID) -- 기본키 지정
);
DELETE reportalert;
SELECT * FROM reportalert;

INSERT INTO reportalert (UserID, alertCount)
SELECT reportedUserID, 0 
FROM reports 
WHERE reportID = 21;

INSERT INTO REPORTALERT
values(
	'dlathf0202',
	1
);
SELECT * FROM PETS ;
SELECT * FROM users;

update reportalert
SET alertcount = (SELECT warningcount FROM users WHERE userid = 'codemaster')
WHERE userid = 'codemaster';

UPDATE reportalert
SET alertcount = alertcount + 1
WHERE userid = 'codemaster'
  AND alertcount < (SELECT warningcount FROM users WHERE userid = 'codemaster');

SELECT warningcount FROM users
WHERE userID = 'dlathf0202';

SELECT warningcount FROM users
WHERE USERID = 
(SELECT reportedUserID FROM reports WHERE reportID = 14);

SELECT warningcount FROM users
WHERE userid = 'dlathf0202';

SELECT alertcount FROM REPORTALERT
WHERE userid = 'dlathf0202';

UPDATE REPORTALERT
SET alertcount = alertcount -1
WHERE userid = 'codemaster';
