class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = t.length() - p.length() + 1;
        int pLen = p.length();
        Long pNum = Long.parseLong(p);
        
        for(int i = 0; i < len; i++) {
            Long tNum = Long.parseLong(t.substring(i, i + pLen));
            if(tNum <= pNum) {
                answer += 1;
            }
        }
        return answer;
    }
}