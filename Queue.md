# Queue in Java
## Queue using Array
```java
class Queue {
    int arr[];
    int front, rear;
    int size = 1000;
    
    Queue() {
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    
    void enqueue(int val) {
        if(rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        if(front == -1) {
            front++;
        }
        arr[++rear] = val;
    }
    
    int dequeue() {
        if(front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return 0;
        }
        
        return arr[front++];
    }
}

public class Main
{
	public static void main(String[] args) {
		Queue qu = new Queue();
		qu.enqueue(10);
		qu.enqueue(11);
		qu.enqueue(12);
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		qu.enqueue(13);
		qu.enqueue(14);
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
	}
}
```
## Queue using Linked List
```java
class Queue {
    Node front;
    Node rear;
    class Node {
        int data;
        Node next;
        
        Node(int val) {
            data = val;
            next = null;
        }
    }
    
    Queue() {
        front = null;
        rear = null;
    }
    
    void enqueue(int val) {
        Node nn = new Node(val);
        if(front == null) {
            front = nn;
            rear = nn;
        }
        else {
            rear.next = nn;
            rear = nn;
        }
    }
    
    int dequeue() {
        if(front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        return temp;
    }
}

public class Main
{
	public static void main(String[] args) {
		Queue qu = new Queue();
		qu.enqueue(10);
		qu.enqueue(11);
		qu.enqueue(12);
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		qu.enqueue(13);
		qu.enqueue(14);
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
	}
}
```
