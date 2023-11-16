SELECT * 
FROM emp
WHERE ename LIKE '%A%';
-- 리턴할 객체 List<Emp> getList(String ename)
/*
private int empno;
private String ename;
private String job;
private int mgr;
private Date hiredate;
private double sal;
private double comm;
private int deptno;
*/
SELECT max(sal)
FROM EMP
WHERE deptno=10;
-- ex) 위 구문 처리할 때 메서드 선언
-- public double getMax(int deptno){double max = 0; RETURN max;}
SELECT ename
FROM emp
WHERE empno = 7369;
-- public String getName(int empno){String name = ""; return name;}
SELECT hiredate
FROM emp
WHERE ename = 'SMITH';
-- public Date getHire(String ename){Date hire = null; return hire;}
SELECT empno, ename, job
FROM emp
WHERE empno = 7369;
-- empno, ename, job 데이터 유형 확인
-- int    String String
-- ==> VO 처리(여러개 열 일때)
/* 기존에 Epm에 포함되어 있으면, 추가할 필요없이 재활용
public EmpShort getEmpSht(int empno){ EmpShort es = null; return es;}
class EmpShort{
    private int empno;
    private String ename;
    private String job;
    // 1. 기본생성자 2. 매개변수 생성자 3. set/get메서드 선언
}
*/
SELECT count(*)
FROM DEPT
WHERE deptno = 20;
-- public int getCount(int deptno){int count = 0; return count;}

SELECT *
FROM DEPT
WHERE dname = 'ACCOUNTING';
/*
class Dept{
    private int deptno;
    private String dname;
    private String loc;
}
 */
-- public Dept getDept(String dname){Dept getDept = null; return getDept;}

/*
한개의 열에 여러 행이 있는 리턴값. 입력 2개 숫자형
    List<데이터유형>
    List<String>, List<Integer>, List<Double>, List<Date>
	public List<String> get
 */
-- public List<String> getEnames(int start, int end){}
SELECT ename
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

SELECT sal
FROM emp
WHERE deptno=10;
-- public List<Double> getSal(int deptno){}

SELECT *
FROM emp
WHERE sal BETWEEN 1000 AND 3000;
/*
public List<Emp> getEmpList(int start, int end){
    List<Emp> emplist = new ArrayList<Emp>();
    String sql = "SELECT *
                  FROM emp
                  WHERE sal BETWEEN "+start+" AND "+end;
    return emplist;
}
*/
SELECT *
FROM dept
WHERE dname LIKE '%S%';
/*
ex) 메서드 선언
    행이 여러개인지? List(여러개)
    열이 여러개인지? 단일 타입 String/int/double, 객체(클래스 선언)

public List<Dept> getDeptList(String s){
     List<Dept> deptlist = new ArrayList<Dept>();
     String sql = "SELECT *
                   FROM dept
                   WHERE dname LIKE"+%s%;
     return deptlist;
     }
 */

CREATE TABLE member01(
    mno NUMBER,
    name varchar2(50),
    id varchar2(50),
    pwd varchar2(30),
    auth varchar2(20),
    point NUMBER
);
SELECT * FROM member01;
INSERT INTO member01 values(1,'홍길동','himan','7777','admin',1000);
INSERT INTO member01 values(2,'김길동','goodman','7777','normal',2000);
--DELETE FROM member01;
/*
class Member{
    private int mno;
    private String name;
    private String id;
    private String pwd;
    private String auth;
    private int point;
}
 */
-- 회원가입
-- INSERT INTO member01 values(1,'홍길동','himan','7777','admin',1000);
-- public void insertMember(Member ins){}

-- 회원리스트확인
SELECT *
FROM member01
WHERE name LIKE '%길동%';
-- public List<Member> schMember(String nameSch)
-- 로그인처리
-- 화면에 id/pass를 통해 로그인 처리
SELECT *
FROM MEMBER01
WHERE id = 'himan' AND pwd = '777';
-- 입력값을 id와 pwd 입력 처리, 리턴할 내용을 Member객체로 리턴

public Member login(String id, String pwd){
    MEMBER mem = NULL;
    RETURN mem;
}

/*
확인할 사원명 : [ ][급여검색]
해당사원의 급여는 @@@입니다.
==> sql만들고, 기능메서드 선언

입력할 값 : 사원명 ename 조건문에서 처리
출력할 값 : 급여 sal select 선언
*/
SELECT ename, sal
FROM emp
WHERE ename LIKE '%SMITH%';


