/*
Given a string, return true if the string starts with "hi" and false otherwis
http://codingbat.com/prob/p191022
*/

public boolean startHi(String str) {
  if (str.length() >= 2) {
     return str.substring(0,2).equals("hi");
  }
  return false;
}

