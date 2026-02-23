import java.util.*;
public class NewsPaper{
	public static void ReverseHeading(StringBuilder heading){
		for(int i=0; i<heading.length()/2; i++){
			int first = i;
			int last = heading.length()-1-i;
			
			char front = heading.charAt(first);
			char back = heading.charAt(last);
			
			heading.setCharAt(first, back);
			heading.setCharAt(last, front);
			
			
		}
		
		System.out.println(heading);
		
		
	}
public static void main(String args[]){
	

}
}