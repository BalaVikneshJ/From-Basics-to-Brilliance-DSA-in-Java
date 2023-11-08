package binary_search;

public class Binary {
	static int ceiling(int[] arr,int target) {
		int first = 0;
	    int end = arr.length - 1;
	    int mid = 0;
	    while (first <= end) {
	        mid = (first + end) / 2; // Corrected the calculation of mid
	        if (arr[mid] > target) {
	            end = mid - 1;
	        } else if (arr[mid] < target) {
	            first = mid + 1;
	        } else {
	        	return mid;
	        }
	    }
	    return end;
	}
	 
	public static void main(String args[]) {
	    int[] arr = {1, 2, 3, 5, 6};
	    int target = 4;
	    int bala = ceiling(arr,target);
	    System.out.print(bala);
	}






}
