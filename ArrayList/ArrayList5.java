import java.util.*; 
public class ArrayList5{
	public static void main(String args[]){
		ArrayList<Character> List = new ArrayList<Character>();
		List.add('g');
		List.add('r');
		List.add('d');
		List.add('s');
		List.add('n');
		List.add('v');
		List.add('m');
		
		List.set(0, 'q');
		List.set(1, 'a');
		List.set(2, 'm');
		List.set(2, 't');
		List.set(4, 'e');
		List.set(5, 'w');
		List.set(6, 'v');
		
		Collections.sort(List);
		for(int i=0; i<List.size(); i++){
			System.out.println(List.get(i));
		}
		
		
}
}