--public List<Emp> schSal(String ename){
--	List<Emp> eSal = NEW ArrayList<Emp>();
--	String SQL = "SELECT ename, sal
--					FROM emp
--					WHERE ename LIKE '%"+ename+"%'";
--	RETURN eSal;
--}

--사원번호 : [   ][직책검색]
--해당사원의 직책은 @@@ 입니다.
--입력 : 사원번호
--출력 : 직책

SELECT job
FROM emp
WHERE deptno = 4562;

public String empJob(int deptno){
   String eJob = NULL;
   String SQL = "";
}

/*
부서번호 [  ] [해당하는사원명검색]
사원명
@@@
@@@
@@@
@@@
입력 : 부서번호 where deptno = 10
출력 : 사원명 select ename

출력할 내용을 메서드 리턴 유형과 리턴값으로 선언
입력할 내용을 메서드 매개변수 유형으로 선언한다.
# 메서드 틀
행이 여러개일때는 List<데이터유형> 
    숫자형 => List<Integer>
         => List<Double>
    문자열 => List<String>
public 리턴유형 메서드명(입력값){
    리턴유형 변수명 = 초기값;
    String sql = "";
    return 변수명;
    
}
*/
select ename
from emp
where deptno=10;

--public List<String> getEnamesByDeptno(int deptno){
--    List<String> enames = NEW ArrayList<String>();
--   String SQL = "select ename
--from emp
--where deptno="+deptno;
--  RETURN enames;
--}

--직책 : [  ][사원번호를 확인]
--사원번호
--@@@
--@@@
--입력값 :
--출력값 :
--sql구문
--메서드 선언

SELECT deptno
FROM emp
WHERE job LIKE 'CLERK';

--public List<Integer> getDeptno(String job){
--    List<Integer> deptnos = NEW arrayLIst<Integer>();
--   String SQL = "";
--  RETURN deptnos;
--}
/*
 * 검색할 급여범위
 * [ ]~[ ] [사원정보검색]
 * # 조회된 값과 리턴유형에 따른 선언 형식
 * int/double/String : 단일행/단일열
 * List<데이터유형> : 다중행
 * 클래스선언 : 다중열 일 때
 * List<클래스> : 다중행/다중열
 * 
 * public List<Emp> getEmpList(double min, double max){
 * 		List<Emp> empList = new ArrayList<Emp>();
 *      String sql = "SELECT *
					FROM emp
					WHERE sal BETWEEN "+min+" AND "+max;
 *      return empList;
 * }
 */
SELECT *
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

/*
 * 사원번호 [  ] [사원정보확인]
 * ### 사원정보 ###
 * 사원명 : @@@
 * 직책 : @@@
 * 급여 : @@@
 * 부서번호 : @@@
 * 입력값 : empno
 * 출력값 : ename, job, sal, deptno -> 한번에 리턴할 객체
 * class EmpShow{} ==> class Emp{} 위 내용이 선언된 Emp에 포함되어 있기에 ㄱㅊ
 * private String ename;
 * private String job;
 * private double sal;
 * private int deptno;
 * 생성자1(default)
 * 생성자2(매개변수 있는 생성자)
 * set/get 메서드 생성
 * 여러개 컬럼이 있을 때는 클래스로 선언하여 처리한다.
 */
SELECT ename, job, sal, deptno
FROM emp
WHERE empno = 7499;

--public EmpShow getEmpByEmpno(int empno){
--	EmpShow es = NULL;
--	String SQL = "SELECT ename, job, sal, deptno
--FROM emp
--WHERE empno ="+empno;
--	RETURN es;
--}

/*
사원명 : [  ][사원정보확인]
사원번호 직책 급여 부서번호
위와 같이 처리되는 sql과 메서드 선언
*/
SELECT empno, job, sal, deptno
FROM emp
WHERE ename LIKE 'SMITH';

--public EmpInfo2 getEmpInfo(String ename){
--	EmpInfo2 show = NULL;
--	String SQL = "SELECT empno, job, sal, deptno
--FROM emp
--WHERE ename LIKE '"+ename+"'";
--	RETURN show;
--}

