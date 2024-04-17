public class Solution {
    public int Reverse(int x) {
        long reversed = 0; 

        while (x != 0){
            reversed = reversed * 10 + x % 10;

            if (reversed > int.MaxValue || reversed < int.MinValue) {
                return 0;
            }

            x /= 10; 
        }

        return (int)reversed; 
    }
}