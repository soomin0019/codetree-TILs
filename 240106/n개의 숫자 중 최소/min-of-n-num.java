import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        int min = 100000;
        int cnt = 0;

        for(int i=0; i<n; i++) {
            N[i] = sc.nextInt();
            if(min > N[i]) {
                min = N[i];
            }
        }
        for(int j=0; j<n; j++) {
            if(min == N[j]) {
                cnt++;
            }
        }
        System.out.printf(min + " " + cnt);
    }
}