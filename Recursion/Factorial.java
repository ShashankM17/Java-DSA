public class Factorial{
	public static void PrintFactorial(int n, int sum, int i){
		if(n == 0){
			return;
		}
		sum = sum * i;
		System.out.println(sum);
		PrintFactorial(n-1, sum, i+1);
		
	}
	public static void main(String args[]){
		PrintFactorial(5,1,1);
	}
}