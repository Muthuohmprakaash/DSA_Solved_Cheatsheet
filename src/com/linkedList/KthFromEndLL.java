package com.linkedList;
public class KthFromEndLL {

	public static void main(String[] args) {
		
		int arr[]= {23 ,89, 50 ,30 ,72};
		Node21 head = convertArrayToLL(arr);
		int k =5;
		System.out.println(findtheKth(head,k));
		
		
//		while(head!=null) {
//			System.out.print(head.data+"-->");
//			head = head.next;
//		}

	}

	private static int findtheKth(Node21 head, int k) {
		 Node21 temp = head;
	       int count =0;
	       while(temp != null){
	           count++;
	           temp = temp.next;
	       }
	       count = count - k;
	       if(count == 0) {
	    	   return head.data;
	       }
	       Node21 finder = head;
	       while(count > 0 && count != 0 ){
	           finder = finder.next;
	           count--;
	           if(count == 0){
	               return finder.data;
	           }
	       }
	       return -1;
		
	}



	private static Node21 convertArrayToLL(int[] arr) {
		Node21 head = new Node21(arr[0]);
		Node21 mover = head;
		for(int i =1;i<arr.length;i++) {
			Node21 temp = new Node21(arr[i]);
			mover.next=temp;
			mover = temp;
			
		}
		return head;
	}

}
class Node21{
	int data;
	Node21 next;
	public Node21(int data, Node21 next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node21(int data) {
		super();
		this.data = data;
	}
	
}
