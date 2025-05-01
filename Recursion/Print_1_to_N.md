# Print 1 to N
```java
public class Main
{
	public static void main(String[] args) {
		printNto1(5);
	}
	
	public static void printNto1(int n) {
	    if(n == 0) {
	        return;
	    }
	    printNto1(n-1);
	    System.out.print(n + " ");
	}
}
```