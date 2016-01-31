/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/problem-2-10/
*/


#include<iostream>
using namespace std;
int main() {
	int a, o, count, i;
	long int big;
	cin >> a >> o;
	if (a > o) {
		big = a;
	} else {
		big = o;
	}
	if (a < 1000000000 && o < 1000000000) {
		for (i = 1; i <= big; i++) {
			if (a % i == 0 && o % i == 0) {
				count = i;
			}
		}
		cout << a / count << " " << o / count;
	}
	return 0;
}