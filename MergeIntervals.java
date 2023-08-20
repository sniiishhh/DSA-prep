import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];

        for (int[] interval : intervals) {
            if (newInterval[1] >= interval[0]) {
                // Overlapping intervals, update newInterval's end if needed
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                // Non-overlapping interval found, add previous newInterval to result
                result.add(newInterval);
                newInterval = interval;
            }
        }

        // Add the last merged or non-overlapping interval
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int intervals[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
 