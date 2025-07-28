package chapter12;

public class Hostelry {
    //回復メソッド
    public void heeling(Character[] chara){
        for(int i=0; i<chara.length; i++){
            chara[i].hp += 100;
            System.out.println(chara[i].name + "は宿屋でHPを回復させた！");
        }
        System.out.println("多態性を使ったfor文");
        //Character型の値がchara[]に存在する間のループ
        for( Character c : chara){
            c.hp += 100;
            System.out.println(c.name + "は宿屋でHPを回復させた！");
        }
    }
}
