package chapter11;

public class Hero extends Character {
    public Hero() {
        super();
    }
    public void greeting(){
        System.out.println("こんにちは");
    }
    public void attack(){
        System.out.println(this.name + "は、攻撃した");
    }
}
