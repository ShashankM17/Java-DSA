import java.util.*;
public class Print2DArray{
	public static void PrintArray(int array[][], int row, int col){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				array[i][j] = sc.nextInt();
			}
			
		}
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(array[i][j] + " ");
				
			}
			System.out.println();
			
		}
	}
public static void main(String args[]){

}
}