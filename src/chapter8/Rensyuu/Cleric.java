package chapter8.Rensyuu;

public class Cleric {
    String name;
    int HP = 50;
    int hp;
    int MP = 10;
    int mp;

    public void selfAid(){
        this.mp -= 5;
        this.hp = HP;
        System.out.println(this.name + "は、セルフエイドを使った");
        System.out.println("MPは" + this.mp + "になり、" + "HPは" + this.hp + "回復した");
    }
}
