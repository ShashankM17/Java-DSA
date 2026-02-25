import java.util.*;
public class Print2DArrayRunner{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	int c = sc.nextInt();
	int array[][] = new int[r][c];
	
	Print2DArray.PrintArray(array, r, c);
}
}