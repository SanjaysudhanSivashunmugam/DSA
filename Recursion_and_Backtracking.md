# Recursion and Backtracking

## 1) Printing numbers 1 - 5:

```java
//Print numbers 1 - 5 using Recursion

public class Main
{
	public static void main(String[] args) {
		print(1);
	}
	
	public static void print(int n) {
	    if(n > 5) {
	        return;
	    }
	    System.out.println(n);
	    print(n + 1);
	}
}
```
### 21/03/25
## 2) Printing numbers 1 - N:
```java
class Solution {

    public void printNos(int n) {
        // Your code here
        if(n==0) return;
        printNos(n-1);
        System.out.print(n+" ");
    }
}

```
## 3) Factorial
```java
class Solution {
    static int factorial(int n) {
        // code here
        if(n == 1 || n == 0){
            return 1; 
        }
        return n*factorial(n-1);
    }
}
```
## 4) Fibonacci
```java
class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n == 0 || n == 1){
            return n;
        }
        
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
```
