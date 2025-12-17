# Printing N to one
```java
public class Main
{
	public static void main(String[] args) {
		print(10);
	}
	
	public static void print(int start) {
	    
	    if(start < 1) {
	        return;
	    }
	    
	    System.out.println(start--);
	    print(start);
	}
}
```