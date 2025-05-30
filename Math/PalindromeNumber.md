# Palindrome Number
```java
public class Main
{
	public static void main(String[] args) {
		int a = 131;
		int reverse = 0;
		int temp = a;
		while(temp > 0){
		    reverse = (reverse * 10) + (temp % 10);
		    temp = temp / 10;
		}
		if(a == reverse){
		   System.out.print(true);
		}
		else{
		    System.out.print(false);
		}
	}
}
```