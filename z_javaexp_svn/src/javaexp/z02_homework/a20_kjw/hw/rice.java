package javaexp.z02_homework.a20_kjw.hw;

import javaexp.z02_homework.a20_kjw.Food;

public class rice extends Food {
    public rice() {
        super("rice");
    }

    @Override
    public void taste() {
        System.out.println("밥의 맛은 설익었습니다.");
    }
}
