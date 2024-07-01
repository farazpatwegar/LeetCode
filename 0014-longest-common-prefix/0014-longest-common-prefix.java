class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer prefix=new StringBuffer();
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++)
        {
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i))
                break;
            else
                prefix.append(strs[0].charAt(i));
        }
        return String.valueOf(prefix);
    }
}