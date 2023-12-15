package javaexp.z02_homework.a11_mhi;

public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요

		// -사용자 정의 예외 클래스 생성
		// try-catch 블록을 사용하여 예외 처리 할 수 있다.
		// 이때 catch 블록에서 사용자 정의 예외 클래스를 잡아서 처리한다.

		// -main()에서 호출 규칙
		// 예외 클래스를 생성하려면 `Exception`클래스를 상속받아야 한다. 원하는 예외 클래스 이름과,
		// 메시지 이름을 지정할 수 있다.

//		2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
		// 예외 객체를 생성하고 예외에 대한 설명 또는 메시지를 설정하고 이를 반환하는데 사용된다.
		// 사용자 정의 예외 클래스의 생성자는 예외 객체를 생성할때 호출된다.
		// 생성자는 예외 객체를 초기화하고 예외 객체가 포함할 메시지나 다른 정보를 설정할 수 있다.
		// 예외 클래스는 'Exception' 클래스를 상속받아야 하며, 생성자는 부모 클래스
		// 'Exception'의 생성자를 호출하여 메시지를 설정한다.

		// getMessage() 메서드는 Throwable 클래스로부터 상속받은 메서드로,
		// 예외 객체에 설정된 메세지를 반환한다.

//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.

		try {
			// 사용자 정의 예외 발생
			throw new User02Exception("사용자 정의 예외 발생", 404);
		} catch (User02Exception e) {
			// 예외 처리
			System.out.println("예외 메시지: " + e.getMessage());
			System.out.println("오류 코드: " + e.getErrorNum());
		}

// 5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
		byte[] pw = new byte[5];
		for (int i = 0; i < 5; i++) {
			pw[i] = (byte) ((Math.random() * 25) + 97);
		}
		String fpw = new String(pw);
		System.out.println(fpw);
		
	}
}

class User02Exception extends Exception {
	private int errorNum;

	public User02Exception(String message, int errorNum) {
		super(message);
		this.errorNum = errorNum;
		// TODO Auto-generated constructor stub
	}

	public int getErrorNum() { // 추가메서드 - 오류코드 반환
		return errorNum;
	}

	public void setErrorNum(int errorNum) {
		this.errorNum = errorNum;
	}

	@Override
	public String getMessage() {// 메시지를 재정의하여 오류 코드를 포함한 문자열을 반환
		// TODO Auto-generated method stub
		return super.getMessage() + errorNum;
	}
}

// [1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
// "안녕"은 문자열 리터럴이며, 문자열 풀에 저장된다.
// 동일한 문자열 리터럴을 사용하는 경우, 같은 문자열 객체를 참조하게 된다.
// 이미 문자열 풀에 존재하는 지 확인 하고 존재하지 않는 경우에만 새로운 문자열 객체 생성함.

// new String("안녕")은 새로운 문자열 객체를 생성하는 방법이다.
// 새로운 문자열 객체가 힙(heap) 메모리에 할당된다.


//6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
 // Object 클래스
// toString() : 객체를 문자열로 표현하는데 사용됨.




//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.

//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?



// 강사님 답안


