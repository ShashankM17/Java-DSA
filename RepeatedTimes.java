import java.util.*;
public class RepeatedTimes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter elements of the array");
		
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter target elements");
		int target = sc.nextInt();
		int count =0;
		
		for(int i=0; i<array.length; i++){
			if(array[i] == target){
				count++;
				
			}
			else{
				count = count;
			}
		}		
		System.out.println("the target element is repeated "+count + "  times");
	}

}