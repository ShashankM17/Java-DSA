public class UpdateBit2{
public static void UpdateBits(int number, int pos){
	int bitMap = 1 << pos;
	int cleredBit = ~(bitMap) & number;
	System.out.println("the bit is clered "+ cleredBit);
	
	int updatedBit = bitMap | number;
	System.out.println("updated to "+ updatedBit);


}
public static void main(String args[]){

}
}