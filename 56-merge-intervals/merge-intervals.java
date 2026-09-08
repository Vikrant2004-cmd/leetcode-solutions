class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int lowerRange = intervals[0][0];
        int upperRange = intervals[0][1];
        List<int[]> result = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= upperRange) {
                upperRange = Math.max(upperRange, intervals[i][1]);

            } else {

                result.add(new int[]{lowerRange, upperRange});

                lowerRange = intervals[i][0];
                upperRange = intervals[i][1];
            }
        }

        result.add(new int[]{lowerRange, upperRange});

        return result.toArray(new int[result.size()][]);
    }
}