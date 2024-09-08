/*Some Key Points! if we do Binary Search!
1. Make Sure The Array Must Be Sort(Ascending or desending Order.)!
2. We Have To Find The Middle Of The Element Of The Array By Dividing It!

 Condition.
1. If The Target Element Is > Middle Element Return -1.
2. If The Target Element Is < Middle Element Return +1.
3. If The Target Element Is = Middle Element Return Mid Element.
4. esle return -1.
*/

public class Binary_Search {
    public static void main (String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target = 4;
        int ans = binarySearch(arr, target);

        System.out.println(ans);

    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1; 

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid -1; 

            }else if (target > arr[mid]) {
                 start = mid +1;
           
            }else {
                return mid;
            }
        }
        return -1;
    }
}