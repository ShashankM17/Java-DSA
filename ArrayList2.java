import java.util.*; 
public class ArrayList2{
	public static void main(String args[]){
		ArrayList<String> List = new ArrayList<String>();
		List.add("Shashank");
		List.add("sanjay");
		List.add("tejas");
		List.add("manu");
		List.add("pt");
		
		List.set(0,"vikki");
		List.set(1,"tejas");
		List.set(2,"manu");
		List.set(3,"pt");
		List.set(4,"shashank");
		
		for(int i=0; i<List.size(); i++){
			System.out.println(List.get(i));
		}
		
}
}