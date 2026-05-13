class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int res=s.length() == 0? 0 : 1;

        for(int j=1;j<s.length();j++) {
            if(!containsChar(i,j,s)) {
                res = Math.max(res,j-i+1);
                continue;
            }
            while(j < s.length() && containsChar(i,j,s)) {
                i++;
            } 
        }
        return res;
    }

    public boolean containsChar(int i,int j,String s) {
        for(;i<j;i++) {
            if(s.charAt(i) == s.charAt(j)) {
                return true;
            }
        }
        return false;
    }
}
