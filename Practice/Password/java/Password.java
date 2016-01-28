/*
* - Problem Link - https://www.hackerearth.com/problem/algorithm/password-1/
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

class Password {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);

		int noOfPasswords = Integer.parseInt(reader.readLine());
		ArrayList<String> inputPwdList = new ArrayList<String>(noOfPasswords);
		ArrayList<String> reversePwdList = new ArrayList<String>(noOfPasswords);

		StringBuilder stringBuilder = new StringBuilder();

		while (noOfPasswords-- > 0) {
			String currentPassword = reader.readLine();
			if (currentPassword.length() > 0 && currentPassword.length() < 14) {
				inputPwdList.add(currentPassword);
				reversePwdList.add(stringBuilder.append(currentPassword).reverse().toString());
				stringBuilder.delete(0, stringBuilder.length());
			}
		}
		here: for (int x = 0; x < inputPwdList.size(); x++) {
			if (inputPwdList.get(x).contentEquals(inputPwdList.get(x + 1))) {
				writer.write(inputPwdList.get(x).length() + " " + inputPwdList.get(x).charAt(inputPwdList.get(x).length() / 2));
				break here;
			}
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}