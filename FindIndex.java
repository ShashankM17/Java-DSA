import java.util.*;
public class FindIndex{
	public static void FindLocation(){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the rows size");
	int row = sc.nextInt();
	System.out.println("Enter the column size");
	int col = sc.nextInt();
	
	System.out.println("Enter the elements");
	int array[][] = new int[row][col];
	
	for(int i=0; i<row; i++){
		for(int j=0; j<col; j++){
			array[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("enter the target value");
	int x = sc.nextInt();
	
	for(int i=0; i<row; i++){
		for(int j=0; j<col; j++){
			if(x == array[i][j]){
		   System.out.print("x found at " +i + " "+j );
			}
		}
		System.out.println();
	}		
		
	}
	public static void main(String args[]){

	
	
	
	
}

}