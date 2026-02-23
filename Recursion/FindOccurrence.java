public class FindOccurrence{
	public static int first = -1;
	public static int last = -1;
	public static void FindFirstAndLastOccurrence(String str, int idx, char targerLetter){
		if(idx == str.length()-1){
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currentChar = str.charAt(idx);
		if(currentChar == targerLetter){
			if(first == -1){
				first = idx;
			}
			else{
				last = idx;
			}
			
		}
		FindFirstAndLastOccurrence(str,idx+1,targerLetter);
	}
	public static void main(String args[]){
		String str = "abcdeefghieee";
		FindFirstAndLastOccurrence(str,0,'e');
	}

}

