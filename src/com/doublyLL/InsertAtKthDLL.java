package com.doublyLL;

public class InsertAtKthDLL {

	public static void main(String[] args) {
		
		int place = 3;
		int val = 4;
		int arr[]= {7,3,5,2,1};
		Node7 head = convertArrayToDLL(arr);
		head = insertAtKthElementDLL(head,val,place);
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}

	private static Node7 insertAtKthElementDLL(Node7 head, int val, int place) {
		
		
		int count =0;
		Node7 temp = head;
		while(temp !=null) {
			count++;
			if(count == place) {
				break;
			}
			temp = temp.next;
		}
		Node7 prev=temp.back;
	
		Node7 newnode = new Node7(val,temp,prev);
		prev.next=newnode;
		temp.back=newnode;
		
		return head;
	}

	private static Node7 convertArrayToDLL(int[] arr) {
		
		Node7 head = new Node7(arr[0]);
		Node7 prev = head;
		for(int i =1;i<arr.length;i++) {
			Node7 temp = new Node7(arr[i],null,prev);
			prev.next=temp;
			prev = temp;
		}
		return head;
	}

}
class Node7{
	int data;
	Node7 next;
	Node7 back;
	public Node7(int data, Node7 next, Node7 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}
	public Node7(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}
	
}
