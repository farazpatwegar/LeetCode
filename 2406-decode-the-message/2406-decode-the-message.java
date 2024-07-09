class Solution {
    public String decodeMessage(String key, String message) {
       char[] arr=key.toCharArray();
        Set<Character>set=new LinkedHashSet<>();
        for(char ch:arr)
        {
            if(Character.isLetter(ch))
            set.add(ch);
        }
        char[] arr1=new char[set.size()];
        int i=0;
        for(char c:set)
        {
            arr1[i]=c;
            i++;
        }
        Map<Character,Character>map=new LinkedHashMap<>();
        char cha='a';
        for(int j=0;j<arr1.length;j++)
        {
            map.put(arr1[j],(char)(cha+j));
        }
        StringBuffer temp=new StringBuffer();
        
                    for(int k=0;k<message.length();k++)
                    {
                        if(map.containsKey(message.charAt(k)))
                        temp.append(map.get(message.charAt(k)));
                        else
                            temp.append(' ');
                    }
                    return new String(temp);
            
    }
}