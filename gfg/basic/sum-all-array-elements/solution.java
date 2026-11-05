class Solution {
    public int arraySum(int arr[]) {
        // code here
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
}
