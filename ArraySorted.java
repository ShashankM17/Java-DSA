public class ArraySorted{
	public static boolean isSorted(int idx, int array[]){
		if(idx == array.length-1){
			return true;
			
		}
		if(array[idx] < array[idx+1]){
			return isSorted(idx+1,array);
		}
		else{
			return false;
		}
		
		
		
	}
	public static void main(String args[]){
		int array[] = {2,1,5};
		System.out.println(isSorted(0,array));
	}

}