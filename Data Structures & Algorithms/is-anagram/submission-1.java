class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> hs = new HashMap<>();

        for(char c: s.toCharArray()) {
            hs.put(c,hs.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()) {
            if(!hs.containsKey(c)) {
                return false;
            } else {
                int i = hs.getOrDefault(c,0);
                if(i> 0) {
                    if(i==1){
                        hs.remove(c);
                    } else {
                        hs.put(c,i-1);
                    }
                }
                 else {
                    return false;
                }
            }
        }
        return hs.isEmpty()?true:false;
    }
}
