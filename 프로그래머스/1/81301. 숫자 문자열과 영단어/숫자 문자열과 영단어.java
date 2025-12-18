class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] words = {
            "zero","one","two","three","four",
            "five","six","seven","eight","nine"
        };

        StringBuilder result = new StringBuilder();

        while (!s.isEmpty()) {
            boolean matched = false;

            for (int i = 0; i < words.length; i++) {
                String w = words[i];

                if (s.startsWith(w)) {   
                    result.append(i);    
                    s = s.substring(w.length()); 
                    matched = true;
                    break;
                }
            }

           if (!matched) {
            // 숫자면 그대로 소비
            result.append(s.charAt(0));
            s = s.substring(1);
           }
        }
        answer = Integer.parseInt(result.toString());

        return answer;
    }
}