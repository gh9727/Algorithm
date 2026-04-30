import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        
        HashMap<String, String> map = new HashMap<>();
        String[] states = new String[record.length];
        
        for(int i = 0; i < record.length; i++) {
            String[] data = record[i].split(" ");            
            states[i] = data[0];
            String uid = data[1];
            if(!states[i].equals("Leave")) {
                String nickname = data[2];
                map.put(uid, nickname);       
            }
        }
        
        for(int i = 0; i < record.length; i++) {
            String uid = record[i].split(" ")[1];
            if(states[i].equals("Enter")) {
                answer.add(map.get(uid) + "님이 들어왔습니다.");
            } else if(states[i].equals("Leave")) {
                answer.add(map.get(uid) + "님이 나갔습니다.");
            } 
        }
        return answer.toArray(new String[answer.size()]);
    }
}