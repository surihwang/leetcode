class Solution {
    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int count = 0, max = 0, idx = 0;
		idx = (k == 1) ? 0 : 1;
		char lastChar = s.charAt(0);
		
		for (int i=0; i<s.length(); i++) {
			if (isVowel(s.charAt(i))) count++;
			if (i+1 >= k) {
				max = Math.max(max, count);
				if (isVowel(lastChar)) count--;
				lastChar = s.charAt(idx++);
			}
		}
		return max;

    }
}