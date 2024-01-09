import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        
        int index = n;
        int out = 0;

        for(int i=0; i<n; i++) {
            N[i] = sc.nextInt();
        }

        while(true) {
            int Max = 0;

            for(int i=0; i<index; i++) {
                if(N[Max] < N[i]) {
                    Max = i;
                }
            }
            System.out.printf((Max+1) + " ");

            if(Max == 0) {
                break;
            }
            index = Max;
        }
    }
}