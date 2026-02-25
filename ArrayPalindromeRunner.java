import java.util.*;
public class ArrayPalindromeRunner{
	public static void main(String args[]){
		
		
		System.out.println("enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		if(ArrayPalindrome.isPalindrome(arr) == true){
			System.out.println("array is Palindrome ");
		}
		else{
			System.out.println("array is not Palindrome ");
		}
		
		ArrayPalindrome.PrintArray(arr);
	}

}

