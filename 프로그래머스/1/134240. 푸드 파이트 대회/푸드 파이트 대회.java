class Solution {
    public String solution(int[] food) {
        String answer = "";
        int num = 0;
        String player1 = "";
        String player2 = "";
        for(int count : food) {
            if(count == 1) {
                num++;
                continue;
            }
            for(int i = 0; i < count / 2; i++) {
                player1 += num;
                player2 += num;
            }
            num++;
        }
        player1 += "0";
        StringBuffer sb = new StringBuffer(player2);        
        player2 = sb.reverse().toString();
        answer = player1 + player2;
        return answer;
    }
}