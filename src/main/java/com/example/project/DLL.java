package com.example.project;

public class DLL<T> {
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(empty()) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
    public void removeBetween(T e1, T e2) {
    
		 current = head;

		 
		    while (current != null && !current.data.equals(e1)) {
		        current = current.next;
		    }

		
		    if (current == null) return;

		  
		    DLLNode<T> e1Node = current;
		    current = current.next;
		    
		    while (current != null && !current.data.equals(e2)) {
		        current = current.next;
		    }

		    if (current == null || e1Node.next == current) return;

		    DLLNode<T> e2Node = current;
		    DLLNode<T> nodeToRemove = e1Node.next;

		    while (nodeToRemove != e2Node) {
		        DLLNode<T> nextNode = nodeToRemove.next; 
		        nodeToRemove.previous.next = nodeToRemove.next;
		        nodeToRemove.next.previous = nodeToRemove.previous;
		        nodeToRemove = nextNode; 
		    }

		    
		    current = head;
	}
    }

