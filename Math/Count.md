# Count Digits
```java
public class Main
{
	public static void main(String[] args) {
		System.out.println(count(1234));
	}
	public static int count(int n) {
	    int i = 0;
	    while(n > 0) {
	        n = n / 10;
	        i++;
	    }
	    return i;
	}
}
```