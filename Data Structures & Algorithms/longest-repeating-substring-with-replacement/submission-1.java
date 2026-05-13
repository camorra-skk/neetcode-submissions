class Solution {
    public int characterReplacement(String s, int k) {
        
        int res = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        for(int i=0, j=0;j<s.length();j++) {
            char c = s.charAt(j);
            freq[c - 'A'] += 1;
            maxFreq = Math.max(maxFreq,freq[c-'A']);
            while((j-i+1) - maxFreq > k) {
                freq[s.charAt(i) - 'A'] -=1;
                i++;
            }
            res = Math.max(res,j-i+1);
        }
        return res;
    }
}
