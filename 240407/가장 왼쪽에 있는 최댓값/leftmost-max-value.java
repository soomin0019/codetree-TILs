import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n;
        int[] a = new int[1000];

        n = sc.nextInt();

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int maxIndex = n;
        while(true) {
            int idx=0;

            for(int j=0; j<maxIndex; j++) {
                if(a[j] > a[idx]) {
                    idx = j;
                }

                System.out.println(idx + 1);
            }

            if(idx == 0) {
                break;
            }

            maxIndex = idx;
        }
    }
}