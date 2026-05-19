import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> members = new HashMap<>(); // 선수 & 순위 기록
        
        for(int i = 0; i < players.length; i++) {
            members.put(players[i], i);
        }
        
        for(String call : callings) {
            int curIdx = members.get(call); // kai_idx
            int frontIdx = curIdx - 1;      // poe_idx
            String frontPlayer = players[frontIdx]; // poe
            String curPlayer = players[curIdx]; // kai
            
            players[frontIdx] = curPlayer; // kai
            players[curIdx] = frontPlayer; // poe
            
            members.put(call, frontIdx);
            members.put(frontPlayer, curIdx);
        }
        return players;
    }
}
// 1. indexOf() 제공하는 타입(클래스): String, List