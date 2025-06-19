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
```
input : 5
output:
1
0 1
0 1 0
1 0 1 0 
1 0 1 0 1
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		int a = 1;
	    for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				a = 1;
			}
			else{
			    a = 0;
			}
	        for(int j = 0; j < i + 1; j++) {
	            System.out.print(a+" ");
	            a = 1 - a;
	        }
	        System.out.println();
	    }
	}
}
```
```
input : 4
output:
1             1 
1 2         2 1 
1 2 3     3 2 1 
1 2 3 4 4 3 2 1 
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(4);
	}
	
	public static void pattern(int n) {
	    int space = 2 * (n-1);
		for(int i = 0; i < n; i++) {
		    for(int j = 0; j <= i; j++) {
		        System.out.print(j+1+" ");
		    }
		    for(int j = 0; j < space;j++) {
		        System.out.print("  ");
		    }
		    for(int j = i+1; j > 0; j--) {
		        System.out.print(j+" ");
		    }
		    System.out.println();
		    space -= 2;
		}
	}
}
```
```
input : 5
output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```
```
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
	    int number = 1;
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j <= i; j++) {
	            System.out.print(number++ + " ");
	        }
	        System.out.println();
	    }
	}
}
```