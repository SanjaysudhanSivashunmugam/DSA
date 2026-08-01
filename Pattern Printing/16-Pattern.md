# Pattern 16

```
       1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            
            int number = 1;

            for(int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(number + " ");
                if(j > (2 * i + 1) / 2) {
                    number--;
                }
                else {
                    number++;
                }
            }
            System.out.println();
        }
    }
}
```