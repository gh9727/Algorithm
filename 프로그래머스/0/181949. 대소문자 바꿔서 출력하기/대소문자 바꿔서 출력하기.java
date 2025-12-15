import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] chArr = a.toCharArray();
        a = "";
        
        for(char ch : chArr) {
            if(Character.isUpperCase(ch)) {
                a += String.valueOf(ch).toLowerCase();
            } else {
                a += String.valueOf(ch).toUpperCase();
            }
        }
        System.out.print(a);
        sc.close();
    }
}