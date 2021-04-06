/*
The bloody photocopier is broken... Just as you were sneaking around the office to print off your favourite binary code!

Instead of copying the original, it reverses it: '1' becomes '0' and vice versa.

Given a string of binary, return the version the photocopier gives you as a string.
*/

import java.util.*;

public class Kata {

  public static String broken(final String x) {
    Hashtable<String, String> zerosAndOnes = new Hashtable<String, String>();

    zerosAndOnes.put("0", "1");
    zerosAndOnes.put("1", "0");
    
    String brokenPrint = "";
    
    String[] arr = x.split("");
 
    for (String ch: arr) {
      brokenPrint += zerosAndOnes.get(ch);
    }

    return brokenPrint;
  }
  
}