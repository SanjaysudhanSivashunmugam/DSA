```
input : 5
output:
A 
A B 
A B C
A B C D
A B C D E 
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(char ch = 'A'; ch <= 'A' + i; ch++){
	            System.out.print(ch+" ");
	        }
	        System.out.println();
	    }
	}
}
```
```
input : 5
output:
A B C D E
A B C D
A B C
A B
A 
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(char ch = 'A'; ch < 'A' + n - i; ch++) {
	            System.out.print(ch+" ");
	        }
	    System.out.println();
	    }
	}
}
```
```
input : 5
output:
A 
B B
c c c
D D D D
E E E E E
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
	    char ch = 'A';
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j <= i; j++) {
	            System.out.print(ch+" ");
	        }
	        ch++;
	        System.out.println();
	    }
	}
}
```