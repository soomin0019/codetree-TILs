import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000];

        for(int i=0; i< n; i++) {
            a[i] = sc.nextInt();
        }

        int idx = n;
        while(true) {
            int last = 0;
            for(int i=0; i<idx; i++) {
                if(a[i] > a[last])
                    last = i;
            }
            System.out.printf( (last + 1) + " ");

            if(last == 0)
                break;

            idx = last;
        }

    }
}