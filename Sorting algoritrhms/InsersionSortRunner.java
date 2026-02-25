import java.util.*;
public class InsersionSortRunner{
	public static void main(String args[]){
		System.out.println("enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			
		}
		InsersionSort.SortArray(arr);
}
}