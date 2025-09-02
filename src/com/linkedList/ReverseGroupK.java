package com.linkedList;
public class ReverseGroupK {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7,8 };
		int k = 4;
		Node25 head = convertArrayToLL(arr);
		head = reverseGroupK(head, k);
		Node25 temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}

	}

	private static Node25 reverseGroupK(Node25 head, int k) {
		Node25 temp = head;	
		Node25 nextNode = null;
		Node25 prev = null;

		while (temp != null) {
			Node25 kthNode = getKthNode(temp, k);
			if(kthNode==null) {
				if(prev!=null) {
					prev.next = temp;
					break;
				}
			}
			nextNode = kthNode.next;

			kthNode.next = null;
			reverse(temp);
			if (temp != head) {
				prev.next = kthNode;
			}
			prev = temp;

			if (head == temp) {
				head = kthNode;
			}
			temp = nextNode;
			kthNode = temp;
		

		}

		return head;
	}

	private static Node25 getKthNode(Node25 temp, int k) {
		k = k - 1;
		while (temp != null && k > 0) {
			k--;
			temp = temp.next;
		}
		return temp;
	}

	private static Node25 reverse(Node25 head) {
		Node25 temp = head;
		Node25 prev = null;

		while (temp != null) {
			Node25 nextNode = temp.next;

			temp.next = prev;
			prev = temp;

			temp = nextNode;
		}
		return prev;
	}

	private static Node25 convertArrayToLL(int[] arr) {
		Node25 head = new Node25(arr[0]);
		Node25 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node25 temp = new Node25(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;

	}

}

class Node25 {
	int data;
	Node25 next;

	public Node25(int data, Node25 next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node25(int data) {
		super();
		this.data = data;

	}

}
