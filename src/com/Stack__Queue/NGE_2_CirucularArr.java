package com.Stack__Queue;

import java.util.Stack;

public class NGE_2_CirucularArr {

	public static void main(String[] args) {
		int arr[] = { 100, 1, 11, 1, 120, 111, 123, 1, -1, -100 };

		int[] ans = findTheNGE(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] findTheNGE(int[] nums) {
		/*
		 * my solving .....
		 * 
		 * 
		 * 
		 * Stack<Integer> st = new Stack<Integer>();
		 * 
		 * int NGE[] = new int[arr.length]; for (int i = 2 * arr.length - 1; i >= 0;
		 * i--) { if (i < arr.length) { while (i >= 0) { if (st.isEmpty()) { NGE[i] =
		 * -1; st.push(arr[i]); i--; } else if (st.peek() > arr[i]) { NGE[i] =
		 * st.peek(); st.push(arr[i]); i--; } else { while (!st.isEmpty() && st.peek()
		 * <= arr[i]) { st.pop(); } if (st.isEmpty()) { NGE[i] = -1; st.push(arr[i]);
		 * }else { NGE[i]=st.peek(); st.push(arr[i]);
		 * 
		 * } i--; }
		 * 
		 * } } else if (st.isEmpty()) { // NGE[i % arr.length] = -1; st.push(arr[i %
		 * arr.length]); } else if (st.peek() > arr[i % arr.length]) { // NGE[i %
		 * arr.length] = st.peek(); st.push(arr[i % arr.length]); } else { while
		 * (!st.isEmpty() && st.peek() <= arr[i % arr.length]) { st.pop(); } if
		 * (st.isEmpty()) { // NGE[i % arr.length] = -1; st.push(arr[i % arr.length]);
		 * }else { // NGE[i % arr.length]=st.peek(); st.push(arr[i % arr.length]);
		 * 
		 * } }
		 * 
		 * }
		 * 
		 * return NGE;
		 * 
		 * 
		 */

		// TUF solving
		int n = nums.length;
		int nge[] = new int[n];
		Stack<Integer> st = new Stack<>();
		for (int i = 2 * n - 1; i >= 0; i--) {
			while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
				st.pop();
			}

			if (i < n) {
				if (st.isEmpty() == false)
					nge[i] = st.peek();
				else
					nge[i] = -1;
			}

			st.push(nums[i % n]);
		}
		return nge;
	}

}
