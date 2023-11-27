package javaexp.z02_homework.a20_kjw;

import javaexp.z02_homework.a20_kjw.hw.noodle;
import javaexp.z02_homework.a20_kjw.hw.rice;
import javaexp.z02_homework.a20_kjw.hw.fork;



public class Food_announce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food fork= new fork();
		Food rice= new rice();
		Food noodle= new noodle();
		noodle.taste();
		noodle.Eat();
		fork.taste();
		fork.Eat();
		rice.taste();
		rice.Eat();

	}

}
