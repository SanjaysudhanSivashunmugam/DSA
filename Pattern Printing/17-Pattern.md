# Pattern 17

```
        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            
            char c = 'A';

            for(int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(c + " ");
                if(j > (2 * i + 1) / 2) {
                    c--;
                }
                else {
                    c++;
                }
            }
            System.out.println();
        }
    }
}
```