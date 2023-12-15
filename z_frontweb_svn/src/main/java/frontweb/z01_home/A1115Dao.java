package frontweb.z01_home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import frontweb.Emp;
import frontweb.database.DBCon;
import frontweb.vo.EmpHire;
import frontweb.vo.EmpHireTerm;
/*
import = "frontweb.z01_home.A1115Dao"
import = "frontweb.vo.EmpHire"
import = "java.util.List"
 * */
public class A1115Dao {
/*
1단계:확인] 1. 아래의 요청값을 처리하는 jsp화면을 만들어 보세요
	1) **사용자 이름 출력하기**: 사용자로부터 이름을 입력받아, "안녕하세요, [이름]님!" 이라고 출력하는 페이지 만들기.
	2)[생각보다 난이도 높음] **간단한 계산기**: 두 숫자와 연산자(+, -, *, /)를 입력받아 결과를 출력하는 JSP 페이지 만들기.
	3) **로그인 시뮬레이션**: 사용자 아이디와 비밀번호를 입력받아, 특정 아이디/비밀번호와 일치할 때 "로그인 성공"을, 그렇지 않으면 "로그인 실패"를 출력하는 페이지 만들기.
	4) **숫자 덧셈 vs 문자열 결합**: 두 입력값을 받아, 숫자일 경우 합을, 문자열일 경우 결합된 문자열을 출력하는 페이지 만들기.
		hint) str.matches("-?\\d+(\\.\\d+)?") 활용(숫자형일 때,true)
	5) **숫자 짝/홀 판별 **: 숫자면 짝수인지 홀수인지 판별하고 출력하는 JSP 페이지 만들기.


### 1. 사용자 이름 출력하기

```html
<!-- index.jsp -->
<form action="welcome.jsp" method="post">
    <label for="name">이름: </label>
    <input type="text" id="name" name="name"/>
    <input type="submit" value="제출"/>
</form>
```

```jsp
<!-- welcome.jsp -->
<%
    String name = request.getParameter("name");
%>
<html>
<body>
    <h2>안녕하세요, <%=name%>님!</h2>
</body>
</html>
```

### 2. 간단한 계산기

```html
<!-- calculator.jsp -->
<form action="calculate.jsp" method="post">
    <input type="text" name="num1" required />
    <select name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <input type="text" name="num2" required />
    <input type="submit" value="계산하기"/>
</form>
```

```jsp
<!-- calculate.jsp -->
<%
    String num1 = request.getParameter("num1");
    String num2 = request.getParameter("num2");
    String operator = request.getParameter("operator");
    double result = 0;
    switch (operator) {
        case "+": result = Double.parseDouble(num1) + Double.parseDouble(num2); break;
        case "-": result = Double.parseDouble(num1) - Double.parseDouble(num2); break;
        case "*": result = Double.parseDouble(num1) * Double.parseDouble(num2); break;
        case "/": result = Double.parseDouble(num1) / Double.parseDouble(num2); break;
    }
%>
<html>
<body>
    <h2>결과: <%=result%></h2>
</body>
</html>
```

### 3. 로그인 시뮬레이션

```html
<!-- login.jsp -->
<form action="loginProcess.jsp" method="post">
    <label for="userid">아이디: </label>
    <input type="text" id="userid" name="userid"/>
    <label for="password">비밀번호: </label>
    <input type="password" id="password" name="password"/>
    <input type="submit" value="로그인"/>
</form>
```

```jsp
<!-- loginProcess.jsp -->
<%
    String userid = request.getParameter("userid");
    if(userid==null) userid="";
    String password = request.getParameter("password");
    if(password==null) password="";
    String message = "로그인 실패";
    if ("admin".equals(userid) && "1234".equals(password)) {
        message = "로그인 성공";
    }
%>
<html>
<body>
    <h2><%=message%></h2>
</body>
</html>
```

### 4. 숫자 덧셈 vs 문자열 결합

```html
<!-- addOrConcatenate.jsp -->
<form action="process.jsp" method="post">
    <input type="text" name="input1" required />
    <input type="text" name="input2" required />
    <input type="submit" value="처리하기"/>
</form>
```

```jsp
<!-- process.jsp -->
<%
    String input1 = request.getParameter("input1");
    String input2 = request.getParameter("input2");
    String result;
    // input1.matches("-?\\d+(\\.\\d+)?")
    // 해당 문자열이 숫자형으로 형변환 가능한 데이터인지 여부 확인..

    if (input1.matches("-?\\d+(\\.\\d+)?") && input2.matches("-?\\d+(\\.\\d+)?")) {
        // 형변환 후, 합산 후에 문자열 할당.
        result = String.valueOf(Double.parseDouble(input1) + Double.parseDouble(input2));
    } else {
    	// 문자열을 이어주는 처리.
        result = input1 + input2;
    }
%>
<html>
<body>
    <h2>결과: <%=result%></h2>
</body>
</html>
```

### 5. 숫자 짝/홀 판별

```html
<!-- evenOrOdd.jsp -->
<form action="checkEvenOdd.jsp" method="post">
    <input type="text" name="number" required />
    <input type="submit" value="판별하기"/>
</form>
```

```jsp
<!-- checkEvenOdd.jsp -->
<%
    String number = request.getParameter("number");
    String message = "숫자가 아님";
    if (number.matches("-?\\d+")) {
        int num = Integer.parseInt(number);
        message = num % 2 == 0 ? "짝수" : "홀수";
    }
%>
<html>
<body>
    <h2><%=message%></h2>
</body>
</html>
```

[1단계:확인] 2. 아래 내용을 DB로 처리하여 화면에 출력하세요.
        # 처리순서, sql구문, 메서드선언, 화면호출, 요청값처리
	1)[선택]  부서번호별 직원 조회: EMP와 각 부서 번호에 해당하는 직원들의 이름과 부서번호를 조회하는 쿼리 작성.
	   부서번호 [10~40  ] [조회] 
           사원번호 사원명  급여  부서번호
   SELECT empno, ename, sal, deptno
	FROM emp
	WHERE deptno = ? 
*/
	public List<Emp> getEmpListByDeptno(int deptno){
		List<Emp> elist = new ArrayList<Emp>();
		String sql = "   SELECT empno, ename, sal, deptno\r\n"
						+ "	FROM emp\r\n"
						+ "	WHERE deptno = ?";
		try( Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);){
			// 처리코드1
			pstmt.setInt(1, deptno);
			try( ResultSet rs = pstmt.executeQuery();){
				// 처리코드2
				while(rs.next()) {
					elist.add(
						new Emp(
							rs.getInt("empno"),
							rs.getString("ename"),
							rs.getDouble("sal"),
							rs.getInt("deptno")
						)
					);
					
				}
				System.out.println("데이터 건수:"+elist.size());
			}
		}catch(SQLException e) {
			System.out.println("DB 에러:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러:"+e.getMessage());
		}		
		return elist;
	}
	
