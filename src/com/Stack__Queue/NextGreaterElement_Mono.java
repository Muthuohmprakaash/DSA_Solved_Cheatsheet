package com.Stack__Queue;


import java.util.Stack;

public class NextGreaterElement_Mono {

	public static void main(String[] args) {
		int arr[] = {4,12,5,3,1,2,5,3,1,2,4,6};
		
		int[] ans =findTheNGEArr(arr);
		for(int i =0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

	private static int[] findTheNGEArr(int[] arr) {
		
		int NGE[] = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = arr.length-1;i>=0;i--) {
			if(st.isEmpty()) {
				NGE[i] = -1;
				st.push(arr[i]);
			}else if(st.peek() > arr[i]) {
				NGE[i] = st.peek();
				st.push(arr[i]);
			}else {
				while(st.peek()<=arr[i]) {
					st.pop();
					if(st.isEmpty()) {
						NGE[i] = -1;
						st.push(arr[i]);
						break;
					}
				}
				
				if(st.peek() > arr[i]) {
					NGE[i]=st.peek();
					st.push(arr[i]);
				}
			}
			
			
			
		}
		
		return NGE;
	}

}
