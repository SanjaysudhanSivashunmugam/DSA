# Count Prime
### Given an integer n, return the prime numbers that are strictly less than n.
```java
// using Sieve of Eratosthenes algo
public class Main
{
	public static void main(String[] args) {
		countPrime(10);
	}
	
	public static void countPrime(int a) {
	    boolean isPrime[] = new boolean[a+1];
	    for(int i = 2; i*i <= a; i++){
	        if(!isPrime[i]){
	            for(int j = i*2; j <= a; j = j + i){
	                isPrime[j] = true;
	            }
	        }
	    }
	    for(int i = 2; i < isPrime.length; i++) {
	        if(!isPrime[i]){
	            System.out.print(i+" ");
	        }
	    }
	}
}
```