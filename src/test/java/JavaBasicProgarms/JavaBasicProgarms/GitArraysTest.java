package JavaBasicProgarms.JavaBasicProgarms;

import java.util.Arrays;
import java.util.Collections;

public class GitArraysTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "name4", "name2", "name3"};
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
        
		Arrays.sort(names,Collections.reverseOrder());
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String abc : names) {
			System.out.println(abc)
	}

		// Multidimensional Array
		int type[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < type.length; ++i) {

			for (int j = 0; j < type.length; ++j)
				System.out.println(type[i][j]);
		}

	}
}
