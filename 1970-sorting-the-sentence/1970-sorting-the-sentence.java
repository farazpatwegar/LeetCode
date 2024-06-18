class Solution {
    public String sortSentence(String s) {
      String[] arr=s.split("\\s+");
      String[] arr1=new String[arr.length];
      for(String word:arr)
      {
          int no=Integer.parseInt(String.valueOf(word.charAt(word.length()-1)));
            arr1[no-1]=word.substring(0,word.length()-1);
      }
        return String.join(" ",arr1);
    }
}