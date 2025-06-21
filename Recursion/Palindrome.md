# Palindrome

```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   String str = "MADAM";
	   System.out.print(palindrome(0,str.length(), str));
	}
	
	public static boolean palindrome(int i,int n, String str){
	if(i >= n/2) {
	    return true;
	}
	
	if(str.charAt(i) != str.charAt(n-i-1)) {
	    return false;
	}
	
	return palindrome(i+1,n, str);
	}
}
```