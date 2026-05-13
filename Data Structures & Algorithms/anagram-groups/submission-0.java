class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {Map<String,List<String>>
         hs = new HashMap<>();

        for(String s: strs) {
            String sortedS = s.chars() // Get an IntStream of character code points
            .sorted()                    // Sort the code points
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append) // Collect into a StringBuilder
            .toString();

            if(hs.containsKey(sortedS)) {
                hs.get(sortedS).add(s);
                hs.put(sortedS,hs.get(sortedS));
            } else {
                List<String> l = new ArrayList<>();
                l.add(s);
                hs.put(sortedS,l);
            }
        }

        return hs.values().stream().collect(Collectors.toList());

    }
}
