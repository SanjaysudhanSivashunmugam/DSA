# Pattern 9

```
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < 2 * n - 1; i++) {
            int stars = i;
            if(i >= n) {
                stars = 2 * n - i - 2;
            }
            for(int j = 0; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```