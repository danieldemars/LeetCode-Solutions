class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        int maxLength = 1; 
        for (int num : nums){
            values.add(num); 
        }

        
        for (int i = 0; i < nums.length; i++){
            int num = nums[i]; 
            int currentLength = 1; 

            while (true) {
                int sqrt = (int) Math.sqrt(num);
                if (sqrt * sqrt != num || !values.contains(sqrt)) {
                    break;
                }
                num = sqrt;
                currentLength++;
            }

            if (currentLength > maxLength){
                maxLength = currentLength; 
            }
        }

        if (maxLength == 1){
            return -1;
        } else {
            return maxLength; 
        }
    }

    
}