class Solution {
    public int recursiveSum(int n) {
        // code here
        if(n == 1 || n == 0){
            return n;
        }
        return n + recursiveSum(n-1);
    }
}