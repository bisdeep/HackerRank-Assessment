import java.util.*;

public class MergeIntervals{

    public static int[][] mergeIntervals(int[][] intervals) {
     if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> output_arr = new ArrayList<>();

        int[] current = intervals[0];
        output_arr.add(current);
        
        for(int[] interval: intervals){
            int current_begin = current[0];
            int current_end = current[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if (current_end >= next_begin) current[1] = Math.max(current_end, next_end);
            else {
                current = interval;
                output_arr.add(current);
            }
            
        }
        
        return output_arr.toArray(new int[output_arr.size()][]);   
    }

    public static void main(String[] args){
        int[][] a = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][]result = mergeIntervals(a);
        System.out.println(Arrays.deepToString(result));

    }
}