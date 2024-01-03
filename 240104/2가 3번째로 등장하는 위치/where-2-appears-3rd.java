import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[100];
        int num = 0;
        int cnt = 0;
        
        for(int i=0; i<n; i++) {
            N[i] = sc.nextInt();
        }
        for(int j=0; j<n;j++) {
            if(N[j]==2) cnt++;
            if(cnt == 3) {
                num = j+1;
                break;
            }
        }
        System.out.println(num);
    }
}