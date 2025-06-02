# Print Divisors
```java
public class Main
{
	public static void main(String[] args) {
		printDivisors(40);
	}
	
	static void printDivisors(int n) {
	    for(int i = 1; i * i < n; i++) {
	        if(n % i == 0){
	            System.out.print(i + " ");
	            if(i != n / i) {
	                System.out.print(n / i + " ");
	            }
	        }
	    }
	}
}
```