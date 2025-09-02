package com.patterns;

public class Pattern22 {
    public static void main(String[] args) {
        pattern22(4);
    }

    private static void pattern22(int n) {
        int topDistance = 0;
        int bottomDistance = 0;
        int leftDistance = 0;
        int rightDistance = 0;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                topDistance = i;
                bottomDistance = 2 * n - 2 - i;
                leftDistance = j;
                rightDistance = 2 * n - 2 - j;

                int finalMin = findMin(topDistance, leftDistance, rightDistance, bottomDistance);
                System.out.print(n - finalMin);
            }
            System.out.println();
        }
    }

    private static int findMin(int topDistance, int leftDistance, int rightDistance, int bottomDistance) {

        int min = Integer.MAX_VALUE;
        if (topDistance < min) {
            min = topDistance;
        }
        if (leftDistance < min) {
            min = leftDistance;
        }
        if (rightDistance < min) {
            min = rightDistance;
        }
        if (bottomDistance < min) {
            min = bottomDistance;
        }

        return min;
    }

}
