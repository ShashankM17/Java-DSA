public class MergeSort{
	public static void Combine(int array[], int startIdx, int endIdx, int mid){
		int mergeArray [] = new int [(endIdx - startIdx) + 1];
		int idx1 = startIdx;
		int idx2 = mid+1;
		int x = 0;
		
		while(idx1 <= mid && idx2 <= endIdx){
			if(array[idx1]  <= array[idx2] ){
				mergeArray[x++] = array[idx1++];
			}
			else{
				mergeArray[x++] = array[idx2++];
			}
		}
		
		while(idx1 <= mid){
			mergeArray[x++] = array[idx1++];
		}
		
		while(idx2 <= endIdx){
			mergeArray[x++] = array[idx2++];
		}
		
		for(int i=0,  j=startIdx; i<mergeArray.length; i++, j++){
				array[j] = mergeArray[i];
		
			
		}
	}
	public static void DevideArray(int array[], int startIdx, int endIdx){
		if(startIdx == endIdx){
			return;		
		}
		int mid =  (startIdx + endIdx) / 2;
		DevideArray(array, startIdx, mid);
		DevideArray(array, mid+1, endIdx);
		Combine(array, startIdx, endIdx, mid);

		
	}
public static void main(String args[]){
	int array [] = {2,4,6,2,8,9};
	int n = array.length;
	
	DevideArray(array,0, n-1);
	for(int i=0; i<array.length; i++){
		System.out.println(array[i]);
	}

}
}