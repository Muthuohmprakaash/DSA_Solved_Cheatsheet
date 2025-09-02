package com.linkedList;

public class CreateLinkedList {

	public static void main(String[] args) {
		
		int arr[] = {5,3,2,6,9};
//		Node n = new Node(arr[1],null);
//		System.out.println(n.next);
//		
//		
//		Node start = convertArrToLL(arr);
//		System.out.println(start.next);
		
		 //traversal in LL
		Node start = convertArrToLL(arr);
		Node temp = start;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	
		//length of LL
		System.out.println("-----");
		System.out.println(lengthOfLL(start));
		
		//check if the number is present
		
		System.out.println("------");
		System.out.println(checkIfPresent(start, 10));
		

	
	
		
		
		


	}
	//find length of LL
	public static int lengthOfLL(Node start) {
		int count =0;
		
		Node temp = start;
		while(temp != null) {
			
			temp = temp.next;
			count++;
		}
		
		return count;
		
	}
	private static Node convertArrToLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i =1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next=temp;
			mover = temp;
		}
		return head;
		
	}
	public static int checkIfPresent(Node start,int val) {
		
		Node temp = start;
		while(temp != null) {
			if(temp.data == val ) {
				return 1;
			}
			
			temp = temp.next;
			
		}
				
		return 0;
		
	}


}
//class Node{
//	int data;
//	Node next;
//	
//	
//	public Node(int data1,Node next1) {
//		this.data=data1;
//		this.next=next1;
//	}
//	public Node(int data2) {
//		this.data=data2;
//	}
//}
