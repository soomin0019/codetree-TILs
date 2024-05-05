import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[1000];

        for(int i=0; i<n; i++) {
            N[i] = sc.nextInt();
        }

        int minbuy = 2^31-1;
        for(int i=0; i<n; i++) {
            if(N[i] < minbuy)
                minbuy = N[i];
        }

        int maxsell = 0;
        for(int i=minbuy; i<n; i++) {
            if(N[i] > maxsell) 
                maxsell = N[i];
        }

        System.out.println(maxsell - minbuy);

    }
}