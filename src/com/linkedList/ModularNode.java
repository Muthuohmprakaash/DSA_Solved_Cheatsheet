package com.linkedList;


public class ModularNode {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5 };
		int k = 3;

		Node30 head = convertArrayToLL(arr);
		int answer = findModularNode(head, k);
		System.out.println(answer);
		

	}

	private static int findModularNode(Node30 head, int k) {
	int i =1;
	Node30 temp = head;
	Node30 dummy = new Node30(-1);
	while(temp != null) {
		if(i % k==0) {
			dummy.data = temp.data;
		}
		i++;
		temp = temp.next;
		
	}
	return dummy.data;
	}

	private static Node30 convertArrayToLL(int[] arr) {
		
		Node30 head = new Node30(arr[0]);
		Node30 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node30 temp = new Node30(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}

}

class Node30 {
	int data;
	Node30 next;

	public Node30(int data, Node30 next) {
		this.data = data;
		this.next = next;
	}

	public Node30(int data) {
		this.data = data;
		this.next = null;
	}
}
