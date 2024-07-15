class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer temp=new StringBuffer();
        int l=Math.max(word1.length(),word2.length());
        for(int i=0;i<l;i++)
        {
            if(i<word1.length())
            temp.append(word1.charAt(i));
            if(i<word2.length())
            temp.append(word2.charAt(i));
        }
        return new String(temp);
    }
}