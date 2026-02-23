public class SelectionSort{
	public static void SortArray(int array[]){
		for(int i=0;i<array.length-1; i++){
			int smallest = i;
			for(int j=i+1;j<array.length; j++){
				if(array[smallest] > array[j]){
					smallest = j;				
			}	
		}
		int temp = array[smallest];
		array[smallest] = array[i];
		array[i] = temp;
		
	}
	for(int i=0;i<array.length; i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
	public static void main(String args[]){
		
	}
}