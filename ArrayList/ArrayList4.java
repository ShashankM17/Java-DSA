import java.util.*; 
public class ArrayList4{
	public static void main(String args[]){
		ArrayList<Float> List = new ArrayList<Float>();
		List.add(0.5f);
		List.add(0.10f);
		List.add(0.15f);
		List.add(0.20f);
		List.add(0.25f);
		List.add(0.30f);
		List.add(0.35f);
		
		List.set(0, 1.0f);
		List.set(1, 2.0f);
		List.set(2, 3.0f);
		List.set(2, 4.0f);
		List.set(4, 5.0f);
		List.set(5, 6.0f);
		List.set(6, 7.0f);
		for(int i=0; i<List.size(); i++){
			System.out.println(List.get(i));
		}
		
}
}