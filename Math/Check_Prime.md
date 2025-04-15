# Check Prime
```java
public class Main
{
	public static void main(String[] args) {
		int a = 3;
		System.out.println(prime_brute_force(a));
		System.out.println(prime_optimized(a));
	}
	public static boolean prime_brute_force(int a){
	    if(a == 1) {
	        return false;
	    }
	    for(int i = 2; i < a; i++) {
	        if(a % i == 0){
	            return false;
	        }
	    }
	    return true;
	}
	public static boolean prime_optimized(int a){
	    if(a == 1) {
	        return false;
	    }
	    for(int i = 2; i*i <= a; i++) {
	        if(a % i == 0){
	            return false;
	        }
	    }
	    return true;
	}
}
```