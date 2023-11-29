package backendweb.z01_vo;
// backendweb.z01_vo.BSPlayer

public class BSPlayer {
	private String player;
    private double batCnt;
    private double antaCnt;
	public BSPlayer() {
		// TODO Auto-generated constructor stub
	}
	public BSPlayer(String player, double batCnt, double antaCnt) {
		this.player = player;
		this.batCnt = batCnt;
		this.antaCnt = antaCnt;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public double getBatCnt() {
		return batCnt;
	}
	public void setBatCnt(double batCnt) {
		this.batCnt = batCnt;
	}
	public double getAntaCnt() {
		return antaCnt;
	}
	public void setAntaCnt(double antaCnt) {
		this.antaCnt = antaCnt;
	}
	public double getHitRatio() {
		return antaCnt/batCnt; // batCnt==0?0:antaCnt/batCnt; 분모0일때의 삼항연산자
	}
}
