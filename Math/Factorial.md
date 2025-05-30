# Factorial
```java
public class Main
{
	public static void main(String[] args) {
	    System.out.print(factorial(5));
	}
	public static int factorial(int n) {
	    if(n == 0) {
	        return 1;
	    }
	    return n * factorial(n - 1);
	}
}
```
```java
public class Main
{
	public static void main(String[] args) {
	    System.out.print(factorial(5));
	}
	public static int factorial(int n) {
	    int answer = 1;
	    for(int i = 2; i <= n; i++) {
	        answer = answer * i;
	    }
	    return answer;
	}
}
```