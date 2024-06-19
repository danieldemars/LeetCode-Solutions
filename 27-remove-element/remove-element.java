class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0; 
        }

        int k = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                nums[i] = -1;
            }
        }
        
        nums = moveVals(nums);  

        for (int j = 0; j < nums.length; j++){
            if (nums[j] != -1){
                k++;
            }
        }

        return k;
    }

    private int[] moveVals(int[] nums){
        int index = 0; 
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != -1) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = -1;
        }

        return nums; 
    }
}