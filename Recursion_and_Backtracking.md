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
