import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] A = new int[100];
        int[] B = new int[100];

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<a; i++) {
            A[i] = sc.nextInt();
        }
        for(int j=0; j<b; j++) {
            B[j] = sc.nextInt();
        }

        for(int p=0; p<a;p++) {
            boolean r = true;

            for(int q=0; q<b; q++) {
                if(p+q >= a) {
                    r = false;
                    break;
                }
                if(A[p+q] != B[q]) {
                    r = false;
                    break;
                }
            }
            if(r) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}