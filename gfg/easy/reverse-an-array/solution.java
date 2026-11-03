class Solution {
    public void reverseArray(int arr[]) {
        
        reverse(arr, 0, arr.length-1);
        
    }
    public void reverse(int arr[], int left, int right){
        if(left >= right){
            return;
        }
        swap(arr, left, right);
        reverse(arr, left+1, right-1);
    }
    public void swap(int arr[], int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}