import java.util.*;
public class PhoneNumbers{
	public static void main(String args[]){
		ArrayList<Long> phoneNumbers = new ArrayList<Long> ();
		phoneNumbers.add(4645748474l);
		phoneNumbers.add(4678478490l);
		phoneNumbers.add(9535263819l);
		phoneNumbers.add(6361876360l);
		phoneNumbers.add(0000000000l);
		phoneNumbers.add(1111111111l);
		
		phoneNumbers.set(0, 9008525795l);
		phoneNumbers.set(1, 6361876360l);
		phoneNumbers.set(2, 8050264539l);
		phoneNumbers.set(3, 0373546332l);
		phoneNumbers.set(4, 7846746587l);
		phoneNumbers.set(5, 6588688688l);
		
		Collections.sort(phoneNumbers);
		
		for(int i=0; i<phoneNumbers.size(); i++){
			System.out.println(phoneNumbers.get(i));
		}
	}

}