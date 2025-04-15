# LCM
```java
public class Main
{
	public static void main(String[] args) {
		int a = 30;
		int b = 15;
		System.out.println(lcm_brute_force(a,b));
	}
	public static int lcm_brute_force(int a, int b){
	    int x = Math.max(a,b);
	    while(true){
	        if(x % a == 0 && x % b == 0){
	            return x;
	        }
	        x++;
	    }
	}
}
```