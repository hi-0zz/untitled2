package Saisyuukadai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("結果：" + sum);
    }
}
