class Solution {
    public boolean isValid(String s) {
        List<Character> open = Arrays.asList('(', '{', '[');
        char[] closed = new char[] {')','}',']'};

        Stack<Character> stack = new Stack();

        for(char c: s.toCharArray()) {
            if(open.contains(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char p = stack.pop();
                if(c == ')' && p == '(') {

                } else if(c == '}' && p == '{') {

                } else if(c == ']' && p == '[') {

                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty()?true:false;
    }
}
