public class PrintNumbers{
	public static void PrintNNumbers(int n, int i){
		if(i == n){
			return;
		}
		System.out.println(i);
		PrintNNumbers(n, i+1);
	}
	public static void main(String args[]){
		PrintNNumbers(5,1);
	}

}