class Solution {
    public int minOperations(String[] logs) {
        int distanceFromMain = 0; 

        for (int i = 0; i < logs.length; i++){
            if (logs[i].equals("../")){
                if (distanceFromMain > 0){
                    distanceFromMain--;
                }
            } else if (logs[i].equals("./")){
                // do nothing
            } else {
                distanceFromMain++; 
            }
        }
        
        return distanceFromMain; 
    }
}