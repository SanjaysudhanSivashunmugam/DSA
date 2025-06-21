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
`If you want to find the GCD of (a, b), GCD(a, b) = GCD(a -b, b), Repeat this until a = 0. Then, b is the answer.`
```java
public class Main
{
	public static void main(String[] args) {
	     System.out.print(hcf(10,20));
	}
	static int hcf(int a, int b) {
	   while(a > 0 && b > 0) {
	       if(a >b) a = a%b;
	       else b = b % a;
	   }
	   if(a == 0) return b;
	    return a;
	}
}
```
