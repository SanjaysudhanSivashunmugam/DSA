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
`If you want to find the GCD of (a, b), GCD(a, b) = GCD(b, a % b), Repeat this until b = 0. Then, a is the answer.`
```java
public class Main
{
	public static void main(String[] args) {
		System.out.println(HCF(5,10));
	}
	
	static int HCF(int a, int b) {
	    if(b == 0) {
	        return a;
	    }
	    return HCF(b,a % b);
	}
}
```
