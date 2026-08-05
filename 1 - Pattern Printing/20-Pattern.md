# Pattern 20

```
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        int space1 = 0;
        for(int i = 0; i < n; i++) {
            
           for(int j = 0; j < n - i; j++) {
              System.out.print("* ");
           }
           
           for(int j = 0; j < space1; j++) {
               System.out.print("  ");
            }
            for(int j = 0; j < n - i; j++) {
               System.out.print("* ");
            }
            space1 += 2;
            System.out.println();
        }
        space1 = 2 * n - 2;
        for(int i = 0; i < n; i++) {
            
           for(int j = 0; j <= i; j++) {
              System.out.print("* ");
           }
           
           for(int j = 0; j < space1; j++) {
               System.out.print("  ");
            }
            for(int j = 0; j <= i; j++) {
               System.out.print("* ");
            }
            space1 -= 2;
            System.out.println();
        }
    }
}
```