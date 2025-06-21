# Reverse a Number
```java
public class Main
{
	public static void main(String[] args) {
		reverse(123);
	}
	
	public static void reverse(int n) {
	    int newDigit = 0;
	    while(n > 0) {
	        int lastDigit = n % 10;
	        newDigit = (newDigit * 10) + lastDigit;
	        n /= 10;
 	    }
 	    System.out.print(newDigit);
	}
}
```