import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userId;
        userId = scan.next();
        
        if(userId.length() > 50)
            System.out.println("ERROR");
        
        System.out.println(userId + "??!");
    }
}