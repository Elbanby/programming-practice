/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive)
http://codingbat.com/prob/p190570
*/

public String missingChar(String str, int n) {
  int strLen = str.length();
  
  if ( (n >= 0) && (n <= strLen - 1) ) {
   String newStr = (n == 0) ?   str.substring(1) : (str.substring(0,n) + "" + str.substring(n+1,strLen));
   return newStr;
  }
  return "invalid";
}

