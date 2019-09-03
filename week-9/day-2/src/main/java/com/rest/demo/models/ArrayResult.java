package com.rest.demo.models;

public class ArrayResult {

  private int[] newArrayResult;

  public ArrayResult() {
  }

  public void doubling(int[] numbers) {
    int[] newNumbers = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      newNumbers[i] = numbers[i * 2];
    }
    newArrayResult = newNumbers;
  }
}
