/*class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuffer temp=new StringBuffer(s);
         StringBuffer no=new StringBuffer();
        int x=0,j=0;
         if (temp.length() % k != 0) {
            x = k - (temp.length() % k);
            for (int i = 0; i < x; i++) {
                temp.append(fill);
            }
        }
        String[] arr=new String[temp.length()/k];
         for (int i = 0; i < temp.length(); i += k) {
            arr[i / k] = temp.substring(i, i + k);
        }
        return arr;
    }
}*/


class Solution {
    public String[] divideString(String s, int k, char fill) {
      int x=0;
        StringBuffer temp=new StringBuffer(s);
        if(temp.length()%k!=0)
        {
            x=k-temp.length()%k;
            for(int i=0;i<x;i++)
            {
                temp.append(fill);
            }
        }
        String[] arr=new String[temp.length()/k];
        for(int i=0;i<temp.length();i+=k)
        {
            arr[i/k]=temp.substring(i,i+k);
        }
        
        return arr;
    }
}















