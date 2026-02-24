import java.util.*; 
public class ArrayList1{
	public static void main(String args[]){
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);

		
		List.set(0,4);
		List.set(1,8);
		List.set(2,6);
		List.set(3,8);
		List.set(4,11);
		
		Collections.sort(List);
		for(int i=0; i<List.size(); i++){
			System.out.println(List.get(i));
				
			}

		
		
		
	}
}