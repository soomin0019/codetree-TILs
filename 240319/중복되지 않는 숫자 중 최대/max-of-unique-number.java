import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 1000;
        int n = sc.nextInt();
        int[] nums = new int[N];
        
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int max = -1;
        for(int j=0; j<n; j++) {
            int currNum = nums[j];
            if(max < currNum) {
                int count = 0;
                for(int k=0; k<n; k++) {
                    if(nums[k] == currNum) {
                        count++;
                    }
                }
                if(count == 1) {
                    max = currNum;
                }
            }
        }
        System.out.print(max);
    }
}