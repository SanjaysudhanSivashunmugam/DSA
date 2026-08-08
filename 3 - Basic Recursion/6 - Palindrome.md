# Palindrome
```
Input : MADAM
Output: true
```
```java
class Recursion {
    public static void main(String[] args) {
       String str = "MADAM";
       int n = str.length();
       System.out.println(palindrome(str, 0, n - 1));
    }

    public static boolean palindrome(String str, int i, int n) {
        if(i >= n) {
            return true;
        }       
        if(str.charAt(i) != str.charAt(n)) {
            return false;
        }
        return palindrome(str, i + 1, n - 1);
    }
}
```