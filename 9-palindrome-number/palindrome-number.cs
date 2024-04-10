public class Solution {
    public bool IsPalindrome(int x) {
        if (x < 0){
            return false; 
        }

        long reversedInt = long.Parse(new string(x.ToString().Reverse().ToArray()));

        if (x == reversedInt){
            return true;
        } else {
            return false; 
        }
    }
}