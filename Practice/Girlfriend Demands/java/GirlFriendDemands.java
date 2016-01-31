/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/girlfriends-demands/
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
class GirlFriendDemands {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		String inputString = reader.readLine();
		int len = inputString.length();
		String[] values;
		int testCases = Integer.parseInt(reader.readLine());
		while (testCases-- > 0) {
			values = reader.readLine().split(" ");
			long theNumberA = (Long.parseLong(values[0]) - 1) % len;
			long theNumberB = (Long.parseLong(values[1]) - 1) % len;
			if (inputString.charAt((int) theNumberA) == inputString.charAt((int) theNumberB)) {
				writer.write("Yes\n");
			} else {
				writer.write("No\n");
			}
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
