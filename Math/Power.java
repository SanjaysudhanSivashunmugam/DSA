class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int reversedDigit = reverse(n);
        int result = 1;
        for(int i = 0; i < reversedDigit; i++) {
            result = result * n;
        }
        return result;
    }
    public int reverse(int n){
        int temp = 0;
        while (n != 0) {
           int digit = n % 10;
           temp = temp * 10 + digit;
           n /= 10;
        }
        return temp;
    }
}
