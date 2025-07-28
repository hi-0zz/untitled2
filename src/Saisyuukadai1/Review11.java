package Saisyuukadai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num % 10 != 0) {
            System.out.println("この数は10で割り切れない値です。");
        } else
            System.out.println("この数は10で割り切れる値です。");
    }
}
