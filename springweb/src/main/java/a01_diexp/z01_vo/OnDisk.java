package a01_diexp.z01_vo;

import java.util.List;

public class OnDisk {
	private String name;
	private List<Member> mlist;
	public OnDisk() {
		// TODO Auto-generated constructor stub
	}
	public void showMem() {
		if(mlist!=null&&mlist.size()>0) {
			System.out.println(name+"의 회원목록");
			for(Member m:mlist) {
				System.out.println(m.getName());
				System.out.println(m.getId());
				System.out.println(m.getPoint());
			}
		}else {
			System.out.println(name+"에 회원이 없습니다.");
		}
	}
	public OnDisk(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Member> getMlist() {
		return mlist;
	}
	public void setMlist(List<Member> mlist) {
		this.mlist = mlist;
	}	
}
