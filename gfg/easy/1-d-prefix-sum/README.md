# 1-D prefix sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, the goal is to compute its  **prefix sum**  array. The prefix sum array,  **prefixSum[]**, should be of the same length as  **arr[]**, where each element  **prefixSum[i]**  represents the  **sum**  of all elements from the start of the array up to index i, **i.e.**, prefixSum[i] = arr[0] + arr[1] +.... + arr[i].

 **Examples:** 

```
Input: arr[] = [10, 20, 10, 5, 15]
Output: [10, 30, 40, 45, 60]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 10, 
prefixSum[1] = 10 + 20 = 30, 
prefixSum[2] = 10 + 20 + 10 = 40 and so on.
```

```
Input: arr[] = [30, 10, 10, 5, 50]
Output: [30, 40, 50, 55, 105]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 30, 
prefixSum[1] = 30 + 10 = 40, 
prefixSum[2] = 30 + 10 + 10 = 50 and so on.
```

**Constraints:
**1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T19:06:10.478Z  

```java
class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        // ArrayList<Integer> list = new ArrayList<>();
        // int sum = 0; 
        // for(int i=0; i<arr.length; i++){
        //     sum += arr[i];
        //     list.add(sum);
        // }
        // return list;
        
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(prefix[i]);
        }
        return list;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/1-d-prefix-sum/1)