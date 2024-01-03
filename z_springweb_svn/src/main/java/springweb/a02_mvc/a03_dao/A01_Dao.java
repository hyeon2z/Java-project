package springweb.a02_mvc.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import springweb.z01_vo.Depart;
import springweb.z01_vo.Emp;
import springweb.z01_vo.Employee;
import springweb.z01_vo.Job;
import springweb.z01_vo.Location;
//	springweb.a02_mvc.a03_dao.A01_Dao
public interface A01_Dao {
	// 여기에 인터페이스를 통해서 추상메서드(입력/리턴)선언하면
	// mybatis에서 선언된 프레임워크에 의해서 실제 객체를 만들어 준다.
	// 			인터페이스         Mappper.xml 연동 규칙
	// 1. 규칙1 : 인터페이스명       namespace명
	// 2. 규칙2 : 메서드명          id
	// 3. 규칙3 : 리턴값 type		 resultType
	// 4. 규칙4 : 매개변수 type     parameterType
	// 5. 규칙5 :                 필요로하는 sql을 선언..
	
	public List<Emp> getEmpList(Emp sch);
	public int getCountEmp();
	public int getCountDept();
	
	
	public Emp getEmp(int empno);
	public String getDnameByDeptno(int deptno);
	/*
	ex) 처리 메서드 선언, mapper.xml 선언, service단에서 부서의 건수:@@
int getCountDept();
	
	 * */
	/*
SELECT *
FROM LOCATIONS
	 * */
	public List<Location> getLocations();
	
	public List<Job> getJobs();
/*
SELECT *
FROM emp
WHERE job LIKE '%'||#{job01}||'%'
AND ename LIKE '%'||#{ename01}||'%'
들어가 매개변수의 이름을 지정하면 parameterType을 설정하지 않아도 된다.
 * */	
	public List<Employee> getEmployee(@Param("job01")String job, 
									  @Param("ename01") String ename);
/*
getDepartInfo
SELECT *
FROM dept
WHERE dname LIKE '%'||#{dname}||'%'
AND loc LIKE '%'||#{loc}||'%'
 * */	
	public List<Depart> getDepartInfo(@Param("dname") String dname,
									  @Param("loc") String loc);
	
	
}
