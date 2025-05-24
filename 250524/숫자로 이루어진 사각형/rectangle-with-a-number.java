import java.util.Scanner;
public class Main {
    public static void printRect(int n){
        int num = 0;
        for(int i=0; i < n ; i++){
   
           
            for(int j = 0; j<n; j++){
            
            num ++;
            System.out.print(num + " ");
            if (num == 9){
                num = 0;
            }

            }
            System.out.println();
        }
    
       

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printRect(n);
    }
}