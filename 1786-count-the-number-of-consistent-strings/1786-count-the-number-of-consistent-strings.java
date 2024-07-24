class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] arr=allowed.toCharArray();
        List<Character>list1=new ArrayList<>();
        for(char ch:arr)
            list1.add(ch);
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            String temp=words[i];
            char[] arr1=temp.toCharArray();
            List<Character>list2=new ArrayList<>();
            for(char z:arr1)
                list2.add(z);
            int length1=arr1.length;
            int count1=0;
            for(int j=0;j<arr1.length;j++)
            {
                if(list1.contains(list2.get(j)))
                    count1++;
            }
            if(count1==length1)
                count++;
        }
        return count;
    }
}