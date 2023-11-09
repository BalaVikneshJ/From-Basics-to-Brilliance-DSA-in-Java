package binary_search;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int[] result = searchRange(nums,8);
		System.out.println(Arrays.toString(result));

	}
     static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        result[0] = start;
        result[1] = end;
        return result;
        
    }
    static int search(int[] nums,int target,boolean findstartmax) {
    	int result = 0;
    	int start = 0;
    	int end = nums.length - 1;
    	while(start <= end) {
    		int mid = start + (end - start) / 2;
    		if(target < nums[mid]) {
    			end = mid - 1;
    		}else if(target > nums[mid]) {
    			start = mid + 1;
    		}else {
    			result = mid;
    			if(findstartmax) {
    				end = mid - 1;
    			}else {
    				start = mid + 1;
    			}
    		}
    	}
    	return result;
    }
}
