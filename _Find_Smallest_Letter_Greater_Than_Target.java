package binary_search;

public class _Find_Smallest_Letter_Greater_Than_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = {'c','f','j'};
		System.out.print(nextGreatestLetter(array,'c'));
	}
    static char nextGreatestLetter(char[] letters, char target) {
        int start  = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + end / 2;
            if(letters[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

}
