package com.rest.demo.models;

public class Operations {

  private int result;

  public Operations() {
  }

  public void sum(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
      sum += number;
    }
    result = sum;
  }

  public void multiply(int[] numbers) {
    int multiplying = 1;

    for (int number : numbers) {
      multiplying *= number;
    }
    result = multiplying;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
