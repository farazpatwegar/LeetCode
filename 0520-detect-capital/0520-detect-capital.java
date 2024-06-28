class Solution {
    public boolean detectCapitalUse(String word) {
       String temp=word;
        if(temp.toUpperCase()==word)
            return true;
        else if(temp.toLowerCase()==word)
            return true;
        else if(Character.isUpperCase(word.charAt(0)))
        {
            for(int i=1;i<word.length();i++)
            {
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            }
            return true;
        }
        return false;
    }
}