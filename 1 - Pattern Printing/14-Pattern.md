# Pattern 14

```
A B C D E 
A B C D 
A B C 
A B 
A 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            
            for(char j = 'A'; j < 'A' + (n - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```