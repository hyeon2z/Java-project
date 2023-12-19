CREATE SEQUENCE report_seq START WITH 1;

CREATE TABLE Reports ( -- 신고테이블
    ReportID NUMBER PRIMARY KEY, -- 신고 고유 키
    ReportedContentID NUMBER, -- 게시글 댓글 채팅에 대한 고유 키
    ContentType VARCHAR2(50), -- 'Comment', 'Post', 'Chat' 등의 값을 가짐 신고페이지에서 처리
    ReporterUserID VARCHAR2(50), -- 신고자의 아이디
    ReportDate DATE, -- 신고 날짜
    ReportReason VARCHAR2(255), -- 신고 이유
    Status VARCHAR2(100), -- 신고에 대한 처리 상태 (기각, 처리)
    FOREIGN KEY (ReporterUserID) 
    REFERENCES Users(UserID) ON DELETE SET NULL -- 
);
SELECT * FROM users;
SELECT * FROM users 
WHERE role = 'user' AND (userid LIKE '%%' OR name LIKE '%%' OR username LIKE '%%');

-- INSERT INTO Reports (VALUES)