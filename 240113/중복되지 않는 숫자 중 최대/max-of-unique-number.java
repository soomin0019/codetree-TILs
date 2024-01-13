import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[1000];
        int max = 1;
        int out = -1;

        for(int i=0; i<n;i++) {
            N[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                if((N[i] != N[j]) && (max < N[i])) {
                    max = N[i];
                }
            }
        }
        out = max;
        System.out.println(out);
    }
}