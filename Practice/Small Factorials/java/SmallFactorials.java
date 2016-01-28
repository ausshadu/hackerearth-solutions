/*
* - Problem Link - https://www.hackerearth.com/problem/algorithm/small-factorials/
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;


class SmallFactorials {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		ArrayList<String> al = new ArrayList<String>(100);
		for (int x = 1; x <= 100; x++) {
			al.add(calculateFact(x));
		}
		int tc = Integer.parseInt(reader.readLine());
		while (tc-- > 0) {
			int num = Integer.parseInt(reader.readLine());
			writer.write(al.get(num + 1).toString() + "\n");
		}
		reader.close();
		writer.flush();
		writer.close();
	}

	public static String calculateFact(int sh) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= sh; i++)
			fact = fact.multiply(new BigInteger(i + ""));
		return fact.toString();
	}
}