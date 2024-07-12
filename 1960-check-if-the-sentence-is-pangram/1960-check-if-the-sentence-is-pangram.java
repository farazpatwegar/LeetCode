class Solution {
    public boolean checkIfPangram(String sentence) {
        List<Character>list=new ArrayList<>();
        char ch='a';
        for(int i=0;i<26;i++)
        {
            list.add((char)(ch+i));
        }
        Set<Character>given=new HashSet<>();
        for(int j=0;j<sentence.length();j++)
        {
            given.add(sentence.charAt(j));
        }
        if(list.size()==given.size())
            return true;
        
        return false;
    }
}