class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
            
       char[] arr=s.toCharArray();
        List<Character>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isLetterOrDigit(arr[i]))
            list.add(Character.toLowerCase(arr[i]));
            
            else
                 continue;
            
        }
        int begin=0;
        int end=list.size()-1;
        while(begin<end)
        {
            if(list.get(begin)!=list.get(end))
                return false;
            begin++;
            end--;
        }
        return true; 
    }
}