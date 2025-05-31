# LCM
```java
public class Main
{
	public static void main(String[] args) {
		System.out.println(LCM(5,10));
	}
	
	static int LCM(int a, int b) {
	    int res = Math.max(a,b);
	    while(true) {
	        if(res % a == 0 && res % b == 0) {
	            return res;
	        }
	        res++;
	    }
	}
}
```