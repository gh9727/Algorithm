import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] A = new int[100];  
        int[] B = new int[100]; 
        
        for(int i = 0; i < n; i++) {
            B[i] = scan.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++) {
            A[i] = B[i] * (i + 1) - sum;
            sum += A[i];
        }
           
        for(int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}