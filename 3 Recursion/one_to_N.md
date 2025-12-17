# Printing 1 to N
```java
public class Main
{
	public static void main(String[] args) {
		print(1, 10);
	}
	
	public static void print(int start, int end) {
	    
	    if(start > end) {
	        return;
	    }
	    
	    System.out.println(start++);
	    print(start, end);
	}
}
```