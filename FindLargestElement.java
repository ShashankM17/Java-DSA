import java.util.*;
public class FindLargestElement{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the size of the arry");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("enter elements of the arry");
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();	
		}
		
		for(int i=0; i<array.length-1; i++){
			for(int j=0; j<array.length-1-i; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			}
		}
		
		System.out.println("largest elements is "+array[array.length-1]);
		}

}