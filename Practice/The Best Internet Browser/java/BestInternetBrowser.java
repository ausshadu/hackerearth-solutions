/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/the-best-internet-browser-3/
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
class BestInternetBrowser {
 
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		int testCases = Integer.parseInt(reader.readLine());
		if (testCases >= 1 && testCases <= 100) {
			while (testCases-- > 0) {
				String mystring = reader.readLine();
				int originalLength = mystring.length();
				if (originalLength >= 1 && originalLength <= 200) {
					mystring = mystring.replace("http://", "");
					mystring = mystring.replace("www.", "");
					mystring = mystring.replace(".com", "");
					mystring = mystring.replace("a", "");
					mystring = mystring.replace("e", "");
					mystring = mystring.replace("i", "");
					mystring = mystring.replace("o", "");
					mystring = mystring.replace("u", "");
				}
				writer.write((mystring.length() + 4) + "/" + originalLength + "\n");
			}
		}
		reader.close();
		writer.close();
	}
}