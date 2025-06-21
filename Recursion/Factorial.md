# Factorial
```java
public class Main
{
	public static void main(String[] args) {
		System.out.print(fact(4));
	}
	
	static int fact(int n) {
	   if(n == 1) {
	       return 1;
	   }
	   
	   return n * fact(n-1);
	}
}
```