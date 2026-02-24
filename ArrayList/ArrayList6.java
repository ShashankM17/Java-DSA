import java.util.*;
public class ArrayList6{
	public static void main(String args[]){
		ArrayList<Double> List = new ArrayList<Double>();
		List.add(0.4546474);
		List.add(0.5666666);
		List.add(0.12332334);
		List.add(1.344273638);
		List.add(0.5479364747);
		List.add(9.2647565657);
		
		List.set(0, 9.3455555);
		List.set(1,7.555666666);
		List.set(2, 2.325343534);
		List.set(3, 5.65434435);
		List.set(4,9.0998998999);
		List.set(5,6.5765766676);
		
		Collections.sort(List);
		
		for(int i=0; i<List.size(); i++){
          	System.out.println(List.get(i));		
		}
		
	}

}