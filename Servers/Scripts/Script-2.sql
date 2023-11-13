SELECT empno, ename, job, sal
FROM EMP
WHERE sal BETWEEN 1000 AND 3000;

/*
ResultSet rs
rs.next() : 행단위로 이동, 1번째 호출 1첫째 row 데이터 있을 때 true
            열단위로 이동 처리 방법
            rs.get데이터유형("컬럼명"),
            rs.get데이터(1) rs.get데이터(2) rs.get데이터(3)
            rs.getInt("empno") : 7499 정수형으로 가져온다.
            rs.getInt("ename") : "ALLEN" 문자열로 가져온다.
? MANAGER rs.next() 5번호출, rs.getString("job)
10번째 rs.next() : false

rs.next() true일때 처리되게 로직 구성하려면
while(rs.next()){
    rs.getInt("empno")
    ...
    rs.getDouble("sal")
}

if(rs.next()){
	rs.getInt("empno")
	rs.getDouble("sal")
}

public boolean login(String id, String pwd){
	boolean isPass = false;
	String sql = "SELECT * FROM MEMBER01 WHERE ID = ? AND PWD = ?";
	while(rs.next()){
	    if(rs.getString("id")!=null){
	        isPass = true;
	    }
	}
	if(rs.next()) isPass = true;
	-> isPass = rs.next()
	return isPass;
}
*/
SELECT * FROM emp
WHERE empno = 7499; -- rs.next()


