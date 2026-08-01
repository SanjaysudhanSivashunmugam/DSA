# Pattern 15

```
A 
B B 
C C C 
D D D D 
E E E E E 
```

```java
class Main {
    public static void main(String[] args) {
        int n = 5;
        char c = 'A';
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            c++;
            System.out.println();
        }
    }
}
```