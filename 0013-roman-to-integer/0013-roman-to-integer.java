import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Mapping Roman numerals to their integer values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int value = romanValues.get(s.charAt(i));
            if (value > prevValue) {
                result += value - 2 * prevValue; // subtracting the previous value twice to undo the addition
            } else {
                result += value;
            }
            prevValue = value;
        }
        
        return result;
    }
    
}