import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine());

        System.out.println(operator27294(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
    
        public static int operator27294(int time, int n) {
        if(time < 12 || time > 16) {
            return 280;
        }
        else {
            if(n == 0) return 320;
            else return 280;
        }
    }
}
