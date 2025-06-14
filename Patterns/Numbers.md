```
input : 5
output:
1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	private static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j <= i; j++) {
	            System.out.print(j+1+" ");
	        }
	        System.out.println();
	    }
	}
}
```
```
input : 5
output:
1
2 2
3 3 3
4 4 4 4 
5 5 5 5 5
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	private static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j <= i; j++) {
	            System.out.print(i+1+" ");
	        }
	        System.out.println();
	    }
	}
}
```
```
input : 5
output:
1 2 3 4 5
1 2 3 4
1 2 3 
1 2 
1
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
	            System.out.print(j + 1 + " ");
	        }
	        System.out.println();
	    }
	}
}
```