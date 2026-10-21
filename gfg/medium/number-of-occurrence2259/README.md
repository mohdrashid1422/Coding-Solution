# Count Occurrences in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted array  **arr[]** and a number  **target**, find the number of occurrences of target in given array. 

 **Examples:** 

```
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
```

```
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.

```

```
Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
Output: 3
Explanation: target = 12 occurs 3 times in the given array so the output is 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T11:51:10.508Z  

```java
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

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1)