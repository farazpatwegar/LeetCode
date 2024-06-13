class Solution {
    public String capitalizeTitle(String title) {
        String s=title.toLowerCase();
        String[] arr=s.split("\\s+");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()<=2)
                continue;
            char[] temp=arr[i].toCharArray();
            char ch=Character.toUpperCase(temp[0]);
            temp[0]=ch;
            arr[i]=String.valueOf(temp);
        }
        return String.join(" ",arr);
    }
}