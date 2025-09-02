package com.doublyLL;

import java.util.ArrayList;
import java.util.List;

public class FindPairsOfGivenSum {

	public static void main(String[] args) {
		
		
		int sum = 17;
		int arr[] ={1,2,3,4,8,9};
		Node11 head =convertArrayToDLL(arr);
		List<List<Integer>> ans = findThePairs(head,sum);
		System.out.println(ans);
//		while(head != null) {
//			System.out.println(head.data);
//			head = head.next;
//		}
		
	}

	private static List<List<Integer>> findThePairs(Node11 head, int sum) {
		
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> pairs = new ArrayList<>();
		
		Node11 temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		Node11 left = head;
		Node11 right = temp;
		
		while(left.data < right.data) {
			if(left.data + right.data > sum) {
				right = right.back;
			}else if(left.data + right.data==sum) {
				pairs.add(left.data);
				pairs.add(right.data);
				ans.add(new ArrayList<>(pairs));
				pairs.remove(pairs.size()-1);
				pairs.remove(pairs.size()-1);
				
				left = left.next;
				right = right.back;
			}else if(left.data + right.data < sum) {
				left = left.next;
			}
		}
		
		return ans;
	}

	private static Node11 convertArrayToDLL(int[] arr) {
		Node11 head = new Node11(arr[0]);
		Node11 previous = head;
		for(int i =1;i<arr.length;i++) {
			Node11 temp = new Node11(arr[i],null,previous);
			previous.next = temp;
			previous = temp;
		}
		return head;
		
		
	}

}
class Node11{
	int data;
	Node11 next;
	Node11 back;
	public Node11(int data, Node11 next, Node11 back) {
		super();
		this.data = data;
		this.next = next;
		this.back = back;
	}
	public Node11(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}
	
}