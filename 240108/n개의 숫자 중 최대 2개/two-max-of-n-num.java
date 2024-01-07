import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];

        // 원소 입력
        for(int i=0; i<n; i++) {
            N[i] = sc.nextInt();
        }

        int fMax = 0;
        int indexFMax=0;
        int sMax = 0;
        for(int i=0; i<n; i++) {
            if(N[i] > fMax) {
                fMax = N[i];
                indexFMax = i;
            }
        }
        for(int i=0; i<n; i++) {
            if(N[i] == N[indexFMax]) continue;
            if(N[i] > sMax) {
                sMax = N[i];
            }
        }

        System.out.print(fMax + " " + sMax);
    }
}