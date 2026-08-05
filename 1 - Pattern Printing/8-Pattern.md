# Pattern 8

```
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            // Space
            for(int j = 0; j < i; j ++) {
                System.out.print("  ");
            }

            // Stars
            for(int j = 0; j < 2 * n - (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```