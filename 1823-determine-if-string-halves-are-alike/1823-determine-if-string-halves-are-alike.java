class Solution {
    public boolean halvesAreAlike(String s) {
        int left=0,right=0;
        
        List<Character>list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i<s.length()/2 && list.contains(ch))
                left ++;
            if(i>=s.length()/2 && list.contains(ch))
                right++;
        }
        
        if(left==right)
            return true;
        return false;
    }
}