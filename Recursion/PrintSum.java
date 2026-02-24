public class PrintSum{
	public static void PrintSumOfNumber(int n, int sum, int i){
		if(n == 0){
			return;
		}
		 sum = sum + i;
		 System.out.println(sum);
		 PrintSumOfNumber(n-1, sum, i+1);
	}
	
	public static void main(String args[]){
		PrintSumOfNumber(5, 0, 1);
	}

}