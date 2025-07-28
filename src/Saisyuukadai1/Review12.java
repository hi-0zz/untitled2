package Saisyuukadai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        if (age >= 0 && age <= 17) {
            System.out.println("未成年");
        } else if (age >= 18 && age <= 64) {
            System.out.println("成人");
        } else if (age >= 65) {
            System.out.println("高齢者");
        } else {
            System.out.println("無効な年齢です。");
        }
    }
}
