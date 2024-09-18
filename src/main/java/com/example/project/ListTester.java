package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
       
        if(list.empty()|| n<=0)
			return;
		while (n > 0) {
			list.findFirst();
			if(list.retrieve()==null)return;
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
