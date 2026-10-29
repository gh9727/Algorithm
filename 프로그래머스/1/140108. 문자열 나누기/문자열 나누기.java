class Solution {
    public int solution(String s) {
        int answer = 0;
        int eq = 0;
        int diff = 0;
        char[] c = s.toCharArray();
        
        char ch = c[0];
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ch) {
                eq++;
            } else {
                diff++;
            }
            
            if(eq == diff && i != c.length - 1) {
                ch = c[i + 1];
                eq = 0;
                diff = 0;
                answer++;
            }
            if(i == c.length - 1) {
                answer++;
            }
        }
        return answer;
    }
}
// a
// aaa bb a cc cc a bb a
// 같은거 : 3
// 다른거 : 2
// 같은거 : 4
// 다른거 : 4
    
//     같은거: 2