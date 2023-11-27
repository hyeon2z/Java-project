package javaexp.z02_homework.a21_hcj.TextRpg;

public class Inventory {
	private String invenName[];
	private int invenCnt[];
	
	
	
	public String[] getInvenName() {
		return invenName;
	}

	public int[] getInvenCnt() {
		return invenCnt;
	}

	public Inventory(int cnt) {
		this.invenName = new String[cnt];
		this.invenCnt = new int[cnt];
		
	
//		for(int i = 0;i<cnt;i++ ) {
//			invenName[i] ="";
//		
//		}
	}
	public void newItem(String name,int cnt) {
		boolean issame = false;
		if(!(invenName[invenName.length-1] == null)) {
			System.out.println("인벤토리 저장공간이 부족합니다.");
		}else {
			for(int i = 0; i < invenName.length;i++) {
				if(invenName[i]==null)break;
				if(invenName[i].equals(name)) {
					issame = true;
					break;
				}
			}
			}
			for(int i = 0;i< invenName.length;i++) {
				if(invenName[i] == null&&issame == false) {
					invenName[i] = name;
					invenCnt[i] = cnt;
					break;
				}
				
			}
		}
	
	
	public void setItemcnt(String name,int cnt) {
		for(int i = 0;i< invenName.length;i++) {
			if(invenName[i].equals(name)) {
				invenCnt[i] = cnt;
				break;
			}
		}
	}
	
	public void desItem(String name) {
		for(int i = 0;i< invenName.length;i++) {
			if(invenName[i].equals(name)) {
				invenName[i] = null;
				invenCnt[i] = 0;
				break;
			}
		}
	}
}
	
	
	

