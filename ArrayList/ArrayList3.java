import java.util.*; 
public class ArrayList3{
	public static void main(String args[]){
		ArrayList<Boolean> List = new ArrayList<Boolean>();
		List.add(true);
		List.add(false);
		List.add(true);
		List.add(false);
		List.add(true);
		
		
		List.set(0, false);
		List.set(1, false);
		List.set(2, true);
		List.set(2, false);
		List.set(4, true);
		for(int i=0; i<List.size(); i++){
			System.out.println(List.get(i));
		}
		
}
}