/*           
	2) 직책명 [     ]
	   입사분기 [1~4 ]  [조회]
           사원번호 사원명 직책명 입사분기 입사일
       empno, ename, job, hire_qua, hire_str    
          
SELECT empno, ename, job, TO_CHAR(hiredate, 'Q') hire_qua, 
		TO_CHAR(hiredate, 'YYYY/MM/DD') hire_str
FROM emp
WHERE job like ?
AND TO_CHAR(hiredate, 'Q') = ?
입력값: job, hire_qua
출력값: empno, ename, job, hire_qua, hire_str
class EmpHire{
	private int empno;
	private String ename;
	private String job;
	private String hire_qua;
	private String hire_str;
}
*/
	public List<EmpHire> getEmpHireInfo(String job, String hire_qua){
		List<EmpHire> hiList = new ArrayList<EmpHire>();
		String sql = "SELECT empno, ename, job, TO_CHAR(hiredate, 'Q') hire_qua, \r\n"
				+ "		TO_CHAR(hiredate, 'YYYY/MM/DD') hire_str\r\n"
				+ "FROM emp\r\n"
				+ "WHERE job like ?\r\n"
				+ "AND TO_CHAR(hiredate, 'Q') = ?";
		try( Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);){
			// 처리코드1
			pstmt.setString(1, "%"+job+"%");
			pstmt.setString(2, hire_qua);
			try( ResultSet rs = pstmt.executeQuery();){
				// 처리코드2
				while(rs.next()) {
					// empno, ename, job, hire_qua, hire_str
					hiList.add(
						new EmpHire(
						rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getString("hire_qua"),
						rs.getString("hire_str") )
					);					
				}
				System.out.println("데이터 건수:"+hiList.size());
			}
		}catch(SQLException e) {
			System.out.println("DB 에러:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러:"+e.getMessage());
		}		
		
		
		
		return hiList;
	}
	
/*              
        3) 특정 기간에 입사한 직원 조회: EMP 테이블을 사용하여 @@@@/@@/@@ 부터 @@@@/@@/@@ 사이에 입사한 직원들의 목록을 조회하는 쿼리 작성.
	   입사일:[@@@@/@@/@@] ~ [@@@@/@@/@@] [검색]
	   사원번호 사원명 직책 입사일(@@@/@@/@@표시) 부서번호
empno, ename, job, hirestr, deptno

SELECT empno, ename, job, 
TO_CHAR(hiredate, 'YYYY/MM/DD') hirestr, deptno
FROM emp
WHERE hiredate BETWEEN TO_DATE(?, 'YYYY/MM/DD') 
			          AND TO_DATE(?, 'YYYY/MM/DD')
출력 : empno, ename, job, hirestr, deptno			          
입력 : start, end
			          
class EmpHireTerm{
	private int empno;
	private String ename;
	private String job;
	private String hirestr;
	private int deptno;
	
}
 * */
	public List<EmpHireTerm> getEmpHireList(String start, String end ){
		List<EmpHireTerm> list = new ArrayList<EmpHireTerm>();
		String sql = "SELECT empno, ename, job, \r\n"
					+ "TO_CHAR(hiredate, 'YYYY/MM/DD') hirestr, deptno\r\n"
					+ "FROM emp\r\n"
					+ "WHERE hiredate BETWEEN TO_DATE(?, 'YYYY/MM/DD') \r\n"
					+ "		          AND TO_DATE(?, 'YYYY/MM/DD')";
		try( Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);){
			// 처리코드1
			pstmt.setString(1, start);
			pstmt.setString(2, end);
			try( ResultSet rs = pstmt.executeQuery();){
				// 처리코드2
				while(rs.next()) {
					list.add(
						new EmpHireTerm(
							rs.getInt("empno"),
							rs.getString("ename"),
							rs.getString("job"),
							rs.getString("hirestr"),
							rs.getInt("deptno")
							)
						);
				}
				System.out.println("데이터 건수:"+list.size());
			}
		}catch(SQLException e) {
			System.out.println("DB 에러:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러:"+e.getMessage());
		}		
		
		return list;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
