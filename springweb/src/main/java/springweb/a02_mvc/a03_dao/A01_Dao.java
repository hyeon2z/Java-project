package springweb.a02_mvc.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import springweb.z01_vo.Depart;
import springweb.z01_vo.Dept;
import springweb.z01_vo.Emp;
import springweb.z01_vo.Employee;
import springweb.z01_vo.Job;
import springweb.z01_vo.Location;
import springweb.z01_vo.Member;
// springweb.a02_mvc.a03_dao.A01_Dao
public interface A01_Dao {
	/*
	여기에 인터페이스를 통해서 추상메서드(입력/리턴)선언하면
	mybatis에서 선언된 프레임워크에 의해서 실제 객체를 만들어 준다.
			 인터페이스		Mapper.xml 연동 규칙
	1. 규칙1 : 인터페이스명	namespace명
	2. 규칙2 : 메서드		id명
	3. 규칙3 : 리턴값 type	resultType
	4. 규칙4 : 매개변수 type	parameterType
	5. 규칙5 :			필요로 하는 sql을 선언..
	
	*/
	public List<Emp> getEmpList(Emp sch);
	public int getCountEmp();
	public List<Dept> getDeptList(Dept sch);
	public int getCountDept();
	public Emp getEmp(int empno);
	public String getDname(int deptno);
	
	/*
	ex) 처리 메서드 선언, mapper.xml 선언, service단에서 부서의 건수 : @@
	select count(*) from dept
	
SELECT *
FROM locations

SELECT *
FROM EMP
WHERE job LIKE '%'||#{job}||'%'
AND ename LIKE '%'||#{ename}||'%'
매개변수의 이름을 지정하면 parameterType을 설정하지 않아도 된다.
	 */
	public List<Location> getLocations();
	public List<Job> getJobs();
	
	public List<Employee> getEmployee(@Param("job01") String job, 
									@Param("ename01") String ename);
	
	public List<Depart> getDepartInfo(@Param("name01") String dname,
									@Param("location01") String loc);
	
	public List<Member> getMember(@Param("id") String id,
								@Param("pwd") String pwd);
	public String getMemberName(String id);
	public List<Member> getMemberSch(String name);
	
	public int insertMember(Member insert);
}
