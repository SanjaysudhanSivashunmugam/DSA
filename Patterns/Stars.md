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
	        for(int j = 0; j < i + 1; j++) {
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
```
input : 3
output:
    *
  * * *
* * * * *
* * * * *
  * * *
    *   
```
```java
public class Main {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
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
**
***
**** 
***** 
****
***
**
*   
```
```java
public class Main {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= 2*n - 1; i++) {
            int stars = i;
            if(i > n) {
                stars = 2 * n - i;
            }
            for(int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
```
input : 5
output:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*   
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
	    int zero = 0;
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n-i; j++) {
	            System.out.print("*");
	        }
	        for(int j = 0; j < zero ; j++) {
	            System.out.print(" ");
	        }
	        for(int j = 0; j < n-i; j++) {
	            System.out.print("*");
	        }
	        zero += 2;
	        System.out.println();
	    }
	    zero = 2*n - 2;
	    for(int i = 0; i < n;i++) {
	        for(int j = 0; j <= i; j++) {
	            System.out.print("*");
	        }
	        for(int j = 0; j < zero; j++){
	            System.out.print(" ");
	        }
	        for(int j = 0; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	        zero -= 2;
	    }
	}
}
```
```
input : 5
output:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	public static void pattern(int n) {
	    int space = 2*n-2;
	    for(int i = 0; i < 2*n -1;i++) {
	        //stars
	        int stars = i+1;
	        if(n <= i) stars = 2*n - i -1;
	        for(int j = 0; j < stars; j++) {
	            System.out.print("*");
	        }
	        //space
	        for(int j = 0;j<space;j++) {
	            System.out.print(" ");
	        }
	        //stars
	        for(int j = 0; j < stars; j++) {
	            System.out.print("*");
	        }
	        if(i >= n-1) {
	            space += 2;
	        }
	        else{
	            space -= 2;
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
*       * 
*       * 
*       * 
* * * * * 
```
```java
public class Main
{
	public static void main(String[] args) {
		pattern(5);
	}
	public static void pattern(int n) {
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            if(i == 0 || j == 0 || i == n-1 || j == n-1){
	                System.out.print("* ");
	            }
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}
}
```