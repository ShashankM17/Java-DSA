public class BitManupulation{
	public static void getBit(int number){
		int pos = 2;
		int bitMap = 1 << pos;
		
		if((bitMap & number) == 0){
			System.out.println("number is 0");
		}
		
		else{
			System.out.println("number is 1");
			int newNumber = bitMap & number;
			System.out.println(newNumber);
		}
		
	}
	
	public static void setBit(int number){
		int pos = 3;
		int bitMap = 1 << pos;
		int newNumber = bitMap | number;
		System.out.println(newNumber);
		
		
	}
public static void main(String args[]){


}
}