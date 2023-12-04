SELECT * FROM member01;
SELECT mno NO, name, id, pwd pass, auth, point
FROM member01
WHERE id = 'himan' AND pwd = '7777';
/*
주의 VO를 만들고 rs.getString("XXX") 설정 시는
sql의 결과를 기준으로 처리하여야 한다.

ex) 특히 rs.getString("no")
*/