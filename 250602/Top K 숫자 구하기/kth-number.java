import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //이게 3
        int n = sc.nextInt();
        //이게 2
        int k = sc.nextInt();
        //크기가 3인 배열생성
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            // System.out.print(nums[i]+" ");
        }

        System.out.print(nums[k]+" ");

    }
}