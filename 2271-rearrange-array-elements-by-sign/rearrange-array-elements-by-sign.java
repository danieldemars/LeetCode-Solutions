import java.util.Arrays; 

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length]; 
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2]; 
        int j = 0; 

        // organize positives
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                pos[j] = nums[i];
                j++; 
            }
        }

        j = 0; 

        // organize negatives
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < 0){
                neg[j] = nums[i];
                j++; 
            }
        }

        // get results 
        int posIndex = 0;
        int negIndex = 0; 
        boolean positive = true; 
        for (int i = 0; i < nums.length; i++){
            if (positive){
                result[i] = pos[posIndex]; 
                posIndex++; 
            } else {
                result[i] = neg[negIndex];
                negIndex++; 
            }

            positive = !positive; 
        }
        
        return result; 
    }
}