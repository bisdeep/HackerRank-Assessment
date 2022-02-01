#When they hit you with the output as a List of Integer Lists
#on the Java version... it's easier to go into python...

def merge(intervals):
    if len(intervals) <= 1:
    # if we only have one or 0 intervals... just return the input as it is
        return intervals

    intervals.sort(key=lambda x:(x[0]))
    # sorting is mandatory for this algorithm, or else merging will be very messy
    # and we want to sort by the first element
    output = [intervals[0]]
    # insert the first subarray into our output
    for interval in intervals[1:]:
        if output[-1][1] >= interval[0]:
            # if the current interval we are looking at has a smaller first index
            # than the 2nd element of the previous interval
            output[-1][1] = max(output[-1][1], interval[1])
            # change the 2nd element of that previous interval
        else:
            output.append(interval)
    return output

intervals = [[1,3],[2,6],[8, 10],[15, 18]]
print(merge(intervals))