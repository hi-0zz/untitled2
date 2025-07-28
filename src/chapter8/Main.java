package chapter8;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        Matango m1 = new Matango();
        Matango m2 = new Matango();

        h.name = "キリト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出した！");

        m1.hp = 50;
        m1.suffix = 'A';

        m2.hp = 48;
        m2.suffix = 'B';

        h.slip();
        h.run();
        m2.run();
        h.run();
    }
}
