import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 1;
        int factorial = 1;
        while (factorial <= num) {
            sum = sum * factorial;
            factorial++;
        }
        System.out.println("結果：" + sum);
    }
}
