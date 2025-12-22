```
Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.


Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.
```
```java
import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for(int i = 0 ; i < arr.length; i++) {
            actualSum += arr[i];
        }

        System.out.print("Missing Number is " + (sum - actualSum));
    }

   
}
```