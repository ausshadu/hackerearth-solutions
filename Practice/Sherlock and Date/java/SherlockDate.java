/*
*   Problem Link - https://www.hackerearth.com/problem/algorithm/sherlock-and-date/
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class SherlockDate {

	public static void main(String args[] ) throws Exception {
 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
 
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"};
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 
		int testCases = Integer.parseInt(reader.readLine());
		
        while(testCases-- > 0) {
        	String inputLine[] = reader.readLine().split(" ");
        	int d = Integer.parseInt(inputLine[0]);
        	String month = inputLine[1];
        	int year = Integer.parseInt(inputLine[2]);
        	
        	if(d == 1) {
        		if(month.equals("January")) {
        			year--;
        			writer.write("31 December " + year + "\n");
        		} else {
        			int index = 0;
                    for(int i=0;i<12;i++) {
                        if(months[i].equals(month)) {
                            index = i;
                            break;
                        }
                    }
        			index--;
        			int f = days[index];
        			if(isLeapYear(year) && month.equals("March")) {
        				f++;
        			}
        			writer.write(f + " " + months[index] + " " + year + "\n");
        		}	
        	} else {
        		d--;
        		writer.write(d + " " + month + " " + year + "\n");	
        	}
        }
        
        reader.close();
		writer.flush();
		writer.close();
        
    }
    public static boolean isLeapYear(int year) {
    	if(year % 4 == 0) {
    		if(year % 100 == 0) {
    			if(year % 400 == 0) {
    				return true;
    			} else return false;
    		} else return true;
    	}else return false;
    }
}