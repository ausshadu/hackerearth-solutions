/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/reversing-a-number/
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
class ReverseNumber {
 
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		int noOfTestCases = Integer.parseInt(reader.readLine());
		while (noOfTestCases-- > 0) {
			String input = reader.readLine();
			if (Integer.parseInt(input.charAt(0) + "") % 2 == 0) {
				writer.println("EVEN");
			} else {
				writer.println("ODD");
			}
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}