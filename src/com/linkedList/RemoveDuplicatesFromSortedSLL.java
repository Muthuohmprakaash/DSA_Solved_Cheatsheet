package com.linkedList;
public class RemoveDuplicatesFromSortedSLL {

	public static void main(String[] args) {
		int [] arr = {1,1,2,3};
		
		Node34 head = convertArrayToLL(arr);
		// Node34 ans = RemoveDuplicates(head);
		Node34 temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}

	}

	// private static Node34 RemoveDuplicates(Node34 head) {
	// 	Node34 temp = head;
	// 	while(temp != null) {
	// 		Node34 nextNode = temp.next;
	// 		while(nextNode != null && nextNode.data == temp.data) {
	// 			nextNode = nextNode.next;
	// 		}
	// 		temp.next = nextNode;
	// 		temp = nextNode;
	// 	}
	// 	return head;
		
	// }

	private static Node34 convertArrayToLL(int[] arr) {
		Node34 head = new Node34(arr[0]);
		Node34 mover = head;
		
		for(int i =1;i<arr.length;i++){
			Node34 temp = new Node34(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
		
	}

}
class Node34{
	int data;
	Node34 next;
	
	public Node34(int data, Node34 next) {
		this.data = data;
		this.next = next;
	}
	
	public Node34(int data) {
		this.data = data;
		this.next = null;
	}

}
