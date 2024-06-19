class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list  = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        for(int ele : list){
            set.add(ele);
        }
        if(list.size() == set.size()){
            return true;
        }
        return false;
    }
}