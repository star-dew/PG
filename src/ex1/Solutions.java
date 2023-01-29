package ex1;

public class Solutions {
	
	public int solution (String t, String p) {
		int answer = 0;
		
		for(int idx = 0; idx <= t.length() - p.length(); idx++) {
			if (Long.parseLong(t.substring(idx, idx + p.length())) <= Long.parseLong(p)) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String t = "311234234134132413241324";
		String p = "24123412341234123";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(t, p));
	}

}
