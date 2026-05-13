class Solution {
    public int lengthOfLongestSubstring(String s) {
                if (s == null || s.isEmpty()) return 0;

        int left = 0;
        int right = 0;
        int maxStart = 0;
        int maxLength = 0;
        char[] chars = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();

        while(right < chars.length) {

            while(hs.contains(chars[right])) {
                hs.remove(chars[left]);
                left++;
            }

            hs.add(chars[right]);

            if(maxLength < right-left +1) {
                maxStart = left;
                maxLength = right - left + 1;
            }

            right++;

        }

        return maxLength;
    }
}
