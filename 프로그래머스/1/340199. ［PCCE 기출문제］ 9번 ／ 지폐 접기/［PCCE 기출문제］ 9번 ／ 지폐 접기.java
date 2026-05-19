import java.util.Arrays;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet); // wallet[1]이 max
        Arrays.sort(bill);   // bill[1]이 max
        
        while(wallet[0] < bill[0] || wallet[1] < bill[1]) {          
            bill[1] = bill[1] / 2;
            answer++;
            
            if(bill[0] > bill[1]) {
                int temp = bill[0];
                bill[0] = bill[1];
                bill[1] = temp;
            }
        } 
        return answer;
    }
}
