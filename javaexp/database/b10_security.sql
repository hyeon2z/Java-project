/*
# 데이터베이스 보안을 위한 설정
1. 데이터베이스 관리자(DBA)는 사용자가 데이터베이스 객체(테이블, view, sequence)에 대한
    특정 권한을 가질 수 있게 하여, 다수의 사용자가 데이터베이스에 저장된 정보를 공유하면서도
    정보에 대한 보안이 이루어지도록 한다.
    
2. DB 서버에 접근 시, 필요한 사용자 계정/암호를 통해 로그인 인증을 받는다.

3. 권한의 역할과 종류
    1) create user : 사용자를 새롭게 생성하는 권한
    2) drop user : 사용자를 삭제하는 권한
    3) drop any table : 테이블을 삭제하는 권한
    4) query rewrite : 함수 기반 인덱스 생성 권한
    5) backup any table : 테이블 백업 권한
    6) create session : 데이터베이스에 접속할 수 있는 권한
    7) create table/view/sequence/procedure 데이터베이스의 객체를 생성하는 권한
    8) resource : 여러 객체들을 생성/사용 가능한 권한
    9) dba : 관리자 권한으로 계정을 생성하고, 권한을 부여할 수 있는 권한

# 추가 사용자 생성하기
1. system 관리자 계정으로 접근하여 scott에 dba 권한을 부여하여
    계정 생성과 권한 부여가 가능하게 하여야 한다.
    
2. 권한 부여
    system/1111
    grant dba to scott;
    
3. 사용자 생성
    create user 사용자명 identified by 비밀번호;

4. 권한 부여
    grant 권한명 to 계정명;
    create session - 접속권한
	ex) grant create session to user01;
	
	conn user01/7777;

# 사용자 계정별로 자원에 대한 접근 권한 설정
1. 테이블 생성 권한 부여
    grant create table to 계정명
    ex) grant create table to user01;
        user01에게 테이블을 생성할 수 있는 권한 부여
        
2. 전체 oracle에 사용되는 여러 객체(테이블, index, sequence 등등)에 대한 권한 부여
    grant resource to 계정명
    ex) grant resource to user01;
    
3. 전체 계정에 대한 권한 부여 내용 확인하는 테이블(시스템 테이블)
    dba_users
    select * from dba_users;
    
4. 테이블(물리적으로 저장이 필요한 객체) tablespace라는 저장공간을 할당
    alter user 사용자명 default tablespace users;
        사용자가 사용할 물리적 tablespace 설정
    alter user 사용자명 quota unlimited on users;
        사용자가 사용할 테이블 스테이스의 용량을 지정..

ex) user03//9999 계정과 비번을 만들고, 접속과 자원에 대한 접근권한을 줘서
    테이블을 생성하고 데이터를 입력하세요.

select * from dba_users; <- 권한확인
create user user03 identified by 9999;
crant create session to user03;
grant resource to user03;    
*/

SELECT * FROM dba_users;

CREATE USER user04 IDENTIFIED BY 9999;
GRANT CREATE SESSION TO user04;
GRANT resource TO user04;





