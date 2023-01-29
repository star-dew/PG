package ex1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public int solution(String t, String p) {
    	int answer = 0;
        List<String> answerList = new ArrayList<>();
        String stT = t;
        String stP = p;
        
        // p 길이 파악
        int iPLen = stP.length();
        
        // t 문자열 파악
        List<String> arrStT = new ArrayList<>();
        String subT = "";
        for (int idx = 0; idx + iPLen <= stT.length(); idx++) {
        	subT = stT.substring(idx, idx + iPLen);
        	arrStT.add(subT);
        }
        
        // 문자 비교
        for (String idx : arrStT) {
        	if (idx.compareTo(stP) <= 0) {
        		answerList.add(idx);
        	}
        }
        
        answer = answerList.size();
        
        return answer;
    }
    
    public static void main(String[] args) {
		String t = "311234234134132413241324";
		String p = "24123412341234123";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(t, p));
	}
    
}