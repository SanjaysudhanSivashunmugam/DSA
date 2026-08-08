# Sum of First N Numbers
```
15
```
```java
// Parameterised Recursion
class Recursion {
    public static void main(String[] args) {
        sum(5,0);
    }

    public static void sum(int n, int s) {
        if(n < 1) {
            System.out.println(s);
            return;
        }
        sum(n - 1, s + n);
    }
}
```
```java
// Functional Recursion
class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
```