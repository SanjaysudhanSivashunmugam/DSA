# Pattern 18

```
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            
            int number = n - i;
            for(int j = 0; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
```