public class ArrayPalindrome{
	public static boolean isPalindrome(int[] array){
		int start = 0;
		int end = array.length-1;
		while(start < end){
		    if(array[start] == array[end]){
				return true;

		    }
			start++;
			end--;
				         
		}
			return false;
	}
	
	public static void PrintArray(int arr[]){
		int n = arr.length-1;
		for(int i = n; i>=0; i--){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void main(String args[]){

	}
}