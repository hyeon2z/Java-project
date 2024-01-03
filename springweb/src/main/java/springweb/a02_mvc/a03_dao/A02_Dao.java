package springweb.a02_mvc.a03_dao;

import springweb.z01_vo.Dept;
import springweb.z01_vo.EmpDTO;

public interface A02_Dao {
	/*
	1. Mapper를 통한 등록
	 */
	public int insertEmp(EmpDTO insert);
	
	public int insertDept(Dept insert);
	// dept01 입력 처리.. insertDept(Dept insert);
	/*
	2. 인터페이스에서 annotation을 이용하여 sql 처리
	
	 */
}
