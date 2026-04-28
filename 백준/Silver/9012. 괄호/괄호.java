import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int line = scan.nextInt();
        scan.nextLine();

        String[] vps = new String[line];
        String[] result = new String[line];

        for(int i = 0; i < vps.length; i++) {
            vps[i] = scan.nextLine();
        }

        result = operator9152(vps);
        for(int i = 0; i < vps.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static String[] operator9152(String[] vps) {
        String[] result = new String[vps.length];

        for(int i = 0; i < result.length; i++) {
            if(isVps(vps[i])) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        return result;
    }
    public static boolean isVps(String str) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if(element == '(') {
                ++count;
            } else {
                --count;
                // 실패 요소: ) 의 개수가 0 보다 작아질 경우 ex: ( ) )
                if(count < 0) return false;
            }
        }
        // 실패 요소: ( ) 이 딱 맞아떨어지지 않을 경우
        return count == 0;
    }
}
