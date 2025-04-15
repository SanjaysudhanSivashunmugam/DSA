# Armstrong Number
## `Problem Statement:` Given an integer N, return true it is an Armstrong number otherwise return false. An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

```java
public class Main
{
	public static void main(String[] args) {
		Armstrong(153);
	}
	public static void Armstrong(int a){
	    int n = String.valueOf(a).length();
	    int sum = 0;
	    int temp = a;
	    while(a > 0){
	        sum += Math.pow(a%10,n);
	        a = a / 10;
	    }
	    if(sum == temp) {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}
```