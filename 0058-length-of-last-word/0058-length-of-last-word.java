class Solution {
    public static int lengthOfLastWord(String S) {
    	S = S.trim();
    	int lastindex = S.lastIndexOf(" ");
        return S.length()-lastindex-1;
    }
}