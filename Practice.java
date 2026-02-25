import java.util.*;
public class Practice{

	static class add{
	public int Practice1(int i){
		
		return i;
	}
	}

	static class remove  extends add{
	
	public int Practice1(int i){
		return i-5;
	}		
	}
	public static void main(String args[]){
		remove p1= new remove();
		System.out.println(p1.Practice1(5));
		
	}
	
}