//[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
//[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
//[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
//[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
//[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
//[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
//[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
//[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
//[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//		for문을 2중으로 사용 처리..
//		      홍길동 70	80 
//		      김길동 90	85 
//		      신길동 95	75 
/*
**[1단계:개념] 1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙**

사용자 정의 예외 클래스는 `Exception` 또는 `RuntimeException` 클래스를 상속받아 만듭니다. `main()`에서 이러한 사용자 정의 예외를 발생시키려면 `throw` 키워드를 사용하며, 예외를 처리하려면 `try-catch` 블록을 사용해야 합니다.

**[1단계:개념] 2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계**

사용자 정의 예외 클래스에서 생성자에 전달된 문자열은 예외 메시지로 저장됩니다. 이 메시지는 나중에 `getMessage()` 메서드를 통해 가져올 수 있습니다.

**[1단계:확인] 3. 사용자 정의 예외 클래스 정의 및 호출**
```java
class CustomException extends Exception {
private int errorCode;

public CustomException(String message, int errorCode) {
super(message);
this.errorCode = errorCode;
}

public int getErrorCode() {
return errorCode;
}

@Override
public String toString() {
return super.toString() + ", ErrorCode: " + errorCode;
}
}

public class Main {
public static void main(String[] args) {
try {
    throw new CustomException("Custom Error Occurred", 404);
} catch (CustomException e) {
    System.out.println(e.getMessage());  // Custom Error Occurred
    System.out.println(e.getErrorCode());  // 404
    System.out.println(e);  // CustomException: Custom Error Occurred, ErrorCode: 404
}
}
}
```

**[1단계:개념] 4. "안녕"과 new String("안녕")의 heap메모리상의 차이점**

"안녕"은 스트링 리터럴로, 스트링 풀(String pool)에 저장됩니다. `new String("안녕")`은 새로운 `String` 객체를 힙 메모리에 생성합니다. 따라서, 두 객체는 서로 다른 메모리 위치에 있습니다.

**[1단계:확인] 5. new String(byte[]) 이용**
```java
import java.util.Random;

public class PasswordGenerator {
public static void main(String[] args) {
Random random = new Random();
byte[] passwordBytes = new byte[8];
for (int i = 0; i < 8; i++) {
    passwordBytes[i] = (byte) (random.nextInt(26) + 'a');
}
String password = new String(passwordBytes);
System.out.println(password);  // 영문 소문자로 구성된 임의의 비밀번호
}
}
```

**[1단계:개념] 6. 자바의 최상위 클래스**

자바의 최상위 클래스는 `Object` 클래스입니다. `toString()` 메서드는 객체의 문자열 표현을 반환하는데 사용됩니다. 기본적으로 `클래스명@해시코드` 형태의 문자열을 반환하지만, 사용자 정의 클래스에서 `toString()`을 재정의하면 원하는 형태로 문자열 표현을 반환할 수 있습니다.

**[1단계:확인] 7. String civil 처리**
```java
public class CivilIdParser {
public static void main(String[] args) {
String civil = "021214-2801512";
String year = "19" + civil.substring(0, 2);
String month = civil.substring(2, 4);
String day = civil.substring(4, 6);
char gender = civil.charAt(7);
String genderStr = (gender == '1' || gender == '3') ? "남" : "여";
System.out.println(year + "년 " + month + "월 " + day + "일생 " + genderStr);
}
}
```

**[1단계:확인] 8. String cartList와 Scanner 처리** - 이 부분은 더 명확한 지시가 필요합니다. 장바구니에 어떤 물건들이 있고, Scanner를 어떻게 사용할 것인지에 대한 정보가 필요합니다.

**[1단계:확인] 9. 문자열 데이터 처리**
```java
public class DataParser {
public static void main(String[] args) {
String data = "홍길동&70&80-김길동&90&85-신길동&95&75";
String[] persons = data.split("-");
for (String person : persons) {
    String[] details = person.split("&");
    System.out.println(details[0] + " " + details[1] + "\t" + details[2]);
}
}
}
```

**[1단계:개념] 10. StringBuffer와 String의 차이점**

`String`은 불변(immutable)이기 때문에 내용을 변경할 때마다 새로운 객체를 생성합니다. `StringBuffer`는 가변(mutable)하므로 내용을 변경할 때 객체를 재생성하지 않습니다. 이로 인해 문자열 조작 작업이 많을 경우 `StringBuffer`를 사용하는 것이 효율적입니다.

예제:
```java
public class StringVsStringBuffer {
public static void main(String[] args) {
String str = "Hello";
str += " World";  // 새로운 String 객체 생성

StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");  // 동일한 StringBuffer 객체 내에서 변경
}
}
```

이러한 차이점 때문에 문자열 조작 작업이 많은 경우 `StringBuffer` 또는 `StringBuilder`(동기화되지 않음)를 사용하는 것이 메모리와 성능 측면에서 더 효율적입니다.
* */



//}

//}
