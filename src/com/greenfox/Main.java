package com.greenfox;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    String[] a = {"one", "two", "three"};
    String[] b = {"two", "three", "one"};

    System.out.println(arrayMatcher(a, b));

  }

  public static boolean arrayMatcher(String[] x, String[] y) {
    if (x.length != y.length)
      return false;
    int arrayLength = x.length;
    sortArray(x);
    sortArray(y);
    for (int i = 0; i < arrayLength; i++) {
      if (x[i] != y[i])
        return false;
    }
    return true;
  }

  public static void sortArray(String[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < i; j++) {
        int n = 0;
        if (array[i].toLowerCase().charAt(n) == array[j].toLowerCase().charAt(n)) {
          n++;
        }
        else if (array[i].toLowerCase().charAt(n) > array[j].toLowerCase().charAt(n)) {
          swap(array, i, j);
        }
      }
    }
  }

  public static void swap(String[] x, int i, int j){
    String temp = x[i];
    x[i] = x[j];
    x[j] = temp;
  }
}
