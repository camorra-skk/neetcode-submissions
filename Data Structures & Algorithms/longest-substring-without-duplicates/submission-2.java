class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int res=0;

        for(int i = 0, j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if(hm.containsKey(c)) {
                i = Math.max(hm.get(c) + 1,i);
            }
            hm.put(c,j);
            res = Math.max(res,j-i+1);
        }
        return res;
    }
}
