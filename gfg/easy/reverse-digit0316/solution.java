class Solution {
    public int reverseDigits(int n) {
        return reverse(n, 0);
        // Code here
        
    }
    public static int reverse(int n, int sum){
            if(n == 0){
                return sum;
            }
            int rev = n % 10;
            sum = sum * 10 + rev;
            return reverse(n/10, sum);
    }
}