# Reverse Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer  **n.** Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

 **Examples:** 

```
Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.

```

```
Input : n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.
```

```
Input : n = 12345 
Output: 54321
Explanation: By reversing the digits of number, number will change into 54321.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T11:24:23.982Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-digit0316/1)