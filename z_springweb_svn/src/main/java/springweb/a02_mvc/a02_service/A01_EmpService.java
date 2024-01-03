package springweb.a02_mvc.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A01_Dao;
import springweb.a02_mvc.a03_dao.A02_Dao;
import springweb.z01_vo.Depart;
import springweb.z01_vo.Emp;
import springweb.z01_vo.EmpDTO;
import springweb.z01_vo.Employee;
import springweb.z01_vo.Job;
import springweb.z01_vo.Location;

// 서비스(모델데이터를 만들고, 조건이나 반복문등
// 	알고리즘이 필요한 부분을 처리하는 부분)
@Service
public class A01_EmpService {
	// mybatis에서 만들 실제 객체 autowiring
	@Autowired
	private A01_Dao dao;
	
	@Autowired(required = false)
	private A02_Dao dao2;
	
	public List<Emp> getEmpList(Emp sch){
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		System.out.println("서비스단 호출(dao처리) 건수:"+
				dao.getEmpList(sch).size());
		
		System.out.println("사원정보의 갯수:"+dao.getCountEmp());
		
		System.out.println("부서정보의 갯수:"+dao.getCountDept());
		System.out.println("#사원 정보 확인#");
		Emp emp = dao.getEmp(7369);
		System.out.println("사원명:"+emp.getEname());
		System.out.println("직책명:"+emp.getJob());
		
		System.out.println("부서명 확인:"+dao.getDnameByDeptno(20));
		System.out.println("#위치 정보#");
		for(Location loc:dao.getLocations()) {
			System.out.print(loc.getCountry_id()+"\t");
			System.out.print(loc.getCity()+"\t");
			System.out.print(loc.getStreet_address()+"\n");
		}
		System.out.println("#지역 정보#");
		for(Job job:dao.getJobs()) {
			System.out.print(job.getJob_id()+"\t");
			System.out.print(job.getJob_title()+"\t");
			System.out.print(job.getMin_salary()+"\t");
			System.out.print(job.getMax_salary()+"\n");
		}
		System.out.println("#resultMap 활용 예제#");
		for(Employee empl:dao.getEmployee("A", "")) {
			System.out.print(empl.getNo()+"\t");
			System.out.print(empl.getName()+"\t");
			System.out.print(empl.getGrade()+"\t");
			System.out.print(empl.getSalary()+"\n");
		}
		System.out.println("#부서정보 resultMap#");
		for(Depart d:dao.getDepartInfo("", "")) {
			System.out.print(d.getNo()+"\t");
			System.out.print(d.getName()+"\t");
			System.out.print(d.getLocation()+"\n");
		}
		// int empno, String ename, String job, int mgr, 
		// String hiredateStr, double sal, double comm,
		// int deptno)

		System.out.println("등록한 데이터 건수:"+dao2.insertEmp(
				new EmpDTO(1002, "마길동", "인사", 7550, "2024-01-01", 
						4000, 100, 10)));
		
		return dao.getEmpList(sch);
	}

}
