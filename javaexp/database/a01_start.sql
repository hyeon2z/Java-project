SELECT * FROM emp;
-- DB 주석문  커서를 해당 라인에 위치시키고
-- ctrl + enter로 명령 실행
/*
# 여러줄 주석문 처리
# 조회문 기본 처리
1. 데이터는 select 구문을 이용하여 저장된 데이터를 호출(query)할 수 있다.
2. 기본형식
    select * : 전체컬럼 호출
        empno, ename : 특정컬럼 호출
    from 테이블명;  마지막에 ;(세미콜론을 통해서 명령문 종료 처리)
 */
SELECT empno, ename, job
FROM emp;
SELECT *
FROM emp;
-- ex1) emp테이블의 ename, job, sal 컬럼을 선택하여 출력
SELECT ename, job, sal FROM emp;
-- ex2) dept테이블의 deptno, dname 컬럼 출력
SELECT deptno, dname FROM dept;
-- ex3) salgrade테이블의 전체 컬럼 출력
SELECT * FROM salgrade;
/*
# 컬럼명 별칭으로 사용하기
1. 모든 테이블의 구성요소 컬럼명은 select 컬럼명으로 사용하여 호출 할 수 있다.
2. 그러나, 특정한 경우에는 컬럼을 변경하거나, 통합된 컬럼명으로 처리해야 하는 경우가 있다.
    ex) 컬럼간의 연산, 문자열 연결
    select empno||ename 사원번호와 사원명
    DB에서 +는 숫자형 연산시만 활용, 문자열 연결은 ||을 활용한다.
3. 기본형식
    select 컬럼명 as 컬럼명별칭
        : as alias로 지정하는 경우
    select 컬럼명 컬럼명별칭
        : 공백을 주고 컬럼명의 별칭을 사용하는 경우
4. 별칭컬럼명의 예외 사항
    1) 컬럼명은 특수 문자나 공백을 포함할 경우
        "특수 문 "
        와 같이 "" 사이에 넣어서 처리한다.
*/
SELECT empno, empno AS 사원번호별칭,
        ename 사원명,
        job "직 책 ?"
    FROM emp;

SELECT * FROM emp;
-- empno : 사원번호, ename : 사원명, job : 직책,
-- mgr : 관리자 번호, hiredate : 입사일, sal : 급 여!
-- deptno : 부서번호  로 각 컬럼명을 alias를 사용하여 출력하세요.
SELECT empno AS 사원번호,
        ename 사원명,
        job 직책,
        mgr "관리자 번호",
        hiredate 입사일,
        sal "급 여!",
        deptno 부서번호
    FROM emp;

SELECT ename
FROM EMP
WHERE empno = 7369;
/*
확인할 사원번호[####] [검색] : 사원번호를 입력
해당사원번호 해당하는 이름 @@@ 입니다 : 사원명 출력
==> DB서버에 접속 ==> 그 결과를 받아 ==> Java 객체로 바꿔 ==> 화면출력

sql연습
==> Java객체/변수로(기능메서드) 만드는 방법
출력할 내용을 메서드 리턴 유형과 리턴값으로 선언
입력할 내용을 메서드 매개변수 유형으로 선언한다.

리턴유형 메서드명(입력값){
    return 실제리턴값;
}

String getEname(int empno){
    String sql = "SELECT ename
					FROM EMP
					WHERE empno = "+empno;
    String ename = null;
    return ename;
}