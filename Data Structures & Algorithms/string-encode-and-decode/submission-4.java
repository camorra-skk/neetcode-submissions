class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder("");
        for(String s: strs) {
            stringBuilder.append(s.length()).append("#").append(s);
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}
