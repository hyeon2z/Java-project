package javaexp.z02_homework;

public class A1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[1단계:개념] 1. decode(), case when구문의 기본 형식을 정리하세요
decode(컬럼 또는 데이터, 1번값, 1번값일시 처리할 데이터
                   2번값, 2번값일때 처리할 데이터
                   ..
                   그외일때 데이터)

case[컬럼명]
        when 비교/논리연산식 then 처리할데이터,
        when 비교/논리연산식 then 처리할데이터,
        when 비교/논리연산식 then 처리할데이터,
        else 기타 처리할 데이터
    end 
[1단계:확인] 2. decode() 활용해서, 직책별 보너스를 각각 다르게 처리하여, 
%로 출력하고, sal에 적용하여 금액도 출력해보세요.
select job_id 직책, decode(COMMISSION_PCT , 0.1, '10%',
                      0.15, '15%',
                      0.2, '20%',
                      0.25, '25%',
                      0.3, '30%',
                      0.35, '35%',
                      0.4, '40%', '보너스없음') "보너스%",
decode(COMMISSION_PCT , 0.1, (1.1*SALARY),
	0.15, (1.15*SALARY),
	0.2, (1.2*SALARY),
	0.25, (1.25*SALARY),
	0.3, (1.3*SALARY),
	0.35, (1.35*SALARY),
	0.4, (1.4*SALARY), SALARY) "보너스%포함월급"
FROM EMPLOYEES;

[1단계:확인] 3. case when 활용해서, 11,12,1,2 겨울, 3,4,5 봄 6,7,8 여름, 9,10 가을 로 입사월을 기준으로 계절을 표시하세요.
SELECT ename 사원명, hiredate 입사일,
CASE WHEN to_char(hiredate,'MM')>=11 THEN '겨울'
WHEN to_char(hiredate,'MM')>=9 THEN '가을'
WHEN to_char(hiredate,'MM')>=6 THEN '여름'
WHEN to_char(hiredate,'MM')>=3 THEN '봄'
WHEN to_char(hiredate,'MM')<=2 THEN '겨울'
END "계절"
FROM emp;
[1단계:개념] 4. dao 처리를 위한 환경 구성을 기술하세요.
1. DB서버 구동
원격으로 DB서버를 구동하고,
DB서버 접속을 위한 정보가 있어야 함.
ip, port, DB서버명, 계정, 비밀번호

2. jdbc 드라이버
각 DB서버 회사에서는 해당 서버 접속을 위해 공통되는 java프로그램을 컴파일시켜 패키지화한 모듈이 필요함
@@@.jar 라고 되어있음.
- ojdbc11.jar
WEB프로그래밍의 경우엔 webapp 하위 WEB-INF 밑 lib 에 가지고 있어야함.

[1단계:개념] 5. 연결객체의 주요 선언 내용를 기술하세요
Connection con(변수명) : 연결객체 선언
Statement stmt : 대화객체(sql을 이용해서 오라클서버에 명령을 처리)
PreparedStatement pstmt : 향상된 대화객체
 - 여러가지 보안 사항이 적용된 객체로 sql을 이용하여 오라클서버에 명령을 처리한다
ResultSet rs : 결과처리 객체

[1단계:개념] 6. 아래에 내용의 sql을 작성하고 해당하는 메서드를 선언하세요.
		1)EMP 테이블에서 부서 번호가 [조건]인 모든 직원의 이름을 선택하세요.
		public List<Emp> schMember(int deptno){
			List<Emp> mlist = new ArrayList<Emp>();
			String sql = "select *\r\n"
					+ "from emp\r\n"
					+ "where deptno = "+deptno;
			return mlist;
		    }
		
		2)직원들 중에서 급여가 [조건] 이상인 사람들의 이름과 급여를 선택하세요.
		public List<Emp> schMem(int sal){
			List<Emp> mlist = new ArrayList<Emp>();
			String sql = "SELECT ename, sal\r\n"
					+ "FROM emp\r\n"
					+ "WHERE sal>"+sal;
			return mlist;
		
		3)DEPT 테이블에서 모든 부서의 부서 번호와 부서 이름을 선택하세요.
		select deptno, dname
		from dept;
		
		public List<Dept> schMem(){
			List<Dept> mlist = new ArrayList<Dept>();
			String sql = "SELECT deptno, dname\r\n"
					+ "FROM dept";
			return mlist;
		}
		
		4)[조건]라는 이름을 가진 직원의 모든 정보를 선택하세요.
		public List<Emp> schMem(String memSch){
			List<Emp> mlist = new ArrayList<Emp>();
			String sql = "SELECT *\r\n"
				+ "FROM emp\r\n"
				+ "WHERE ename LIKE '%"+memSch+"%'";
				return mlist;
		}
		
		5)각 부서별로 직원 수를 계산하세요.
		public List<Emp> schMem(){
			List<Emp> mlist = new ArrayList<Emp>();
			String sql = "SELECT count(*)\r\n"
				+ "FROM emp\r\n"
				+ "GROUP BY deptno";
				return mlist;
		}
		
		6)EMP 테이블에서 직책이 [조건]인 모든 직원의 이름을 선택하세요.
		public List<Emp> schMem(String memSch){
			List<Emp> mlist = new ArrayList<Emp>();
			String sql = "SELECT ename\r\n"
				+ "FROM emp\r\n"
				+ "WHERE job LIKE '%"+memSch+"%'";
				return mlist;
		}
		
		7)EMP 테이블에서 [조건]년에 입사한 모든 직원의 이름과 입사 날짜를 선택하세요.
		public List<Emp> schMem(int year){
			List<Emp> mlist = new ArrayList<Emp>();
			String sql = "SELECT ename, hiredate\r\n"
				+ "FROM emp\r\n"
				+ "WHERE to_char(hiredate, 'YYYY') ="+year;
			return mlist;
		}
		
		8)EMP 테이블에서 급여가 [조건]에서 [조건] 사이인 직원들의 이름을 선택하세요.
		public List<Emp> schMem(int sal1, int sal2){
			List<Emp> mlist = new ArrayList<Emp>();
			String sql = "SELECT ename\r\n"
				+ "FROM emp\r\n"
				+ "WHERE sal BETWEEN"+sal1+"AND"+sal2;
		}
		
		9)EMP 테이블에서 직책별로 최고 급여를 받는 직원의 이름과 급여를 찾으세요.
		??
		
		10)EMP 테이블에서 마지막 이름이 '[조건]'로 끝나는 직원들의 이름을 선택하세요.
		public List<Emp> schMem(String name){
			List<Emp> mlist = new ArrayList<Emp>();
			String sql = "SELECT ename\r\n"
				+ "FROM emp\r\n"
				+ "WHERE ename LIKE '%"+H+"'";
		}
		
 * */
	}

}
