class Solution 
{
    public String defangIPaddr(String address) 
    {
        String[] arr=address.split("\\.");
        StringBuffer temp=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            temp.append(arr[i]);
            if(i<arr.length-1)
                temp.append("[.]");
        }
        return new String(temp);
        
    }
}