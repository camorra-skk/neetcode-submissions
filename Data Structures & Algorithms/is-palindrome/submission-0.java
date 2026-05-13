class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j) {
            char start = s.charAt(i);
            while(i < j && !isAlphanumeric(start)) {
                start = s.charAt(++i);
            }
            char end = s.charAt(j);
            while(i < j && !isAlphanumeric(end)) {
                end = s.charAt(--j);
            }
            if(Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphanumeric(char c) {
        return Character.isLetterOrDigit(c);
    }
}
