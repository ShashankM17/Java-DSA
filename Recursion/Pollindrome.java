public class Pollindrome{
	public static boolean CheckPollindrome(String str){
		int n = str.length()-1;
		int start = 0;
		
		while(start <= n ){
			if(str.charAt(start) == str.charAt(n)){
				return true;
			}
			n--;
			start++;
		}
		return false;
	}
	public static void main(String args[]){
		String name = "mom";
		System.out.println(CheckPollindrome(name));
	}

}
