# Pattern 13

```
A 
A B 
A B C 
A B C D 
A B C D E 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            
            for(char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```