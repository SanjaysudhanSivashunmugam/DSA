# Print Prime Factors
```java
public class Main
{
	public static void main(String[] args) {
		printPrimeFactors(40);
	}
	
	static void printPrimeFactors(int n) {
	    for(int i = 2; i < n; i++) {
	        if(prime(i)) {
	            int x = i;
	            while(n % x == 0) {
	                System.out.print(i+" ");
	                x = x * i;
	            }
	        }
	    }
	}
	
	static boolean prime(int n) {
	    if(n <= 1) {
	        return false;
	    }
	    for(int i = 2; i * i <= n; i++) {
	        if(n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
```