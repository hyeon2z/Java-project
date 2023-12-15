package javaexp.z02_homework.a00_yhs;

public class A1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*
[1단계:확인] 1. 아래 sql문을 작성해보세요..
	1) 급여에 10% 증가시킨 금액 조회
	2) 사원명과 입사일을 연결하여 조회
	3) 사원명과 해당 사원의 관리자번호와 연결하여 조회
	4) @@@(사원명)의 입사일은 @@@인데, 현재 급여와 보너스 합산액은 @@@이고,
	   이중에서 8%인 @@@이 세금입니다.(출력)
	5) 관리자번호가 중복되지 않게 출력하세요
[1단계:확인] 2. WHERE 조건문을 활용하여 아래 내용을 처리하세요
    1) 급여가 3000이상인 사원정보 출력
	2) 부서번호가 10이고 급여가 4000미만인 사원정보 출력
[1단계:개념] 3. 컬럼=null과 컬럼 is null의 차이점을 sql을 통해서 설명하세요 
**[1단계:확인] 1. 아래 sql문을 작성해보세요..**

1) 급여에 10% 증가시킨 금액 조회
```sql
SELECT empno, ename, sal * 1.10 AS increased_sal 
FROM emp;
```

2) 사원명과 입사일을 연결하여 조회
```sql TO_CHAR(hiredate, 'YYYY-MM-DD')
SELECT ename || ' joined on ' || 
	TO_CHAR(hiredate, 'YYYY-MM-DD') AS employee_info 
FROM emp;
```

3) 사원명과 해당 사원의 관리자번호와 연결하여 조회
```sql
SELECT ename || ' has manager with ID ' || TO_CHAR(mgr) AS management_info 
FROM emp 
WHERE mgr IS NOT NULL;
```

4) @@@(사원명)의 입사일은 @@@인데, 현재 급여와 보너스 합산액은 @@@이고, 이중에서 8%인 @@@이 세금입니다.(출력)
```sql  TO_CHAR(hiredate, 'YYYY-MM-DD') 
hiredate :날짜형 ==> 특정한 형식으로 문자열로 보이고자 to_char() 내장
to_char(컬럼, '형식')

SELECT '@@@(' || ename || ')의 입사일은 ' || TO_CHAR(hiredate, 'YYYY-MM-DD') 
       || '인데, 현재 급여와 보너스 합산액은 ' || (sal + NVL(comm, 0)) 
       || '이고, 이중에서 8%인 ' || 
       (sal + NVL(comm, 0)) * 0.08 || '이 세금입니다.' AS message 
FROM emp;
```

5) 관리자번호가 중복되지 않게 출력하세요
```sql
SELECT DISTINCT mgr 
FROM emp 
WHERE mgr IS NOT NULL;
```

**[1단계:확인] 2. WHERE 조건문을 활용하여 아래 내용을 처리하세요**

1) 급여가 3000이상인 사원정보 출력
```sql
SELECT * 
FROM emp 
WHERE sal >= 3000;
```

2) 부서번호가 10이고 급여가 4000미만인 사원정보 출력
```sql
SELECT * 
FROM emp 
WHERE deptno = 10 AND sal < 4000;
```

**[1단계:개념] 3. 컬럼=null과 컬럼 is null의 차이점을 sql을 통해서 설명하세요**

In SQL, you can't use the `=` (equality) operator to check for null values. Instead, you should use the `IS NULL` or `IS NOT NULL` operator. 

- `column = NULL` is always false, regardless of the content of the column.
- `column IS NULL` will return true for rows where the column is null.

예제:
```sql
-- This won't return any rows, even if there are null values in the 'comm' column
SELECT * 
FROM emp 
WHERE comm = NULL;

-- This will return rows where the 'comm' column is null
SELECT * 
FROM emp 
WHERE comm IS NULL;
```
이러한 특징 때문에 NULL 값을 검사할 때는 항상 `IS NULL` 또는 `IS NOT NULL`을 사용해야 합니다.  
    */
	}

}
