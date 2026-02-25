public class ReverseNumbers{
	public static void PrintReverse(int n){
		if(n == 0){
			return;
		}
		
		System.out.println(n);
		PrintReverse(n-1);
	}
	public static void main(String args[]){
		PrintReverse(5);
	}


}