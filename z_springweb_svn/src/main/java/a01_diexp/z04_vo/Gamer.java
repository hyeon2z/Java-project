package a01_diexp.z04_vo;
// a01_diexp.z01_vo.Gamer
import java.util.Properties;
import java.util.Set;
// ex) 이 클래스를 이용해서, di15.xml에 구슬 종류를 할당하고,
//			종류와 갯수를 할당하여, 해당 객체를 
//          DIExp15.java에 호출하여 출력하세요
public class Gamer {
	// 구슬의 종류 할당.
	private Set<String> beadKinds;
	// 구슬의 종류와 가진 갯수
	private Properties beadsCnts;
	public Set<String> getBeadKinds() {
		return beadKinds;
	}
	public void setBeadKinds(Set<String> beadKinds) {
		this.beadKinds = beadKinds;
	}
	public Properties getBeadsCnts() {
		return beadsCnts;
	}
	// setBeadKinds(Set<String> beadKinds)
	// setBeadsCnts(Properties beadsCnts)
	public void setBeadsCnts(Properties beadsCnts) {
		this.beadsCnts = beadsCnts;
	}
	
	
}
