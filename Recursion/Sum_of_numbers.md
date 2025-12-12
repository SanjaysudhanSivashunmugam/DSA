# SUm of N numbers
```java
public class Main
{
	public static void main(String[] args) {
		System.out.print(sum(3));
	}
	
	public static int sum(int n) {
	    
	    if(n == 0) {
	        return 0;
	    }
	    
	    return n + sum(n - 1);
	}
}
```