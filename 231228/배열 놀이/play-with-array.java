import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[100];
        int[] arr2 = new int[100];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int j=0; j<q; j++) {
            int x = sc.nextInt();
            if(x == 1) {
                int k = sc.nextInt();
                System.out.println(arr[k-1]);
            } else if(x == 2) {
                int k = sc.nextInt();
                int index = 0;
                for(int l = 0; l<n; l++) {
                    if(k == arr[l]) {
                        index = l+1;
                        break;
                    }
                }
                System.out.println(index);
            } else if(x == 3) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int k=a-1; k<b; k++) {
                    System.out.printf(arr[k] + " " );  
                }
                System.out.println();
            }
        }
    }
}