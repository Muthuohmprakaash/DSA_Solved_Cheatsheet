package com.Stack__Queue;

import java.util.Stack;

public class AsteroidCollision {

	public static void main(String[] args) {

		int arr[] = {0, -2 ,-4, 2, -4 ,4 ,4 ,0 ,5 ,3 };

		int[] ans = DestroyTheCollision(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] DestroyTheCollision(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (st.isEmpty() || st.peek() < 0 || arr[i] > 0) {
				st.push(arr[i]);
			}else if(st.peek() == 0) {
				st.push(arr[i]);
			}
			else if (st.peek() > 0) {
				int abs = Math.abs(arr[i]);
				
				while (!st.isEmpty()  && abs > st.peek() && st.peek() > 0) {
					st.pop();
				}
				if (!st.isEmpty()  && abs == st.peek()) {
					st.pop();
				} else if (st.isEmpty() || st.peek() < 0 ) {
					st.push(arr[i]);
				}

			} else {
				int p = i;
				while (p < arr.length && st.peek() < 0) {
					st.push(arr[i]);
					p++;
				}
			}

		}

		int ans[] = new int[st.size()];
		for (int k = 0; k < ans.length; k++) {
			ans[k] = st.peek();
			st.pop();
		}
		int l = 0;
		int m = ans.length - 1;

		while (l < m) {
			int temp = ans[l];
			ans[l] = ans[m];
			ans[m] = temp;
			l++;
			m--;
		}
		
		return ans;
	}

}
