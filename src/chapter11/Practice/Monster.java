package chapter11.Practice;

public abstract class Monster {
    String name;
    int hp = 10;
    int mp = 10;
    public Monster() {
        this.name = "スライム";
    }
    public void jump() {
        System.out.println(this.name + "は、飛び上がった");
    }

    public abstract void attack();

    public abstract void run();
}
