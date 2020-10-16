package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> f = new ArrayList<String>();
		//2. Add five Strings to your list
		f.add("epic");
		f.add("okay");
		f.add("funny");
		f.add("shouldn't you be coding?");
		f.add("get back to work");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			
		}
		//4. Print all the Strings using a for-each loop
		for (String j : f) {
		System.out.println(j);	
		}
		//5. Print only the even numbered elements in the list.
		int s = 0;
		for (String c : f) {
			
			if (s%2 == 0) {
				System.out.println(c);
			}
			s++;
			
		}
		//6. Print all the Strings in reverse order.
		int t = 4;
		for(String v :f) {
			
			System.out.println(f.get(t));
			t--;
		}
		//7. Print only the Strings that have the letter 'e' in them.
	for(String h:f) {
		for (int i = 0; i < h.length(); i++) {
			if(h.charAt(i)==('e')) {
				System.out.println(h);
			}
		}
	}
	
	}
}
