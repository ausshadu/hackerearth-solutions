/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/problem-2-10/
*/


import java.util.ArrayList;
import java.util.Scanner;
 
class AppleOrange {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
		int apples = s.nextInt();
		int oranges = s.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 12000; i++) {
			if (apples % i == 0 && oranges % i == 0) {
				al.add(i);
			}
			continue;
		}
		int d = al.get(al.size() - 1);
		System.out.println(apples / d + " " + oranges / d);
		s.close();
	}
}