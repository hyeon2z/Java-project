package javaexp.z02_homework.a02_oys.z03_miniProgram;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String id;
	private String pass;
	private String name;
	private List<Movie> movies;
	
	public User(String id, String pass, String name) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.movies = new ArrayList<Movie>();
	}
	
	public void reservationMovie(Movie movie) {
		this.movies.add(movie);
	}
	
	// 예매 확인
	public void checkMovie() {
		System.out.println("\n------------------------\n");
		for (int i = 0; i < movies.size(); i++) {
			movies.get(i).getMoiveDetailUser();
		}
	}

}
