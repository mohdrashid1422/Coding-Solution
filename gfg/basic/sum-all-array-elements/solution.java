class Solution {
    public int arraySum(int arr[]) {
        // code here
        // int totalSum = 0;
        // for(int i=0; i<arr.length; i++){
        //     totalSum += arr[i];
        // }
        // return totalSum;
        return sum(arr, arr.length);
    }
    public int sum(int arr[], int n){
        if(n == 0){
        return 0; 
    }
    return arr[n-1] + sum(arr, n-1);
        
    }
    
}
