![alt text](image/image-3.png)
```java
public class Main
{
	public static void main(String[] args) {
		int n = 153;
		int sum = 0;
		int temp = n;
		
		while(temp > 0) {
		    int lastDigit = temp % 10;
		    sum += lastDigit * lastDigit * lastDigit;
		    temp = temp / 10;
		}
		
		System.out.println(sum == n);
	}
}
```