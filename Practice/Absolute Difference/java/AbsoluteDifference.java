/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/absolute-difference-2/	
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class AbsoluteDifference {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		int testCases = Integer.parseInt(reader.readLine());
		if (testCases >= 1 && testCases <= 1000) {
			while (testCases-- > 0) {
				boolean flag = true;
				String line = reader.readLine();
				int N = Integer.parseInt(line.charAt(0) + "");
				int D = Integer.parseInt(line.charAt(2) + "");
				if (N >= 1 && N <= 1000) {
					if (D >= 1 && D <= 100) {
						String line1 = reader.readLine();
						int[] temp = new int[N];
						String[] t = line1.split(" ");
						for (int x = 0; x < N; x++) {
							temp[x] = Integer.parseInt(t[x]);
						}
						for (int x = 0; x < (N - 1); x++) {
							int diff = Math.abs(temp[x] - temp[x + 1]);
							if (diff > D) {
								flag = false;
							}
						}
						if (flag == true) {
							writer.write("YES\n");
						} else {
							writer.write("NO\n");
						}
					} else {
						return;
					}
				} else {
					return;
				}
			}
		} else {
			return;
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
