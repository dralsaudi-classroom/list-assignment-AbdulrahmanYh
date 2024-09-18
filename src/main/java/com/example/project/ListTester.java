package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
        // Write the method circularLeftShift, user of List ADT, that takes as input a non-empty
        // List list and an integer n > 0 and performs n circular left shift of the list.
        // Example 2.1. Given the list l : A, B, C, D, E, circularShiftLeft(l, 1) results in
        // B, C, D, E, A, circularShiftLeft(l, 2) results in C, D, E, A, B.
        
		while (n > 0) {
			list.findFirst();
			T temp = list.retrieve();
			list.remove();
			while (!list.last())
				list.findNext();
			list.insert(temp);
			n--;

		}

	
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
        // Write the method reverseCopy, user of DoubleLinkedList, which copies the elements
        // of l1 to l2 in reverse order. The list l1 must not change. Assume that l2 is empty.
        // The method signature is public static <T> void reverseCopy(DoubleLinkedList<T> l1,
        // DoubleLinkedList<T> l2).
        // Example 4.1. If l1 : A ↔ B ↔ C ↔ D, then calling reverseCopy(l1, l2) results in
        // l2 : D ↔ C ↔ B ↔ A.
        
		while (!l1.last()) {
			l1.findNext();
		}
		while (l1.retrieve()!=null) {
			l2.insert(l1.retrieve());
			if(l1.first())
				break;
			l1.findPrevious();

		}
    }
}
