package com.linkedList;
/*
 *        1 -> 8 -> 18 -> 29
 * 
 *        |    |    |    
 *        v	   v    v    
 * 
 *        2    10   22 
 *        
 *        |    |    
 *		  v    v    
 *
 *		  3    15
 * 
 * 		  
 * 		
 * 
 * 
*/

public class FlattenLL {

	public static void main(String[] args) {
		Node29 head = new Node29(1);
        head.bottom = new Node29(2);
        head.bottom.bottom = new Node29(3);
      
      

        head.next = new Node29(8);
        head.next.bottom = new Node29(10);
        head.next.bottom.bottom = new Node29(15);

        head.next.next = new Node29(18);
        head.next.next.bottom = new Node29(22);
   

        head.next.next.next = new Node29(29);
        
        Node29 ans = flattenLL(head);
        while(ans != null) {
        	System.out.println(ans.data);
        	ans = ans.bottom;
        }
	}

	private static Node29 flattenLL(Node29 head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node29 mergedHead =flattenLL(head.next);
		return mergeLL(head,mergedHead);
		
	}

	private static Node29 mergeLL(Node29 l1, Node29 l2) {
		Node29 dummy = new Node29(-1);
		Node29 temp = dummy;
		while(l1 != null && l2 != null) {
			if(l1.data < l2.data) {
				temp.bottom = l1;
				temp = temp.bottom;
				l1 = l1.bottom;
			}else {
				temp.bottom = l2;
				temp = temp.bottom;
				l2 = l2.bottom;
			}
		}
		if(l1 == null) {
			temp.bottom = l2;
			temp = temp.bottom;
		}else {
			temp.bottom = l1;
			temp = temp.bottom;
		}
		return dummy.bottom;
		
	}

}
class Node29 {
    int data;
    Node29 next, bottom;

    Node29(int newData) {
        data = newData;
        next = bottom = null;
    }

	public Node29(int data, Node29 next, Node29 bottom) {
		super();
		this.data = data;
		this.next = next;
		this.bottom = bottom;
	}
    
}

