/*
	* Problem Link - https://www.hackerearth.com/problem/algorithm/alien-language/
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
class AlienLanguage {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		int testCases = Integer.parseInt(reader.readLine());
		while (testCases-- > 0) {
			String jhoolWord = reader.readLine();
			String jaaduWord = reader.readLine();
 
			if (jhoolWord.contains(jaaduWord)) {
				writer.write("YES\n");
			} else {
				writer.write("NO\n");
			}
		}
		
		reader.close();
		writer.flush();
		writer.close();
	}
}