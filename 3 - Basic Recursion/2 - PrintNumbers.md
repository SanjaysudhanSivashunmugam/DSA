## Print 1 to N 
```
1
2
3
4
5
```
```java
class Recursion {
    public static void main(String[] args) {
        print(1, 5);
    }

    public static void print(int i, int n) {
        if(i > n) {
            return;
        }
        System.out.println(i);
        print(i + 1, n);
    }
}
```
## Print N to 1
```
5
4
3
2
1
```
```java
class Recursion {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        if(n < 1) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
}
```