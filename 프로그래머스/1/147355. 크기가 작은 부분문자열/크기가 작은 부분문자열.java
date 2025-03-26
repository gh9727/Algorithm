import java.util.ArrayList;
// (p > t) 인 t의 개수
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        
        // 1. p의 부분 문자열 == t의 부분 문자열
        if(t.length() == p.length()) {
            long n1 = Long.parseLong(t);
            long n2 = Long.parseLong(p);
            return n1 > n2 ? 0 : 1;
        }
        
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            list.add(String.valueOf(t.charAt(i)));
        }
        
        while(true) {
            if(list.size() < p.length()) {
                break;
            }
            t = "";
            for(int i = 0; i < size; i++) {
                t += list.get(i);
            }   
            System.out.println("size = " + size);
            System.out.printf("t = %s",t);
            // 마지막즈음 부분문자열 개수가 맞지 않을 수 있음
            if(t.length() == p.length()) {
                long n1 = Long.parseLong(t);
                long n2 = Long.parseLong(p);
                answer = n1 > n2 ? (answer) : (answer + 1);    
            }
            else {
                break;
            }
            list.remove(0);
        }
        
        return answer;
    }
}





// b. t.length > p.length
// Integer.parseInt(t);
// Integer.parseInt(p);