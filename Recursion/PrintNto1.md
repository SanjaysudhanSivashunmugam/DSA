# Print N to 1
```java
public class Main
{
	public static void main(String[] args) {
		print(5);
	}
	
	static void print(int n) {
	   if(n < 1) {
	       return;
	   }
	   System.out.print(n-- + " ");
	   print(n);
	}
}
```