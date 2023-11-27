/*
[1단계:확인] 1. 아래의 테이블을 생성하고, 데이터를 입력하세요
	1) 학생 정보를 저장하는 테이블을 생성하십시오. 학생 번호, 이름, 성별, 생년월일, 전화번호를 저장해야 합니다.
	2) 주문 정보를 저장하는 테이블을 생성하십시오. 주문 번호, 고객 번호, 주문 날짜, 제품 번호, 수량, 주문 금액을 저장해야 합니다.
	3) 도서 정보를 저장하는 테이블을 생성하십시오. 도서 번호, 제목, 저자, 출판사, 출판 년도, 재고량을 저장해야 합니다.
	4) 직원 정보를 저장하는 테이블을 생성하십시오. 직원 번호, 이름, 부서, 입사일, 급여를 저장해야 합니다.
	5) 고객 정보를 저장하는 테이블을 생성하십시오. 고객 번호, 이름, 주소, 이메일 주소, 가입일을 저장해야 합니다.
[1단계:개념] 2. 제약조건 5가지의 각각의 기본 예제를 만들고, 해당 제약조건의 의미를 기술하세요. 
[1단계:확인] 3. 제약조건 테이블 생성 연습
	1)고객 테이블은 고객번호, 고객 이름, 나이, 등급, 직업, 적립금 속성으로 구성되고, 고객번호 속성이 기본키다. 고객이름과 등급 속성은 값을 반드시 입력해야 하고, 적립금 속성은 값을 입력하지 않으면 0이 기본으로 되도록 생성하라.
	2)제품 테이블은 제품번호, 제품명, 재고량, 단가, 제조업체 속성으로 구성되고, 제품번호 속성이 기본키다. 제품번호는 10자리 숫자여야 하고, 제품명은 100자 이내여야 한다. 재고량은 0 이상이어야 하고, 단가는 0 이상 1000 이하여야 한다. 제조업체는 "삼성전자", "LG전자", "애플" 중 하나여야 한다.
	3)거래 테이블은 거래번호, 거래일자, 거래금액, 거래처, 거래품목 속성으로 구성되고, 거래번호 속성이 기본키다. 거래일자는 오늘 날짜보다 이전이어야 한다. 거래금액은 10000원 이상이어야 한다. 거래처는 "회사", "개인" 중 하나여야 한다. 거래품목은 "컴퓨터", "노트북", "모니터" 중 하나여야 한다
# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 수업 시간 집중하였는가?  


이 요청은 Oracle 데이터베이스를 사용하여 특정 테이블을 생성하고, 제약조건을 설정하는 것에 관한 것입니다. 다음과 같이 작업을 수행할 수 있습니다:

### 1. 테이블 생성 및 데이터 입력
1. **학생 정보 테이블 생성**:
   ```sql
   CREATE TABLE Students (
       student_id number PRIMARY KEY,
       name VARCHAR2(100),
       gender CHAR(1),
       birth_date DATE,
       phone_number VARCHAR2(15)
   );
   ```

2. **주문 정보 테이블 생성**:
   ```sql
   CREATE TABLE Orders (
       order_id number PRIMARY KEY,
       customer_id number,
       order_date DATE,
       product_id number,
       quantity number,
       order_amount number
   );
   ```

3. **도서 정보 테이블 생성**:
   ```sql
   CREATE TABLE Books (
       book_id number PRIMARY KEY,
       title VARCHAR2(200),
       author VARCHAR2(100),
       publisher VARCHAR2(100),
       publish_year number,
       stock_amount number
   );
   ```

4. **직원 정보 테이블 생성**:
   ```sql
   CREATE TABLE Employees (
       employee_id number PRIMARY KEY,
       name VARCHAR2(100),
       department VARCHAR2(100),
       hire_date DATE,
       salary number
   );
   ```

5. **고객 정보 테이블 생성**:
   ```sql
   CREATE TABLE Customers (
       customer_id number PRIMARY KEY,
       name VARCHAR2(100),
       address VARCHAR2(200),
       email VARCHAR2(100),
       join_date DATE
   );
   ```

### 2. 제약조건의 예제 및 의미
1. **PRIMARY KEY**: 기본키, 고유 식별자. 중복 불가.
   - 예: `student_id number PRIMARY KEY`
2. **FOREIGN KEY**: 다른 테이블의 기본키를 참조하는 키.
   - 예: `customer_id number REFERENCES Customers(customer_id)`
3. **NOT NULL**: 필드가 비어 있을 수 없음.
   - 예: `name VARCHAR2(100) NOT NULL`
4. **UNIQUE**: 모든 값이 고유해야 함.
   - 예: `email VARCHAR2(100) UNIQUE`
5. **CHECK**: 특정 조건을 만족해야 하는 필드.
   - 예: `salary number CHECK (salary > 0)`

### 3. 제약조건 테이블 생성 연습
1. **고객 테이블**:
   ```sql
   CREATE TABLE Customer (
       customer_id number PRIMARY KEY,
       name VARCHAR2(100) NOT NULL,
       age number,
       grade VARCHAR2(50) NOT NULL,
       job VARCHAR2(100),
       points number DEFAULT 0
   );
    DEFAULT : 기본 입력으로 처리 되는 내용, 명시적으로 null인 경우 설정 안됨..
   
   ```

2. **제품 테이블**:
   ```sql
CREATE TABLE Product99 (
    product_id number(10) PRIMARY KEY,
    product_name VARCHAR2(100) CHECK (LENGTH(product_name) <= 100),
    stock number CHECK (stock >= 0),
    price number CHECK (price >= 0 AND price <= 1000),
    manufacturer VARCHAR2(100) CHECK (manufacturer IN ('삼성전자', 'LG전자', '애플')),
    CONSTRAINT chk_product_id_length 
    	CHECK (LENGTH(TO_CHAR(product_id)) = 10)
);
   ```

3. **거래 테이블**:
   ```sql
   
   select to_char(sysdate,'YYYY-MM-DD')  from dual;
   CREATE TABLE Transaction (
       transaction_id number PRIMARY KEY,
       transaction_date DATE CHECK (
       		transaction_date <= to_date('2020-11-21','YYYY-MM-DD')),
       amount number CHECK (amount >= 10000),
       client_type VARCHAR2(50) CHECK (client_type IN ('회사', '개인')),
       item VARCHAR2(100) CHECK (item IN ('컴퓨터', '노트북', '모니터'))
   );
   

 * */