![alt text](image/image-6.png)
```java
public class Main
{
	public static void main(String[] args) {
		int n = 7;
		int count = 0;
		
		for(int i = 1; i * i <= n; i++) {
		    if(n % i == 0) {
		        count ++;
		        if(n / i != i) {
		            count ++;
		        }
		    }
		}
		
		if(count > 2) {
		    System.out.println("It is not a Prime Number");
		}
		else {
		    System.out.println("It is a Prime Number");
		}
	}
}
```