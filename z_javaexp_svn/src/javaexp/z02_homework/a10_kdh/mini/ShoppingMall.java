package javaexp.z02_homework.a10_kdh.mini;

public class ShoppingMall {
	private int mIdx;
	private Member[] members;
	private Product[] buyProdu;
	private int pIdx;
	private Product[] prods;
	
	
	public ShoppingMall(Member[] members, Product[] prods) {
		this.members = members;
		this.prods = prods;
	}
	
	public void regMember(Member mem) {
		members[mIdx++] = mem;
	}
	
	public void regMember() {
		// Scanner
		Member m = new Member(2, "데이터","데이터");
		members[mIdx++] = m;
	}	
	
}
