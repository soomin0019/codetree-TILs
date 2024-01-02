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

        for(int k=0; k<a; k++){
            boolean success = true;

            for(int q=0; q<b; q++) {
                if(k+q>a){
                    success = false;
                    break;
                }
                if(A[k+q] != B[q]) {
                    success = false;
                    break;
                }
            } 
            if(success) {
            System.out.println("Yes");
            System.exit(0);
            }
        }

        System.out.println("No");
    }
}