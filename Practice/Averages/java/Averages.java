/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/averages-1/
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
 
class Averages {
 
	public static void main(String args[]) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System. in ));
		PrintWriter writer = new PrintWriter(System.out);
 
		int numberOfItems = Integer.parseInt(reader.readLine());
 
		String rawInputString = reader.readLine();
		String[] rawInputStringArray = rawInputString.split(" ");
		int[] inputIntegerArray = new int[rawInputStringArray.length];
 
		for (int i = 0; i < rawInputStringArray.length; i++) {
			inputIntegerArray[i] = Integer.parseInt(rawInputStringArray[i]);
		}
 
		inputIntegerArray = toAsscendingOrder(inputIntegerArray);
 
		if (inputIntegerArray.length == numberOfItems) {
			writer.println(inputIntegerArray[inputIntegerArray.length - 1] - inputIntegerArray[0]);
		}
 
		reader.close();
		writer.close();
	}
	public static int[] toAsscendingOrder(int[] a) {
		int swap;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swap = a[j];
					a[j] = a[j + 1];
					a[j + 1] = swap;
				}
			}
		}
		return a;
	}
}