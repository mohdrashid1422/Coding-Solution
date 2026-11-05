# Prime Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, determine whether it is a  **prime number**  or not.
 **Note:**  A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

**Examples :
**

```
Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
```

```
Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.
```

```
Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T11:34:22.104Z  

```java
class Solution {
    static boolean isPrime(int n) {
        // code here
        // if(n <= 1){
        //     return false;
        // } 
        // if(n == 2){
        //     return true;
        // }
        // for(int i=2; i<=Math.sqrt(n); i++){
        //     if(n%i == 0){
        //         return false;
        //     }
        // }
        // return true;
        
        
        if(n <= 1){
            return false;
        }
        return prime(2, n);
    }
    public static boolean prime(int i, int n){
        if(i > Math.sqrt(n)){
            return true;
        }
        if(n%i == 0){
            return false;
        }
        return prime(i+1, n);
    }
    
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/prime-number2314/1)