public class InsersionSort{
	public static void SortArray(int array []){
		for(int i=0;i<array.length; i++){
			int current = array[i];
			int j = i-1;
			while(j >= 0 && current < array[j] ){
				array[j+1] = array[j];
				j--;
				
			}
			 array[j+1]=current;
			
		}
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]);
			
		}
		System.out.println();
		int n = array.length;
		System.out.println(array[n-2]);

		
	}
	public static void main(String args[]){
		
	}
}