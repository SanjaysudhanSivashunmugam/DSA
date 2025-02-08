# Linked List in JAVA

## Singly Linked List using class

```java
class LinkedList {
    Node head;
    
    class Node {
        int data;
        Node next;
        
        Node(int n) {
            data = n;
            next = null;
        }
    }
    
    LinkedList() {
        head = null;
    }
    
    void insertAtBeginning(int val) {
        Node nn = new Node(val);
        if(head == null) {
            head = nn;
        }
        else {
            nn.next = head;
            head = nn;
        }
    }
    
    void print() {
        if(head == null){
            System.out.println("The List is Empty");
        }
        else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    void insertAtPos(int val, int pos) {
        if(pos == 0) {
            insertAtBeginning(val);
            return;
        }
        
        Node nn = new Node(val);
        Node temp = head;
        for(int i = 0; i < pos - 1; i++) {
            temp = temp.next;
            if(temp == null) {
                System.out.println("Invalid Position");
                return;
            }
        }
        nn.next = temp.next;
        temp.next = nn;
    }
    
    void deleteAtPos(int pos) {
        
        if(pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        for(int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        } 
        
        prev.next = temp.next;
    }
}

public class Main
{
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 
		list.print();
		list.insertAtBeginning(10);
		list.insertAtBeginning(11);
		list.insertAtBeginning(12);
		list.insertAtPos(100,0);
		list.insertAtBeginning(13);
		list.insertAtBeginning(14);
		list.deleteAtPos(0);
		list.print();
		
	}
}
```
