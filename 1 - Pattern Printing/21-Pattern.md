# Pattern 21

```
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
class Main {
    public static void main(String[] args) {
        int n = 5;
        int space = 2 * n - 2;
        for(int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if(i > n) {
               stars = 2 * n - i;
            }
            for(int j = 0; j < stars; j++) {
               System.out.print("*");
            }

            for(int j = 0; j < space; j++) {
               System.out.print(" ");
            }

            for(int j = 0; j < stars; j++) {
               System.out.print("*");
            }

            if(i < n) {
               space -= 2;
            }
            else {
               space += 2;
            }

            System.out.println();
        }       
    }
}
```