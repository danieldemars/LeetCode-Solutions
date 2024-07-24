class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[] newValues = new int[nums.length]; 
        // get new mapped numbers
        for (int i = 0; i < nums.length; i++){
            String numAsString = Integer.toString(nums[i]); 
            String mappedNum = "";

            // get individual digits in the current num and append them to mappedNum
            for (int j = 0; j < numAsString.length(); j++){
                char digit = numAsString.charAt(j); 
                char mappedChar = Integer.toString(mapping[Character.getNumericValue(digit)]).charAt(0); 
                mappedNum += mappedChar; 
            }

            int newNum = Integer.parseInt(mappedNum); 
            newValues[i] = newNum; 
        }

        return sortArrays(newValues, nums); 
    }

    public int[] sortArrays(int[] newValues, int[] nums) {
        Integer[] indices = new Integer[newValues.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (i1, i2) -> Integer.compare(newValues[i1], newValues[i2]));

        int[] sortedNewValues = new int[newValues.length];
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < indices.length; i++) {
            sortedNewValues[i] = newValues[indices[i]];
            sortedNums[i] = nums[indices[i]];
        }

        System.arraycopy(sortedNewValues, 0, newValues, 0, newValues.length);
        System.arraycopy(sortedNums, 0, nums, 0, nums.length);

        return nums;
    }

}