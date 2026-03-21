class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bals = { "aya", "ye", "woo", "ma"};
        for(String b : babbling) {
            b = b.replace(bals[0]," ")
                 .replace(bals[1]," ")
                 .replace(bals[2]," ")
                 .replace(bals[3]," ");

            if(b.replace(" ","").equals("")) {
                answer++;
            }
        }
        return answer;
    }
}