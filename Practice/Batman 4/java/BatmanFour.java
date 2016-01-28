/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/4-batman/
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
 
 
class BatmanFour {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int testCases = Integer.parseInt(reader.readLine());
		
		while (testCases-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			String rawInputArray[] = reader.readLine().split(" ");
			int originalInputArray[] = new int[n];
			for (int i = 0; i < n; i++) {
				originalInputArray[i] = Integer.parseInt(rawInputArray[i]);
				al.add(originalInputArray[i]);
			}
			String xyArray[] = reader.readLine().split(" ");
			int x = Integer.parseInt(xyArray[0]);
			int y = Integer.parseInt(xyArray[1]);
			Arrays.sort(originalInputArray);
			int XthTerm = originalInputArray[x - 1];
			int YthTerm = originalInputArray[y - 1];
			int product = 1;
			for (int i = al.indexOf(XthTerm); i <= al.indexOf(YthTerm); i++) {
				product *= al.get(i);
			}
			writer.write(product + "\n");
			al.clear();
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}