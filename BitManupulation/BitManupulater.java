import java.util.*;
public class BitManupulater{
public static void BitManupulation(int number, int pos, int operation){
	int bitMap = 1 << pos;

	if(operation == 1){
		int getBit = bitMap & number;
		if(getBit == 0){
		System.out.println("the bit value is  0");
		}
		else{
		System.out.println("the bit value is 1");
		}
		
	}
	else if(operation == 2){
		int newNumber = bitMap | number;
		System.out.println("the bit set to "+newNumber);
		
	}
	else if (operation == 3){
		int clearedBit = ~(bitMap) & number;
		System.out.println("the bit is cleared "+clearedBit);
		
		int updatedBit = bitMap | number;
		System.out.println("the bit is updated "+updatedBit);
		
	}
	else if (operation == 4){
		int clearedBit = ~(bitMap) & number;
		System.out.println("the bit is cleared "+clearedBit);		
	}

}
public static void main(String args[]){
}
}