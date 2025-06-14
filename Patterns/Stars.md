```
input : 5
output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	private static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
```
```
input : 5
output:
* 
* *
* * *
* * * *
* * * * *
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	private static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
```
```
input : 5
output:
* * * * *
* * * *
* * *
* * 
* 
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	private static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n - i; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
```
```
```
input : 3
output:
    * 
  * * *
* * * * *
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(3);
	}
	
	private static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n - i - 1; j++) {
	            System.out.print("  ");
	        }
	        for(int j = 0; j < i * 2 + 1; j++) {
	            System.out.print("* ");
	        }
	        for(int j = 0; j < n - i - 1; j++) {
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
	}
}
```
```
```
input : 3
output:
* * * * *
  * * *
    *   
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	private static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < i; j++) {
	            System.out.print("  ");
	        }
	        for(int j = 0; j < (2 * n) - (2*i+1); j++) {
	            System.out.print("* ");
	        }
	        for(int j = 0; j < i; j++) {
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
	}
}
```
