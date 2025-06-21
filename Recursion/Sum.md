# Sum of N natural Numbers
```java
public class Main
{
	public static void main(String[] args) {
		System.out.print(sum(3,0));
	}
	
	static int sum(int n, int sum) {
	   if(n < 1) {
	       return sum;
	   }
	   
	   return sum(n-1,sum+n);
	}
}
```