![alt text](image/image-1.png)

```java
public class Main
{
	public static void main(String[] args) {
		int n = 14984;
		int reversed = 0;
		while(n > 0) {
		    int lastDigit = n % 10;
		    reversed = (reversed * 10) + lastDigit;
		    n = n / 10;
		}
		
		System.out.print(reversed);
	}
}
```