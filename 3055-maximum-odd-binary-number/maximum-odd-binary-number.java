class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = getNumberOfOnes(s);  

       return rearrange(s, ones); 
    }

    public int getNumberOfOnes(String s){
        int num = 0; 

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                num++; 
            }
        }

        return num; 
    }

    public String rearrange(String s, int ones){
        // create new string 
        StringBuilder maxOddBinary = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            maxOddBinary.append("0"); 
        }

        // put a '1' at the end of the string
        maxOddBinary.setCharAt(maxOddBinary.length() - 1, '1'); 

        // put the other ones at the front 
        for (int i = 0; i < ones - 1; i++){
            maxOddBinary.setCharAt(i, '1'); 
        }

        return maxOddBinary.toString();
    }
}