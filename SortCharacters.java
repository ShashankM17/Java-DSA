import java.util.*;
public class SortCharacters{
	public static void main(String args[]){
	
	char array[] = {'a', 'r', 's','g', 'm', 'p', 'z', 'b', 'c', 'w', 'f'};
	
	for(int i=0; i<array.length-1; i++){
		for(int j=0; j<array.length-1-i; j++){
			if(array[j] > array[j+1]){
				
				char temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
		}
		
	}

	for(int i=0; i<array.length; i++){
		System.out.println(array[i]);
	}
	
	}
}