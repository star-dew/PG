package ex1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public int solution(String t, String p) {
    	int answer = 0;
        List<Integer> answerList = new ArrayList<Integer>();
        String stT = t;
        String stP = p;
        
        // p 길이 파악
        int iPLen = stP.length();
        
        // t 문자열 파악
        List<Integer> arrStT = new ArrayList<>();
        String subT = "";
        for (int idx = 0; idx + iPLen <= stT.length(); idx++) {
        	subT = stT.substring(idx, idx + iPLen);
        	arrStT.add(Integer.parseInt(subT));
        }
        
        // 문자 비교
        for (int idx : arrStT) {
        	if (idx <= Integer.parseInt(stP)) {
        		answerList.add(idx);
        	}
        }
        
        answer = answerList.size();
        
        return answer;
    }
    
    public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(t, p));
	}
    
}