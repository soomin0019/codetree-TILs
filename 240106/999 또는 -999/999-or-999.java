import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] N = new int[100];
        int max = -998;
        int min = 998;


        for(int i=0; i<100; i++) {
            N[i] = sc.nextInt();
            if(N[i] == 999 || N[i] == -999) {
                break;
            }
            if(max < N[i]) {
                max = N[i];
            }
            else if(min > N[i]) {
                min = N[i];
            }
        }
        System.out.printf(max + " " + min);
    }
}