public class SubSequence{
	public static void PrintSubSequence(String str, int idx, String newStr){
		if(idx == str.length()){
			System.out.println(newStr);
			return;
		}
		char currentChar = str.charAt(idx);
		PrintSubSequence(str,idx+1,newStr + currentChar);
		
		PrintSubSequence(str,idx+1,newStr);
	}
	public static void main(String args[]){
		PrintSubSequence("abc",0,"");
	}

}