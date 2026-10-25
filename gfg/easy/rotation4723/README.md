# Find Rotation Count

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an increasing sorted rotated array  **arr[]** of distinct integers. The array is right-rotated  **k**  times. Find the value of  **k**.

 **Examples:** 

```
Input: arr[] = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is [5, 1, 2, 3, 4]. The original sorted array is [1, 2, 3, 4, 5]. We can see that the array was rotated 1 times to the right.

```

```
Input: arr = [1, 2, 3, 4, 5]
Output: 0
Explanation: The given array is not rotated.
```

```
Input: arr = [6, 9, 2, 4]
Output: 2
Explanation: The original array is [2, 4, 6, 9] and we get the above array after two rotations.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T11:41:58.539Z  

```java
class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int low = 0; 
        int high = arr.length-1; 
        int ans = Integer.MAX_VALUE; 
        int index = -1;
        while(low <= high){
            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }
            int mid = low + (high - low)/2;
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    index = low; 
                    ans = arr[low];
                }
                low = mid + 1; 
            }else if (arr[mid] <= arr[high]){
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
            
        }
        return index;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotation4723/1)