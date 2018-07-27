/*
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
http://codingbat.com/prob/p159227
*/

//My solution 
public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    if ( a < 0 && b < 0) 
      return true;
    else 
      return false;
  } else if ( (a < 0 || b < 0) && ( a > 0 || b >0) ) {
    return true;
  } else {
    return false;
  }
}

//A much cleaner way to implement the solution is (Official solution)

public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}
