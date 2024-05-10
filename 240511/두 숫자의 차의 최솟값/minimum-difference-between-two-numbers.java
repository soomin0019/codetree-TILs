import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[10];

        for(int i=0; i<n; i++) {
            N[i] = sc.nextInt();
        }

        int min = 100;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                int Q = N[i] - N[j];
                if(i!=j && Q < min && Q>0) {
                    min = Q;
                }

            }
        }
        System.out.println(min);
    }
}