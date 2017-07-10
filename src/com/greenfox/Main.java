package com.greenfox;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] a = {"one", "two", "three"};
        String[] b = {"two", "three", "one"};

        System.out.println(arrayMatcher(a, b));

    }

    public static boolean arrayMatcher( String[] x, String[] y) {
      if (x.length != y.length)
        return false;
      int arrayLength = x.length;
      Arrays.sort(x);
      Arrays.sort(y);
      for (int i = 0; i < arrayLength; i++) {
        if (x[i] != y[i])
          return false;
      }
      return true;
    }
}
