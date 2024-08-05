class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> frequencies = new HashMap<String, Integer>(); 

        for (int i = 0; i < arr.length; i++){
            if (frequencies.containsKey(arr[i])){
                int num = frequencies.get(arr[i]);
                num++; 
                frequencies.put(arr[i], num); 
            } else {
                frequencies.put(arr[i], 1); 
            }
        }

        int distinctCount = 0; 

        for (int i = 0; i < arr.length; i++){
            if (frequencies.get(arr[i]) == 1){
                distinctCount++;

                if (distinctCount == k){
                    return arr[i]; 
                }
            }
        }

        return ""; 
    }
}