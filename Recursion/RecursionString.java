public class RecursionString{
	public static void ReversePrint(String name, int idx){
		if(idx < 0){
			return;
		}

		
		System.out.print(name.charAt(idx));
		ReversePrint(name,idx-1);
	}
	public static void main(String args[]){
		String name = "Shashank";
		int idx = name.length()-1;
		ReversePrint(name, idx);
	}

}