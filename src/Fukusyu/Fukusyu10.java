import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 2;
        while (num >= i) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("結果：" + sum);
    }
}
