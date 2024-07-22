import java.util.HashMap;
import java.util.ArrayList;  

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> namesHeights = new HashMap<Integer, String>(); 

        for (int i = 0; i < names.length; i++){
            namesHeights.put(heights[i], names[i]); 
        }

        ArrayList<Integer> sortedNamesHeights = new ArrayList<Integer>(namesHeights.keySet());
        Collections.sort(sortedNamesHeights); 
        Collections.reverse(sortedNamesHeights); 

        String[] results = new String[names.length]; 

        for (int i = 0; i < names.length; i++){
            results[i] = namesHeights.get(sortedNamesHeights.get(i)); 
        }
        return results; 
    }
}