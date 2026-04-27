import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n1 = scan.nextInt();
        long n2 = scan.nextInt();
        
        long result = (n1 + n2) * (n1 - n2);
        System.out.println(result);
    }
}