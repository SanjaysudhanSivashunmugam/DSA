# Printing name N times
```java
public class Main
{
	public static void main(String[] args) {
		print("Sanjay", 5, 0);
	}
	
	public static void print(String name, int n, int count) {
	    
	    if(count == n) {
	        return;
	    }
	    
	    System.out.println(name);
	    print(name, n, count + 1);
	}
}
```