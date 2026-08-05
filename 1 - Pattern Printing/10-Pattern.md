# Pattern 10

```
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                number = 1;
            }
            else {
                number = 0;
            }
           for(int j = 0; j <= i; j++) {
               System.out.print(number + " ");
               number = 1 - number;
           }
            System.out.println();
        }
    }
}
```