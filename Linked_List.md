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
    
    void reverse() {
       Node curr = head;
       Node next = null;
       Node prev = null;
       
       while(curr != null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       
       head = prev;
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
		list.reverse();
		list.print();
		
	}
}
```

## Doubly Linked List using Java

```java
class DoublyLinkedList {
    Node head;
    Node tail;
    
    class Node {
        int data;
        Node next;
        Node prev;
        
        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }
    
    DoublyLinkedList(){
        head = null;
        tail = null;
    }
    
    void insertAtBeginning(int val) {
        Node nn = new Node(val);
        if(head == null) {
            head = nn;
            tail = nn;
        }
        else {
            head.prev = nn;
            nn.next = head;
            head = nn;
        }
    }
    
    void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    void printReverse() {
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
    void insertAtPos(int pos,int val) {
        if(pos == 0) {
            insertAtBeginning(val);
            return;
        }
        else{
            Node nn = new Node(val);
            Node temp = head;
            for(int i = 0;i < pos - 1; i++) {
                temp = temp.next;
                if(temp == null){
                    System.out.println("Invalid Position");
                    return;
                }
            }
            if(temp.next == null){
                temp.next = nn;
                nn.prev = temp;
                tail = nn;
                return;
            }
                nn.next = temp.next;
                temp.next.prev = nn;
                temp.next = nn;
                nn.prev = temp;
        }
    }
    
    void deleteAtPos(int pos){
        if(pos == 0){
            head = head.next;
            head.prev = null;
        }
        else{
            Node temp = head;
            for(int i = 0; i < pos; i++){
                temp = temp.next;
            }
            if(temp.next == null){
                temp.prev.next = null;
                temp.prev = null;
                return;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev; 
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtBeginning(10);
		list.insertAtBeginning(11);
		list.insertAtBeginning(12);
		list.insertAtBeginning(13);
		list.insertAtBeginning(14);
		list.insertAtPos(5,155);
		list.print();
		list.printReverse();
		list.deleteAtPos(5);
		list.print();
	}
}

```

## Circular LinkedList using Class

```java
class CircularLinkedList {
    Node last;
    
    class Node {
        int data;
        Node next;
        
        Node(int val) {
            data = val;
            next = null;
        }
    }
    
    CircularLinkedList() {
        last = null;
    }
    
    void insertAtBeginning(int val) {
        Node nn = new Node(val);
        if(last == null) {
            last = nn;
            nn.next = nn;
        }
        else {
            nn.next = last.next;
            last.next = nn; 
        }
    }
    
    void insertAtEnd(int val) {
        Node nn = new Node(val);
        if(last == null) {
            last = nn;
            nn.next = nn;
        }
        else {
            nn.next = last.next;
            last.next = nn;
            last = nn;
        }
    }
    
    void print() {
        Node temp = last.next;
        while(temp != last){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
        System.out.println();
    }
    
    void deleteAtBeginning() {
        if(last == null) {
            System.out.println("List is Empty");
            return;
        }
        if(last.next == last) {
            last = null;
        }
        else{
            last.next = last.next.next;
        }
    }
    
    void deleteAtEnd() {
        if(last == null) {
            System.out.println("List is Empty");
            return;
        }
        if(last.next == last) {
            last = null;
        }
        Node temp = last.next;
        while(temp.next != last){
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp;
    }
}


public class Main
{
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertAtBeginning(10);
		list.insertAtBeginning(11);
		list.insertAtBeginning(12);
		list.insertAtBeginning(13);
		list.insertAtBeginning(14);
		list.insertAtBeginning(15);
		list.deleteAtBeginning();
		list.print();
		list.deleteAtEnd();
		list.print();
		list.deleteAtEnd();
		list.print();
	}
}

```
