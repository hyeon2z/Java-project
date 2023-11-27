/*
[1단계:개념] 1. 시퀀스란 무엇인가? 기본형식과 속성값을 지정하고, 사용 형태를 예시로 나열해 보세요.
[1단계:확인] 2. 4자리의 고정된 고객번호와 고객명, 나이, 주소 테이블을 만들고, 제약조건과  seqence를 이용하여 고객번호를 입력 처리하세요.
[1단계:개념] 3. 조인이란 무엇인가 개념을 정리하고, 기본 inner조인을 예제로 만들어 해당 코드를 설명하세요.
[1단계:확인] 4. 회원(회원번호, 회원명, 등급번호)과 등급테이블(등급번호, 등급명, 할인율)을 테이블을 구성하여 데이터를 입력하고, 조인관계를 처리하세요.
[1단계:확인] 5. employees, jobs, departments, locations, job_history를 이용 조인연습 문제
		1) 부서 번호가 10인 부서에 근무하는 사원의 이름, 직급, 부서, 근무지를 출력
		2) 모든 사원의 이름, 직급, 부서, 근무지를 출력하시오.
[1단계:개념] 6. 조인의 여러가지 종류를 기본에제를 통해서 그 특정을 설명하세요
[1단계:개념] 7. subquery를 사용해야 하는 경우를 기술하고 이 때, 활용하는 subquery 형식을 예시를 들어 설명하세요.
[1단계:확인] 8. subquery, inline view 를 이용해서 아래 query 처리하세요.
		EMP 테이블에서 가장 높은 급여를 받는 직원의 이름과 급여 조회하기.
		DEPT 테이블에서 부서별 평균 급여 계산하기.
		EMP 테이블에서 각 직무별로 가장 높은 급여를 받는 직원 찾기.
		각 부서에서 근무하는 직원 수 계산하기.
		EMP 테이블에서 매니저가 아닌 직원만 조회하기.
		EMP 테이블에서 각 부서별로 가장 오래 근무한 직원 찾기.
[1단계:개념] 9. 테이블 구조변경 유형을 기본예제를 통해 설명하세요.



### 1. 시퀀스란?
- **개념**: 시퀀스는 데이터베이스에서 고유한 숫자를 자동으로 생성하는 객체입니다. 주로 기본 키나 고유 식별자 생성에 사용됩니다.
- **기본 형식**:
  ```sql
  CREATE SEQUENCE sequence_name
  START WITH initial_value
  INCREMENT BY increment_value
  MINVALUE min_value
  MAXVALUE max_value
  CYCLE | NOCYCLE
  CACHE cache_size | NOCACHE;
  ```
- **사용 예시**:
  ```sql
  CREATE SEQUENCE customer_seq
  START WITH 1
  INCREMENT BY 1;
  ```

### 2. 고객번호 테이블 생성 및 시퀀스 사용
- **테이블 생성**:
  ```sql
  CREATE TABLE customers (
      customer_id NUMBER(4),
      customer_name VARCHAR2(100),
      age NUMBER,
      address VARCHAR2(200),
      CONSTRAINT pk_customer_id PRIMARY KEY (customer_id)
  );
  ```
- **시퀀스 생성 및 사용**:
  ```sql
  CREATE SEQUENCE customer_id_seq
  START WITH 1000
  INCREMENT BY 1
  MAXVALUE 9999;

  INSERT INTO customers (customer_id, customer_name, age, address)
  VALUES (customer_id_seq.NEXTVAL, 'John Doe', 30, '123 Main St');
  ```

### 3. 조인 개념 및 예제
- **개념**: 조인은 두 개 이상의 테이블을 연결하여 데이터를 검색하는 SQL 작업입니다. 테이블 간에 관계를 기반으로 데이터를 결합합니다.
- **Inner Join 예제**:
  ```sql
  SELECT employees.name, departments.name
  FROM employees, departments
  WHERE employees.department_id = departments.department_id;
  ```

### 4. 회원 및 등급 테이블 생성 및 조인
- **테이블 생성 및 데이터 입력**:
  ```sql
  CREATE TABLE members (
      member_id NUMBER,
      member_name VARCHAR2(100),
      grade_id NUMBER
  );

  CREATE TABLE grades (
      grade_id NUMBER,
      grade_name VARCHAR2(50),
      discount_rate NUMBER
  );

  INSERT INTO members VALUES (1, 'Alice', 101);
  INSERT INTO grades VALUES (101, 'Gold', 15);
  ```
- **조인 처리**:
  ```sql
  SELECT m.member_name, g.grade_name, g.discount_rate
  FROM members m, grades g 
  WHERE m.grade_id = g.grade_id;
  ```

### 5. 조인 연습 문제
- **문제 1**:
  ```sql
  SELECT e.name, j.job_title, d.department_name, l.location_name
  FROM employees e,jobs j,departments d, locations l 
  where  e.job_id = j.job_id
  and e.department_id = d.department_id
  and d.location_id = l.location_id
  and d.department_id = 10;
  ```
- **문제 2**:
  ```sql
  SELECT e.name, j.job_title, d.department_name, l.location_name
  FROM employees e,jobs j,departments d, locations l 
  where  e.job_id = j.job_id
  and e.department_id = d.department_id
  and d.location_id = l.location_id;
  ```

### 6. 조인의 종류와 특징
- **Inner Join**: 두 테이블에서 일치하는 데이터만 반환합니다.
- **Outer Join**: 왼쪽/오른쪽 테이블의 모든 데이터와 오른쪽/왼쪽 테이블의 일치하는 데이터를 반환합니다.
- **self join**: 테이블 특정 컬럼내 테이블의 일치하는 데이터를 반환합니다.
- **subjuery/inline view이용 join**: 쿼리 안에 쿼리문을 작성하여 조인 처리

### 7. 서브쿼리 사용 사례
- **사용 사례**: 특정 조건에 맞는 데이터를 필터링하거나, 하나의 쿼리 내에서 복수의 데이터 집합을 비교하고자 할 때 사용합니다.
- **예시**:
  ```sql
  SELECT employee_name
  FROM employees
  WHERE department_id IN (SELECT department_id FROM departments WHERE location_id = 100);
  ```

### 8. 서브쿼리 및 인라인 뷰를 이용한 쿼리 처리
- **가장 높은 급여를 받는 직원 조회**:
  ```sql
  SELECT employee_name, salary
  FROM employees
  WHERE salary = (SELECT MAX(salary) FROM employees);
  
  
  
  ```
- **부서별 평균 급여 계산**:
  ```sql
  SELECT department_id, AVG(salary)
  FROM employees
  GROUP BY department_id;
  ```
- **직무별로 가장 높은 급여를 받는 직원 찾기**:
  ```sql
  SELECT job_id, MAX(salary)
  FROM employees
  GROUP BY job_id;
  ```
- **각 부서에서 근무하는 직원 수 계산**:
  ```sql
  SELECT department_id, COUNT(*)
  FROM employees
  GROUP BY department_id;
  ```
- **매니저가 아닌 직원 조회**:
  ```sql
  SELECT *
  FROM employees
  WHERE employee_id NOT IN (SELECT manager_id FROM departments WHERE manager_id IS NOT NULL);
  ```
- **각 부서별로 가장 오래 근무한 직원 찾기**:
  ```sql
  SELECT department_id, employee_name, MIN(hire_date)
  FROM employees
  GROUP BY department_id;
  ```

### 9. 테이블 구조 변경 유형
- **테이블 추가**: 새로운 테이블을 생성합니다.
  ```sql
  CREATE TABLE new_table (column1 datatype, column2 datatype);
  ```
- **컬럼 추가**: 기존 테이블에 새로운 컬럼을 추가합니다.
  ```sql
  ALTER TABLE table_name ADD column_name datatype;
  ```
- **컬럼 수정**: 기존 컬럼의 데이터 유형이나 제약을 변경합니다.
  ```sql
  ALTER TABLE table_name MODIFY column_name new_datatype;
  ```
- **컬럼 삭제**: 테이블에서 컬럼을 제거합니다.
  ```sql
  ALTER TABLE table_name DROP COLUMN column_name;
  ```
- **테이블 이름 변경**: 테이블의 이름을 변경합니다.
  ```sql
  ALTER TABLE old_table_name RENAME TO new_table_name;
  ```
- **테이블 삭제**: 테이블 자체를 삭제합니다.
  ```sql
  DROP TABLE table_name;
  ```

# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 긍정적인 마음으로 수업 시간 집중하였는가?   
 */