/*
* Problem Link - https://www.hackerearth.com/problem/algorithm/the-best-internet-browser-3/
*/


using System; 

class BestInternetBrowser 
{
	static void Main(string[] args)
        {
            var RawInput = System.Console.ReadLine().Trim();
            var testCases = Int32.Parse(RawInput);
            
            if (testCases >= 1 && testCases <= 100)
            {
                while (testCases-- > 0)
                {
                    var mystring = System.Console.ReadLine().Trim();
                    int originalLength = mystring.Length;
                    if (originalLength >= 1 && originalLength <= 200)
                    {
                        mystring = mystring.Replace("http://", "");
                        mystring = mystring.Replace("www.", "");
                        mystring = mystring.Replace(".com", "");
                        mystring = mystring.Replace("a", "");
                        mystring = mystring.Replace("e", "");
                        mystring = mystring.Replace("i", "");
                        mystring = mystring.Replace("o", "");
                        mystring = mystring.Replace("u", "");
                    }
                    Console.WriteLine((mystring.Length + 4) + "/" + originalLength);
                }
            }
        }
}