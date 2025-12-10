![alt text](image/image-7.png)
```java
public class Main
{
	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 12;
		int min = Math.min(num1, num2);
		int hcf = 1;
		for(int i = min; i > 0; i--) {
		    if(num1 % i == 0 && num2 % i == 0) {
		        hcf = i;
		        break;
		    }
		}
		System.out.print("HCF is " + hcf);
	}
}
```