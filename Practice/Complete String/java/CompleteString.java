/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/complete-string-4/
*/


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
 
 
class CompleteString {

	public static void main(String args[]) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		int testCases = Integer.parseInt(reader.readLine());
		while (testCases-- > 0) {
			String temp = reader.readLine();
			if(temp.length() < 26) {
				writer.println("NO");
			} else if (temp.contains("a") && temp.contains("b") && temp.contains("c") && temp.contains("d")
					&& temp.contains("e") && temp.contains("f") && temp.contains("g") && temp.contains("h")
					&& temp.contains("i") && temp.contains("j") && temp.contains("k") && temp.contains("l")
					&& temp.contains("m") && temp.contains("n") && temp.contains("o") && temp.contains("p")
					&& temp.contains("q") && temp.contains("r") && temp.contains("s") && temp.contains("t")
					&& temp.contains("u") && temp.contains("v") && temp.contains("w") && temp.contains("x")
					&& temp.contains("y") && temp.contains("z")) {
				writer.println("YES");
			} else {
				writer.println("NO");
			}
		}
		reader.close();
		writer.close();
	}
}