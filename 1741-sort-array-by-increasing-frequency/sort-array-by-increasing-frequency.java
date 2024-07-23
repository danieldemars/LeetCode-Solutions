import java.util.HashMap;
import java.util.Comparator;  
import java.util.Map; 

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> digitFrequency = new HashMap<>();
        for (int num : nums) {
            digitFrequency.put(num, digitFrequency.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(digitFrequency.entrySet());
        Collections.sort(freqList, (num, frequency) -> {
            if (!num.getValue().equals(frequency.getValue())) {
                return num.getValue() - frequency.getValue(); 
            } else {
                return frequency.getKey() - num.getKey(); 
            }  
        }); 

        int[] sortedArray = new int[nums.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : freqList) {
            for (int i = 0; i < entry.getValue(); i++) {
                sortedArray[index++] = entry.getKey();
            }
        }

        return sortedArray;
    }     
}