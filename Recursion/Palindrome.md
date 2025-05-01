# Palindrome
```java
public class Main
{
	public static void main(String[] args) {
		System.out.println(palindrome("AABBAA", 0));
	}
	
	public static boolean palindrome(String s, int i){
	    if(i > s.length()/2){
	        return true;
	    }
	    if(s.charAt(i) != s.charAt(s.length() - i - 1)){
	        return false;
	    }
	    return palindrome(s,i+1);
	}
}
```