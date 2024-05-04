import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[1000];

        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int idx = N;
        while(true) {
            int midx = 0;

            for(int i=0; i<idx; i++) {
                if(a[i]> a[midx])
                    midx = i;
            }
            System.out.println((midx+1) + " ");

            if(midx == 0) {
                break;
            }
            idx = midx;
        }

    }
}