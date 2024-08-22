class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder complement = new StringBuilder(binary); 

        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1'){
                complement.setCharAt(i, '0');
            } else {
                complement.setCharAt(i, '1');
            }
        }

        return Integer.parseInt(complement.toString(), 2);
    }
}