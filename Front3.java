/*
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
http://codingbat.com/prob/p136351
*/

public String front3(String str) {
  if (str.length() < 3) {
    return str.substring(0,str.length() ) + str.substring(0,str.length())+ str.substring(0,str.length());
  }
  return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
}


//I find the official solution more readable.

public String front3(String str) {
  String front;
  
  if (str.length() >= 3) {
    front = str.substring(0, 3);
  }
  else {
    front = str;
  }

  return front + front + front;
} 
