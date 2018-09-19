/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
http://codingbat.com/prob/p183592
*/


public String front22(String str) {
  return (str.length() > 2)? str.substring(0,2) + str + str.substring(0,2) :str.substring(0,str.length()) + str +str.substring(0,str.length());
}

