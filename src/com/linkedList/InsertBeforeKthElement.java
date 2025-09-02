package com.linkedList;
public class InsertBeforeKthElement {

	public static void main(String[] args) {
		int arr[] = {2,6,9,4,7};
		int element =10;
		int k = 9;
		Node9 head = convertArrayToLL(arr);
//		while(head != null) {
//			System.out.print(head.data);
//			head= head.next;
//		}
		head = insertbeforekthElement(element,k,head);
		while(head != null) {
		System.out.print(head.data +",");
		head= head.next;
	}
	}

	private static Node9 insertbeforekthElement(int element, int k, Node9 head) {
		if(head == null) {
			Node9 newhead = new Node9(element);
			
			return newhead;
		}
		
		if(head.data == k) {
			Node9 newheaddata = new Node9(element,head);
			return newheaddata;
		}
		Node9 temp = head;
		while(temp.next != null) {
			if(temp.next.data == k) {
				Node9 insertBeforek = new Node9(element,head);
				insertBeforek.next =temp.next;
				temp.next = insertBeforek;
				break;
			}
			temp = temp.next;
		}
		
		
		return head;
	}

	private static Node9 convertArrayToLL(int[] arr) {
		if(arr.length==0) {
			return null;
		}
		else {
		Node9 head = new Node9(arr[0]);
		Node9 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node9 temp = new Node9(arr[i]);
			mover.next= temp;
			mover = temp;
		}
		
		return head;
		}
	}

}
class Node9{
	int data;
	Node9 next;
	public Node9(int data, Node9 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node9(int data) {
		super();
		this.data = data;
	}
	
}
