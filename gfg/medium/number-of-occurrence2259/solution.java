class Solution {
    int countFreq(int[] arr, int target) {
        int first = -1;
        int last = -1;

               // first occurance
               int start = 0, end = arr.length-1;
               while(start <= end){
                   int mid = start + (end - start)/2;
                   if(arr[mid] == target){
                       first = mid;
                       end = mid-1; // search left
                   }
                   else if(arr[mid] < target){
                       start = mid+1;
                   }
                   else{
                       end = mid-1;
                   }
               }

               // last occurance
               start = 0;
               end = arr.length-1;
               while(start <= end){
                   int mid = start + (end - start)/2;
                   if(arr[mid] == target){
                       last = mid;
                       start = mid+1;// search right
                   }
                   else if(arr[mid] < target){
                       start = mid+1;
                   }
                   else{
                       end = mid-1;
                   }
               }
              if (first == -1) {
                          return 0;
                }

               return last - first + 1;
    }
}
