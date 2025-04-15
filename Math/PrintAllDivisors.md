# Print all Divisors
### You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.
```java
public class Main
{
	public static void main(String[] args) {
		printAllDivisors(6);
	}
	
	public static void printAllDivisors(int a) {
	    for (int i = 1; i*i <= a; i++) {
	        if(a % i == 0) {
	            System.out.println(i);
	            
	            if(i != a/i) {
	                System.out.println(a/i);
	            }
	        }
	    } 
	}
}
```