import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //개수입력
        Integer[] arr = new Integer[n];
        
        //배열에 숫자입력
        for (int i = 0; i < n; i++) {
           
            arr[i] = sc.nextInt();
           
        }

        Arrays.sort(arr);
        for (int i = 0; i< n ; i ++){
            System.out.print(arr[i]+ " ");
        }
     
        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());
         for (int i = 0; i< n ; i ++){
            System.out.print(arr[i]+ " ");
        }
     
    }
}