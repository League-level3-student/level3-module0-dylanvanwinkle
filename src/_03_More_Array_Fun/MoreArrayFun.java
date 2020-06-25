package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
MoreArrayFun maf = new MoreArrayFun();
		String[] s = {"a","b","c","d","e","f"};
	maf.string4(s);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public void string(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public void string2(String[] s) {
		for (int i = (s.length - 1); i > -1; i--) {
System.out.println(s[i]);
			}
		}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	public void string3(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {
				System.out.println(s[i]);
			}
		}
	}
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	public void string4(String[] s) {
		boolean c = false;
		while(!c) {
			Random r = new Random();
int ran = r.nextInt(s.length);
if(s[ran] != null) {
System.out.println(s[ran]);
s[ran] = null;
}
c = true;
for (int i = 0; i < s.length; i++) {
	if(s[i] != null) {
	c = false;
	}
}
}


	}
}