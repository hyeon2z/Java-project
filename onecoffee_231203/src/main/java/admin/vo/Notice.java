package admin.vo;

import java.sql.Date;

public class Notice {

		int no; //순번
		String title;	//제목
		String content;	//내용
		Date adddate;	//작성날짜
		
		public Notice() {}

		public Notice(int no, String title, String content, Date adddate) {
			super();
			this.no = no;
			this.title = title;
			this.content = content;
			this.adddate = adddate;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Date getAdddate() {
			return adddate;
		}

		public void setAdddate(Date adddate) {
			this.adddate = adddate;
		}

	
		
		
}