package javaexp.z02_homework.a00_yhs.vo;

public class GameCharacter {
    private String name;
    private int level;
    private int hp;

    public GameCharacter(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 100;
    }

    public void levelUp() {
        level++;
        hp += 50;
    }
    // 체력을 100까지....
    public void heal() {
        hp += 100;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Level: " + level + ", HP: " + hp);
    }
}
