package binary_search;

public class Binary {
public static void main(String args[]) {
	int[] arr = {1,2,3,4,5};
	int target = 4;
	
	int first = 0;
	int end = arr.length - 1;
	while(first <= end) {
		int mid = first + end / 2;
		if(arr[mid] > target) {
			end = mid - 1;
		}else if(arr[mid] < target) {
			first = mid + 1;
		}else {
			System.out.print(mid);
			return;
		}
	}
}
}
