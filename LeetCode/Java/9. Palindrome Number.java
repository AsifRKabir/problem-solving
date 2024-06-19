class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int originalNum = x;
        int reversedNum = 0;

        while(x != 0) {
            int lastDigit = x % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            x /= 10;
        }

        return originalNum == reversedNum;
    }
}