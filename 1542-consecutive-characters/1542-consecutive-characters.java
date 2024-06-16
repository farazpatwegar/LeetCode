class Solution {
    public int maxPower(String s) {
        int count=1,maxcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
                count++;
            else
            {
                if(count>maxcount)
                    maxcount=count;
                
                count=1;
            }
        }
        return maxcount;
    }
}