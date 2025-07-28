import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 1;
        while (num >= i) {
            sum += i;
            i = i + 1;
        }
        System.out.println("結果：" + sum);
    }
}
