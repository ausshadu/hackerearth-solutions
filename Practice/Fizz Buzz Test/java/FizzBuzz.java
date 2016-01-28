/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/fizzbuzz/
*/

import java.io.PrintWriter;
 
class FizzBuzz {
	public static void main(String[] args) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0)
				writer.println("FizzBuzz");
			else if (i % 3 == 0)
				writer.println("Fizz");
			else if (i % 5 == 0)
				writer.println("Buzz");
			else
				writer.println(i);
 
		}
		writer.flush();
		writer.close();
	}
}