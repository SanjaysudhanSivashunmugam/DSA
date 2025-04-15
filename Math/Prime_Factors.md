# Print Prime Factors
```java
public class Main
{
	public static void main(String[] args) {
		printFactors(450);
	}
	public static void printFactors(int a){
	    for(int i = 2; i * i <= a; i++) {
	        while(a % i == 0){
	            System.out.print(i+" ");
	            a = a / i;
	        }
	    }
	    if(a > 1){
	        System.out.print(a);
	    }
	}
}
```