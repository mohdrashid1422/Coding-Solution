# Numbers with Given Digit

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **n**  and  **d**. Return an array containing all the numbers between  **0 to n**  that contain the specific digit  **d**.

 **Examples:** 

```
Input: n = 20, d = 5
Output: [5, 15]
Explanation: For number till 20, 5 appears in 5 itself and 15.
```

```
Input: n = 50, d = 2
Output: [2, 12, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 32, 42]
Explanation: For number till 50, 2 appears in all these numbers.
```

 **Constraints** :
0 ≤ n ≤ 103
0 ≤ d ≤ 9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T08:36:56.677Z  

```java
class Solution {
    public List<Integer> findNumbers(int n, int d) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(d == 0){
            list.add(d);
        }
        for(int i=1; i<=n; i++){
            int num = i;
            while(num>0){
                int digit = num % 10;
                if(digit == d){
                    list.add(i);
                    break;
                }
            num = num/10;
                
            }
            
        }
        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-number-which-contain-the-digit-d4144/1)