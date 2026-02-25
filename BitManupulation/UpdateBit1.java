public class UpdateBit1{
public static void UpdateBits(int number, int pos){
	int bitMap = 1 << pos;
	
	
	int clearedNumber = ~(bitMap) & number;
	System.out.println("the bit is cleared "+clearedNumber);

	
		int newNumber = bitMap | number;
		System.out.println("the bit is updated to "+newNumber);
	

}
public static void main(String args[]){
	
}
}