/*
 * 부서번호 : [  ]
 * 직책 : [  ] [사원정보]
 */
SELECT *
FROM emp
WHERE deptno = 20 AND job LIKE 'CLERK';

--public List<Emp> getEmpInfo(int deptno, String job){
--    List<Emp> empInfo = NEW ArrayList<Emp>();
--    String SQL = "SELECT *
--				FROM emp
--				WHERE deptno ="+deptno+"AND job LIKE '"+job+"'";
--    RETURN empInfo;
--}

/*
날짜별 예약 리스트를 보고 예약 처리하는 구조

날짜별 예약 내용
검색할 날짜 [  ]
[date]     [StartLoc] [EndLoc] [StartTime] [EndTime]
2023-11-14  서울         대구      9           12
2023-11-14  서울         대구      9           12
2023-11-14  서울         대구      9           12
2023-11-14  서울         대구      9           12

==> 예약 처리했을 데이터가 예약 입력되는 처리

1. 테이블 생성
*/
create table reservation(
    rno number,
    resdate date,
    startloc varchar2(50),
    endloc varchar2(50),
    starttime number(2,0),
    endtime number(2,0)
);
SELECT * FROM reservation;
/*
2. 데이터 입력
*/
SELECT to_date('2023-11-14','YYYY-MM-DD') FROM dual;
CREATE SEQUENCE res_seq; -- 자동 numbering 하는 오라클 객체
INSERT INTO reservation values(res_seq.nextval,
		to_date('2023-11-13','YYYY-MM-DD'),
		'서울','대구',9,12);
INSERT INTO reservation values(res_seq.nextval,
		to_date('2023-11-12','YYYY-MM-DD'),
		'서울','대구',10,13);
INSERT INTO reservation values(res_seq.nextval,
		to_date('2023-11-16','YYYY-MM-DD'),
		'서울','대구',11,14);

SELECT TO_char(resdate,'YYYY-MM-DD')FROM reservation;
SELECT *
FROM reservation
WHERE TO_char(resdate,'YYYY-MM-DD') = '2023-11-14';
/*
# 예약리스트 조회
3. 조회 sql 작성
SELECT *
FROM reservation
WHERE TO_char(resdate,'YYYY-MM-DD') = '2023-11-14';
4. VO객체 작성
class Reservation{
	private int rno;
	private Date resdate;
	private String startloc;
	private String endloc;
	private int starttime;
	private int endtime;
	}
5. 기능메서드 선언
public List<Reservation> getResListByDate(String date){
	List<Reservation> rlist = new List<Reservation>();
	String sql = "
		SELECT *
		FROM reservation
		WHERE TO_char(resdate,'YYYY-MM-DD') = '"+date+"'
	";
	return rlist;
}
# 예약처리
6. 입력 sql 작성
INSERT INTO reservation values(res_seq.nextval,
		to_date('2023-11-13','YYYY-MM-DD'),
		'서울','대구',9,12)
7. 기능메서드 선언
public void inserReservation(Reservation ins){
     String sql = "";
}
*/

/*
출발역 : [   ] 도착역 : [   ] [검색]
리스트 내용
[date]     [StartLoc] [EndLoc] [StartTime] [EndTime]
[열차번호][열차종류][출발역][도착역][좌석정보][가격][소요시간]
1. 테이블 생성
2. 기본 데이터 입력
3. sql 작성
4. VO 클래스 선언
5. 기능 메서드 선언 

*/
CREATE TABLE trainschedule(
	tno char(10),
	ttype varchar2(50),
	departstation varchar2(50),
	arrivalstation varchar2(50),
	seatinfo varchar2(20),
	price NUMBER,
	duration number(3,1)
);
/*
class Trainschedule
private String tno;
private String ttype;
private String departstation;
private String arrivalstation;
private String seatinfo;
private int price;
private double duration;
public List<Trainschedule> getList(String dpart, String arri){
	List<Trainschedule> list = new ArrayList<Trainschedule>();
	String sql = "";
	return list;
}
 */
INSERT INTO trainschedule values('KR10000001','KTX','서울','대전','A01',
	30000,1.5);
INSERT INTO trainschedule values('KR10000002','새마을','서울','부산','A05',
	50000,4.0);
SELECT * FROM TRAINSCHEDULE
WHERE departstation = '서울' AND arrivalstation = '대전';