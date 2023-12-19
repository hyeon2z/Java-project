CREATE SEQUENCE seq_sol01 START WITH 1;
CREATE SEQUENCE seq_sol02 START WITH 1;

CREATE TABLE Pets (
    petno NUMBER PRIMARY KEY,
    PetName VARCHAR2(30) NOT NULL,
    PetType VARCHAR2(30) NOT NULL,
    Breed VARCHAR2(50),
    Age NUMBER NOT NULL,
    Gender CHAR(1) CHECK (Gender IN ('F', 'M')),
    Neutered CHAR(1) CHECK (Neutered IN ('Y', 'N')),
    Weight NUMBER,
    ImageURL VARCHAR2(255),
    UserID VARCHAR2(30),
    FOREIGN KEY (UserID) REFERENCES Users(UserID) ON DELETE CASCADE
);


CREATE TABLE Users (
    userno NUMBER UNIQUE, -- 회원번호(기본키)
    UserID VARCHAR2(30) PRIMARY KEY, -- 유저아이디(고유키)
    Name VARCHAR2(30) NOT NULL, -- 유저이름
    Username VARCHAR2(30) UNIQUE, -- 닉네임
    Password VARCHAR2(30) NOT NULL, -- 비밀번호
    Email varchar2(50) NOT NULL,
    Address VARCHAR2(100) NOT NULL, -- 주소
    PhoneNumber VARCHAR2(15) NOT NULL, -- 핸드폰 번호
    PetStatus CHAR(1) CHECK (PetStatus IN ('Y', 'N')), -- 반려동물 여부
    SubStatus CHAR(1) CHECK (SubStatus IN ('Y', 'N')), -- 구독여부
    SubDate VARCHAR2(20), -- 구독결제시 날짜 입력
    Role VARCHAR2(10) CHECK (Role IN ('admin', 'user')) -- 역할
);

ALTER TABLE Users ADD joinDate date DEFAULT sysdate;

INSERT INTO USERS (userno, UserID, Name, Username, Password,Email, Address, PhoneNumber, PetStatus, SubStatus, SubDate, Role)
VALUES (seq_sol01.nextval, 'dlathf0202', '임솔', '솔꺼', 'dla159', 'dlathf0202@naver.com', '남양주', '01020264701', 'Y', 'N', NULL, 'user');

SELECT * FROM users;



/*
INSERT INTO USERS (userno, UserID, Name, Username, Password, Address, PhoneNumber, PetStatus, SubStatus, SubDate, Role)
VALUES (seq_sol01.nextval, 'dlathf0202', '임솔', '솔꺼', '0202', '남양주', '01020264701', 'Y', 'N', TO_DATE(NULL, 'YYYY-MM-DD'), 'user');
 * */