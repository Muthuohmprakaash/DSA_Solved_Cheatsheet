package com.binarySearch;

public class CapacityToShipPackages {

	public static void main(String[] args) {
		
		int weights[] = {10,50,100,100,50,100,100,100};
		int days = 5;
		
		System.out.println(findTheCapacity(weights,days));

	}

	private static int findTheCapacity(int[] weights, int days) {
		
		 int low = Integer.MIN_VALUE, high = 0;
	        for (int i = 0; i < weights.length; i++) {
	            high += weights[i];
	            low = Math.max(low, weights[i]);
	        }
		
		
		while(low<=high) {
			int mid = (low+high)/2;
			int noOfDays = findDays(weights,mid,days);
			if(noOfDays <= days) {
				high = mid -1;
			}else {
				low = mid + 1;
			}
			
			
		}
		return low;
		
	}

	// private static int findSum(int[] weights) {
	// 	int sum = 0;
		
	// 	for(int i =0;i<weights.length;i++) {
	// 		sum = sum + weights[i];
	// 	}
	// 	return sum;
	// }

	private static int findDays(int[] weights, int CapacityOfShip, int days) {
		int daysWeights = 0;
		int day = 1;
		for(int i =0;i<weights.length;i++) {
			if( weights[i] + daysWeights  > CapacityOfShip) {
				day = day +1;
				daysWeights = weights[i];
			}else {
				  daysWeights = daysWeights + weights[i];
			}
			
		}
		
		return day;
	}

	// private static int findmax(int[] weights) {
	// 	int max = Integer.MIN_VALUE;
	// 	for(int i =0;i<weights.length;i++) {
	// 		max = Math.max(max, weights[i]);
	// 	}
	// 	return max;
	// }

}
