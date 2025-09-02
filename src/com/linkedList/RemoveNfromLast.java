package com.linkedList;
public class RemoveNfromLast {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,5,6,7};
		int n = 3;
		
		

		Node123 head = convertArrayToLL(arr);

		head = remove(head,n);
		
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}
	private static Node123 remove(Node123 head,int n) {
		
		Node123 temp = head;
		int count = 0;
		
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		int result = count - n;
		if(result == 0) {
			Node123 newhead = head.next;
			return newhead;
		}
		Node123 mover = head;
		while(mover != null) {
			result--;
			if(result ==0) {
				mover.next = mover.next.next;
				break;
			}
			
			
			mover = mover.next;
		}
		
		return head;
	}
	private static Node123 convertArrayToLL(int[] arr) {
		

		Node123 head = new Node123(arr[0]);
		Node123 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node123 temp = new Node123(arr[i]);
			mover.next = temp;
			mover = temp;

		}
		return head;
	}


}
class Node123 {
	int data;
	Node123 next;

	public Node123(int data, Node123 next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node123(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}