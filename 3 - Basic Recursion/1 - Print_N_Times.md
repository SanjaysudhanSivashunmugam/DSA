# Print N Times
```
Hello...
Hello...
Hello...
```
```java
class Recursion {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n) {
        if(n > 3) {
            return;
        }
        System.out.println("Hello...");
        print(n + 1);
    }
}
```