class Solution {
    public String interpret(String command) {
        char[] arr=command.toCharArray();
         if((arr.length==1)&& (arr[0]=='G'||arr[0]=='a'||arr[0]=='l'))
            return String.valueOf(arr);
        StringBuffer temp=new StringBuffer();
       
        for(int i=0;i<arr.length-1;i++)
        {
            int j=i+1;
            if(arr[i]=='G'||arr[i]=='a'||arr[i]=='l')
                temp.append(arr[i]);
            if(arr[i]=='(' && arr[j]!=')')
                continue;
            if(arr[i]=='(' && arr[j]==')')
                temp.append('o');
            if((j==arr.length-1)&&(arr[j]=='G'||arr[j]=='a'||arr[j]=='l'))
                temp.append(arr[j]);
        }
        return new String(temp);
    }
}