package springweb.a02_mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import d01_dao.PreparedStmtDao;
import springweb.z01_vo.Dept;
import springweb.z01_vo.Emp;

@Controller
public class A03_MVC_EmpController {
	// 컨테이너에 있는 객체 자동할당 처리
	@Autowired(required = false) // 컨테이너에 객체가 없더라도 null에러방지
	private PreparedStmtDao dao;
	
	// http://localhost:7080/springweb/empList.do
	@RequestMapping("empList.do")
	public String empList(Emp sch, Model d) {
		// 요청값이 없을 때는 ""으로 처리
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		d.addAttribute("empList", dao.getEmpList(sch));
		
		return "WEB-INF\\views\\a03_mvc\\a01_empList.jsp";
	}
	
	@RequestMapping("deptList.do")
	public String deptList(Dept sch, Model d) {
		if(sch.getDname()==null) sch.setDname("");
		if(sch.getLoc()==null) sch.setLoc("");
		d.addAttribute("deptList", dao.getDeptList(sch));
		
		return "WEB-INF\\views\\a03_mvc\\a02_deptList.jsp";
	}
}