# Sum of N Natural Numbers
```java
public class Main
{
	public static void main(String[] args) {
		System.out.println(sumOfNaturalNumbers(5));
	}
	
	public static int sumOfNaturalNumbers(int n){
	    if(n == 0) {
	       return 0;
	    }
	    return n + sumOfNaturalNumbers(n-1);
	}
}
```