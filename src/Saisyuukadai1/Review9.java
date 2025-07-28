package Saisyuukadai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review9 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("名前を入力してください＞");
        String inputName = br.readLine();
        System.out.println("年齢を入力してください＞");
        int age = Integer.parseInt(br.readLine());
        System.out.println(age + "歳の" + inputName + "さん。" + "\nこんにちは。");
    }
}
