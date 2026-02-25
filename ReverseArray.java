public class ReverseArray{
	public static void ReversePrint(int array[]){
		int n = array.length-1;
		for(int i=n; i>=0; i--){
			System.out.println(array[i]);
			
		}
	}
	
	
	public static void main(String args[]){
		int arry[] = {3,5,6,2,9,0};	
		ReversePrint(arry);
		}
}