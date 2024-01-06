import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] N = new int[100];

        for(int i=0; i<100; i++) {
            N[i] = sc.nextInt();
            if(N[i] == 999 || N[i] == -999) {
                break;
            }
        }

        int max = N[0];
        int min = N[0];

        for(int j=0; j<100; j++) {
            if(N[j] == 999 || N[j] == -999) {
                break;
            }
            if(max < N[j]) {
                max = N[j];
            }
            if(min > N[j]) {
                min = N[j];
            }
        }
        System.out.printf(max + " " + min);
    }
}