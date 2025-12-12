# Check Palindrome
```java
public class Main
{
	public static void main(String[] args) {
		String str = "madam";
		int n = str.length();
		palindrome(str, 0, n - 1);
	}
	
	static void palindrome(String str, int i, int j) {
	    if(i >= j) {
	        System.out.print("True");
	        return;
	    }
	    if(str.charAt(i) != str.charAt(j)) {
	        System.out.print("False");
	        return;
	    }
	    
	    palindrome(str, i + 1, j - 1);
	}
}
```