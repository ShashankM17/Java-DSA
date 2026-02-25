public class MoveAllX{
	public static void MoveAllXToLast(String str, int idx, String newStr, int count){
		if(idx == str.length()-1){
			for(int i=0; i<count; i++){
				newStr =  'x' + newStr;
			}
			System.out.println(newStr);
			return;
		}
		
		char currentChar = str.charAt(idx);
		if(currentChar == 'x'){
			count++;
		}
		else{
			newStr = newStr + currentChar;
		}
		MoveAllXToLast(str,idx+1,newStr,count);
	}
	public static void main(String args[]){
		MoveAllXToLast("abcxxdefxghixxx",0,"",0);
	}
}
