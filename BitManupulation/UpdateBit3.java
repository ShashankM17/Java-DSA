public class UpdateBit3{
public static void UpdateBits(int number, int pos){
	int bitMap = 1 << pos;
	int clearedBit = ~(bitMap) & number;
	System.out.println("the bit is clered "+clearedBit);
	
	int newNumber = bitMap | number;
	System.out.println("the bit is updated to "+newNumber);

}
}