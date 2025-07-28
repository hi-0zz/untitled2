package chapter11;

public abstract class Character implements Creature {
    String name;
    int hp;

    public Character() {
        this.name = "キリト";
    }
    public abstract void attack();

    public void run(){
        System.out.println(this.name + "は逃げ出した");
    }

    public void walk(){
        System.out.println("歩くよ");
    }
}
