import java.util.*;
public class BubbleSortRunner{
	public static void main(String args[]){
		System.out.println("enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("enter the elements");
		for(int i=0;i<arr.length; i++){
			
			arr[i] = sc.nextInt();
			
		}
		BubbleSort.SortArray(arr);
		System.out.println(arr.length-1);
		
	}

}