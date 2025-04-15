# HCF/GCD 
```java
public class Main
{
	public static void main(String[] args) {
		int a = 30;
		int b = 15;
		System.out.println(hcf_brute_force(a,b));
		System.out.println(hcf_euclidean_algo(a,b));
	}

	public static int hcf_brute_force(int a, int b){
	    int x = Math.min(a,b);
	    while(x > 0){
	        if(a % x == 0 && b % x == 0){
	            return x;
	        }
	        x--;
	    }
	    return -1;
	}
	
	public static int hcf_euclidean_algo(int a,int b){
        if(b == 0) {
            return a;
        }
        else {
            return hcf_euclidean_algo(b,a%b);
        }
	}
}
```