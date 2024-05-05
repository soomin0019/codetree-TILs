import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for(int i=0; i<10; i++) {
            a[i] = sc.nextInt();
        }

        int minner=1000;
        int maxxer=0;
        for(int i=0; i<10; i++) {
            if(a[i] > maxxer && a[i] < 500){
                maxxer = a[i];
            }
            if( a[i] < minner && a[i] > 500) {
                minner = a[i];
            }
        }
        System.out.printf((maxxer) + " " + (minner));
    }
}