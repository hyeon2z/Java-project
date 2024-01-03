package springweb.a02_mvc.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A01_Dao;
import springweb.a02_mvc.a03_dao.A02_Dao;
import springweb.z01_vo.Dept;
import springweb.z01_vo.Emp;
import springweb.z01_vo.Member;

// 서비스(모델데이터를 만들고, 조건이나 반복문등 
// 알고리즘이 필요한 부분을 처리하는 부분
@Service
public class A01_EmpService {
    // mybatis에서 만들 실제 객체 autowiring
	@Autowired
	private A01_Dao dao;
	
	@Autowired
	private A02_Dao dao2;
	
	public List<Emp> getEmpList(Emp sch) {
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		
		System.out.println("서비스단 호출(dao처리) :" +
				dao.getEmpList(sch).size() );
		System.out.println("사원정보의 갯수:"+dao.getCountEmp());
//		
//		System.out.println("부서정보 : " + dao.getCountDept());
//		
//		System.out.println("부서이름 : " + dao.getDname(10));
//		System.out.println("사원정보 확인 : " + dao.getEmp(7369));
//		Emp emp = dao.getEmp(7369);
//		System.out.println("사원명 : " + emp.getEname());
//		System.out.println("직책명 : " + emp.getJob());
//		
//		for(Location loc:dao.getLocations()) {
//			System.out.print(loc.getCountry_id()+"\t");
//			System.out.print(loc.getCity()+"\t");
//			System.out.print(loc.getStreet_address()+"\n");
//		}
//		
//		for(Job job:dao.getJobs()) {
//			System.out.print(job.getJob_id()+"\t");
//			System.out.print(job.getJob_title()+"\t");
//			System.out.print(job.getMin_salary()+"\t");
//			System.out.print(job.getMax_salary()+"\n");
//		}
//		System.out.println("#resultMap 활용 예제#");
//		for(Employee emp1:dao.getEmployee("A", "")) {
//			System.out.print(emp1.getNo()+"\t");
//			System.out.print(emp1.getName()+"\t");
//			System.out.print(emp1.getGrade()+"\t");
//			System.out.print(emp1.getSalary()+"\n");
//		}
//		for(Depart dept1:dao.getDepartInfo("", "N")) {
//			System.out.print(dept1.getNo()+"\t");
//			System.out.print(dept1.getName()+"\t");
//			System.out.print(dept1.getLocation()+"\n");
//		}
//		System.out.println("등록한 데이터 건수 : " + dao2.insertEmp(
//				new EmpDTO(1002, "마길동", "인사", 7550, "2024-01-01", 4000, 100, 10)
//				));
//		System.out.println("등록 데이터 건수 : " + dao2.insertDept(
//				new Dept(55, "재정", "부산")
//				));
		System.out.println("등록 데이터 건수 : " + dao.insertMember(
				new Member(6, "마길동", "gildonm", "1234", "일반", 0)
				));
		if(dao.getMember("himan", "7777")!=null){
			System.out.println("로그인성공");
		}
		System.out.println("회원의 이름 : " + dao.getMemberName("himan"));
		for(Member mem:dao.getMemberSch("홍길동")) {
			System.out.print(mem.getName()+"\t");
			System.out.print(mem.getId()+"\t");
			System.out.print(mem.getPwd()+"\t");
			System.out.print(mem.getAuth()+"\t");
			System.out.print(mem.getPoint()+"\n");
		}
		return dao.getEmpList(sch);
		
	}
	public List<Dept> getDeptList(Dept sch){
		if(sch.getDname()==null) sch.setDname("");
		if(sch.getLoc()==null) sch.setLoc("");
		return dao.getDeptList(sch);
	}
}
