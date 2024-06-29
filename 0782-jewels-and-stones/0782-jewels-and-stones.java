class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] arr=jewels.toCharArray();
        char[] arr1=stones.toCharArray();
        
        Set<Character>set=new HashSet<>();
        for(char ch1:arr)
        {
            set.add(ch1);
        }
        
        for(int i=0;i<stones.length();i++)
        {
            if(set.contains(stones.charAt(i)))
                count++;
        }
      
        return count;
    }
}