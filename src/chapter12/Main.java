package chapter12;

public class Main {
    public static void main(String[] args) {
        Character w = new Wizard();
        Matango m = new Matango();
        w.name = "アサカ";
        w.attack(m);
        Character[] chara = new Character[3];
        Character h = new Hero();
        h.name = "ミナト";
        Character t = new Thief();
        t.name = "タケシ";
        chara[0] = w;
        chara[1] = h;
        chara[2] = t;

        Hostelry host = new Hostelry();
        host.heeling(chara);

        //多態性を使ったメソッド
        Monster s = new Slime();
        Monster g = new Goblin();
        Hero h2 = new Hero();
        h2.name = "キリト";
        h2.attack(s);
        h2.attack(g);

        Monster[] mons = new Monster[2];
        mons[0] = s;
        mons[1] = g;
        System.out.println("モンスターの動き");
        for (Monster monster : mons) {
            monster.run();
        }
    }
}
