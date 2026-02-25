import java.util.*;
public class FindElement{
	public static int Location(int array [], int target){
		for(int i=0; i<array.length; i++){
			if(target == array[i]){
				return i;
			}
			else{
				return 0;
			}
		}
		return 0;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter array size");
		int size = sc.nextInt();
		
		int array[] = new int[size];	
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
		}
		
		System.out.println("enter the target element");
		int target = sc.nextInt();
			System.out.println("the element is found at "+Location(array, target));
	}

}