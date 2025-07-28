package chapter10;

public class Hero {

    public Hero(){
        System.out.println("継承先（Hero）");
    }
    String name = "キリト";
    int hp = 100;
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた！");
    }
    public void run(){
        System.out.println(this.name + "逃げ出した！");
    }
}
