class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.isEmpty() || t.isEmpty() || s.length() < t.length()) return "";

        int left = 0;
        Map<Character,Integer> freqMap = new HashMap<>();
        Map<Character,Integer> freqMapX = new HashMap<>();
        char[] chars = s.toCharArray();
        int maxStart = 0;
        int minLength = Integer.MAX_VALUE;

        for(char c: t.toCharArray()) {
            freqMapX.put(c,freqMapX.getOrDefault(c,0)+1);
        }

        for (int right = 0; right < s.length(); right++) {

            freqMap.put(chars[right],freqMap.getOrDefault(chars[right],0)+1);

            while(isConditionSatisfying(freqMap,freqMapX)) {
                if(right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    maxStart = left;
                }
                int updatedVal = freqMap.get(chars[left]) - 1;
                if (updatedVal == 0) {
                    freqMap.remove(chars[left]);
                } else {
                    freqMap.put(chars[left], updatedVal);
                }
                left++;

            }
        }

        return minLength == Integer.MAX_VALUE ? "":new String(chars, maxStart, minLength);

    }

    private static boolean isConditionSatisfying(Map<Character, Integer> freqMap, Map<Character, Integer> freqMapX) {
        for (Map.Entry<Character, Integer> entry : freqMapX.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            // Check if character exists and has required frequency
            if (!freqMap.containsKey(ch) || freqMap.get(ch) < count) {
                return false;
            }
        }

        return true;
    }
}
