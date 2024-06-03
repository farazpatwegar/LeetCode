class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int start=0,end=arr.length-1;
        while(start<end)
        {
            if(Character.isLetter(arr[start]) && Character.isLetter(arr[end]))
            {
                char ch=arr[start];
                arr[start]=arr[end];
                arr[end]=ch;
                start++;
                end--;
            }
            else if(Character.isLetter(arr[start]) && !Character.isLetter(arr[end]))
                end--;
            else if(!Character.isLetter(arr[start]) && Character.isLetter(arr[end]))
                start++;
            else if(!Character.isLetter(arr[start]) && !Character.isLetter(arr[end]))
            {
                start++;
                end--;
            }
        }
        return String.valueOf(arr);
    }
}