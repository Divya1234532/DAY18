import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] arr) {
        int count = 1;
        int n = arr.length;

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        int end = arr[0][1];

        for (int i = 1; i < n; i++) {
            if (arr[i][0] <= end) {
                continue;
            } else {
                count++;
                end = arr[i][1];
            }
        }

        return count;
    }
}
