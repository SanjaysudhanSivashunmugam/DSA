# HCF / GCD
```java
public class Main
{
	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		int res = Math.min(a,b);
		while(res > 0) {
		    if(a % res == 0 && b % res == 0) {
		        break;
		    }
		    res--;
		}
		System.out.print(res);
	}
}
```