package chapter11.Practice;

public class Slime extends Monster {
    public Slime(){
        super();
    }
    public void attack(){
        System.out.println(this.name + "はたいあたりをした");
    }
    public void run(){
        System.out.println(this.name + "はプルプル逃げ出した");
    }
}
