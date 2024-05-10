import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int val = 0;

        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=0; j<n; j++) {
                val = sc.nextInt();
                sum+=val;
            }
            System.out.println(sum);
        }

    }
}