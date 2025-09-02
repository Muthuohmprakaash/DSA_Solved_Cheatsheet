package com.binarySearch;

public class FindNthRootOfM {

	public static void main(String[] args) {
		int n = 4;
		int m = 256;

		System.out.println(findTheNthRoot(n, m));

	}

	private static int findTheNthRoot(int n, int m) {
		
			int low = 1;
			int high = m;
			
			while(low<=high) {
				int mid = (low+high)/2;
				if(find(mid,n ,m) == 0) {
					return mid;
				}else if(find(mid,n,m) == -1) {
					high = mid -1;
				}else {
					low = mid +1;
				}
				
				
			}
			
			
			return -1;
	}

	private static int find(int mid, int n, int m) {
		long ans = 1;
		for (int i = 0; i < n; i++) {
			ans = ans * mid;
			if (ans > m) {
				return -1;
			}
		}
		if(ans == m) {
			return 0;
		}
		return 2;
	}

}
