import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arriveTime = new int[n];
        int[] breadTime = new int[n];

        for(int i = 0; i < n; i++) {
            arriveTime[i] = scan.nextInt();
            breadTime[i] = scan.nextInt();
        }

        System.out.println(operator25377(arriveTime, breadTime));        
    }
    public static int operator25377(int[] arriveTime, int[] breadTime) {
        int minBreadTime = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < arriveTime.length; i++) {
            // 내가 도착하는 시간(A) <= 빵이 나오는 시간(B) 여야 살 수 있음
            if (arriveTime[i] <= breadTime[i]) {
                // 그 중 가장 빨리 살 수 있는 시간(B)을 갱신
                minBreadTime = Math.min(minBreadTime, breadTime[i]);
                found = true;
            }
        }
        // 살 수 있는 경우가 없었다면 -1, 있다면 최솟값 반환
        return found ? minBreadTime : -1;
    }    

}