<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
[1단계:개념] 1. iframe의 주요속성을 기본 예제를 통해서 기술하세요.
[1단계:확인] 2. z01_top.html(최상위), z02_left.html(왼쪽메뉴), z03_main.html(오른쪽메인메뉴) 파일을 만들고,
              z01_top.html에 계층형 프레임구조를 만들어, 왼쪽메뉴 리스트를 클릭시, 오른쪽 메인메뉴들이 출력되게 하세요
[1단계:확인] 3. a href의 target의 의미를 예제를 통하여 기술하세요.
[1단계:개념] 4. 요청값전달방식(2단계)의 페이지?key=val의 의미를 기술하고, 이것을 처리하는 패턴 3가지를 기술하세요.
[1단계:확인] 5. 물건명:[   ], 가격:[   ], 갯수:[   ] [구매] 폼 페이지(z04_buyForm.html) 만들어, 구매를 클릭시,
              z05_buyProductInfo.jsp에서 입력한 구매 정보가 출력되게 하세요.

### 1. iframe의 주요 속성 기술

`<iframe>` 태그는 HTML 문서 내에 또 다른 HTML 문서를 내장하기 위해 사용됩니다. 주요 속성들은 다음과 같습니다:

- `src`: 내장하려는 페이지의 URL을 지정합니다.
- `height`: iframe의 높이를 지정합니다.
- `width`: iframe의 너비를 지정합니다.
- `name`: iframe에 이름을 지정하여, `<a>` 태그의 `target` 속성과 함께 사용하여 링크를 iframe에 표시하도록 할 수 있습니다.
- `frameborder`: iframe의 테두리의 표시 여부를 지정합니다 (값은 "1" 또는 "0").

**기본 예제:**

```html
<iframe src="example.html" name="exampleframe" width="300" height="200" frameborder="0"></iframe>
```

### 2. 계층형 프레임 구조 만들기

`frameset` 태그를 사용해 계층형 프레임 구조를 만들 수 있습니다. 하지만 현대 웹에서는 `frameset`과 `frame`이 사용되지 않으며 HTML5에서는 지원하지 않습니다. 대신, `iframe`이나 서버 측에서 페이지를 합치는 기술을 사용합니다. 그럼에도 불구하고 여기서는 예제를 위해 설명드리겠습니다.

**z01_top.html:**

```html
<html>
<head>
<title>Top Frame</title>
</head>
<frameset cols="30%,*">
  <frame src="z02_left.html" name="leftmenu">
  <frame src="z03_main.html" name="mainmenu">
</frameset>
</html>
```

**z02_left.html:**

```html
<html>
<body>
<ul>
  <li><a href="content1.html" target="mainmenu">Content 1</a></li>
  <li><a href="content2.html" target="mainmenu">Content 2</a></li>
</ul>
</body>
</html>
```

이 구조에서 왼쪽 메뉴의 링크를 클릭하면 `target="mainmenu"` 속성 때문에 오른쪽 메인 메뉴에서 링크된 페이지가 표시됩니다.

### 3. a href의 target의 의미

`<a>` 태그의 `target` 속성은 링크된 URL이 어디에 표시될지 지정합니다. 값은 다음과 같습니다:

- `_blank`: 새 창이나 탭에서 링크를 엽니다.
- `_self`: 링크를 현재 창이나 프레임에서 엽니다 (기본값).
- `_parent`: 링크를 현재 프레임의 부모 프레임에서 엽니다.
- `_top`: 링크를 전체 창에서 엽니다.
- 프레임의 `name`: 링크를 특정 이름을 가진 프레임에 엽니다.

**예제:**

```html
<a href="https://www.example.com" target="_blank">Visit Example.com</a>
```

### 4. 요청 값 전달 방식과 처리 패턴

`페이지?key=val`은 쿼리 문자열을 사용하여 페이지에 데이터를 전달하는 방식입니다. 여기서 `key`는 변수 이름이고, `val`은 해당 변수에 전달할 값입니다.

**처리 패턴:**

1. **GET 방식:** URL에 쿼리 문자열을 포함시켜 서버로 데이터를 전송합니다. HTML에서 기본적으로 폼 데이터를 전송할 때 사용됩니다.

```html
<form action="process.php" method="get">
  Name: <input type="text" name="username">
  <input type="submit">
</form>
```

2. **POST 방식:** 데이터를 HTTP 메시지의 본문(body)에 담아서 전송합니다. URL에 데이터가 노출되지 않으며, 더 많은 데이터를 안전하게 전송할 수 있습니다.

```html
<form action="process.php" method="post">
  Name: <input type="text" name="username">
  <input type="submit">
</form>
```

3. **AJAX:** 비동기적으로 서버에 데이터를 요청하고 받아올 수 있는 기술입니다. JavaScript를 사용하여 페이지 전체를 새로고침하지 않고도 서버로부터 데이터를 가져오고 웹 페이지 일부분만을 갱신할 수 있습니다.

```javascript
fetch('process.php?key=value')
  .then(response => response.json())
  .then(data => console.log(data));
```

### 5. 구매 폼 페이지와 처리 페이지 만들기

**z04_buyForm.html:**

```html
<html>
<body>
<form action="z05_buyProductInfo.jsp" method="post">
  물건명: <input type="text" name="productName" />
  가격: <input type="text" name="price" />
  갯수: <input type="number" name="quantity" />
  <input type="submit" value="구매" />
</form>
</body>
</html>
```

**z05_buyProductInfo.jsp:**

JSP 페이지는 Java 코드를 포함하여 서버 측에서 HTML을 생성할 수 있습니다. 여기에는 사용자가 입력한 정보를 받아서 표시하는 간단한 코드가 필요합니다.

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<%
String productName = request.getParameter("productName");
String price = request.getParameter("price");
int quantity = Integer.parseInt(request.getParameter("quantity"));
%>
물건명: <%= productName %><br>
가격: <%= price %><br>
갯수: <%= quantity %><br>
</body>
</html>
```

이 코드는 사용자가 입력한 물건명, 가격, 갯수를 서버에서 가져와서 웹 페이지에 출력합니다. `getParameter` 메소드를 사용하여 폼을 통해 전송된 데이터를 받아옵니다.

 --%>
</body>
</html>