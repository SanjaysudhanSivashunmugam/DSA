# Trailing Zeros
```java
public class Main
{
	public static void main(String[] args) {
		int a = 251;
		int res = 0;
		for(int i = 5; i <= a; i = i * 5) {
		    res = res + (a / i);
		}
		System.out.print(res);
	}
}
```