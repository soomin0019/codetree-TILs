import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] A = new int[100];
        int[] B = new int[100];
        int cnt = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<a; i++) {
            A[i] = sc.nextInt();
        }
        for(int j=0; j<b; j++) {
            B[j] = sc.nextInt();            
        }
        for(int k=0; k<a; k++){
            for(int q=0; q<b; q++) {
                if(A[k+q] == B[q])
                cnt++;
            } 
        }

        if(cnt >= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }   
    }
}