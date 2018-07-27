/*
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
http://codingbat.com/prob/p191914
*/

public String notString(String str) {
  String str = (str.length() >= 3 && str.substring(0,3).equals("not"))? (str) : ("not " + str);
  return str;
}

