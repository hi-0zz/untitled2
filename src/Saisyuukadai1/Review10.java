import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num >= 0) {
            System.out.println("この数は正の数です。");
        } else
            System.out.println("この数は正の数ではありません。");
    }
}
