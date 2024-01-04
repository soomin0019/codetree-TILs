import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int max = 0;

        for(int i=0; i<10; i++) {
            N[i] = sc.nextInt();
            if(N[i] > max) {
                max = N[i];
            }
        }
        System.out.println(max);
    }
}