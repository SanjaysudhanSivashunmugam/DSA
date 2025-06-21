# Print t to N

```java
public class Main
{
	public static void main(String[] args) {
		print(1,5);
	}
	
	static void print(int i, int n) {
	   if(i > n) {
	       return;
	   }
	   System.out.print(i++ + " ");
	   print(i,n);
	}
}
```