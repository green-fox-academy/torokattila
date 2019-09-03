package com.rest.demo.models;

public class DoUntil {

  private int result;

  public DoUntil() {
  }

  public void sum(int number) {
    int sum = 0;

    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    this.result = sum;
  }

  public void factor(int number) {
    int fact = 1;

    for (int i = 1; i <= number; i++) {
      fact = fact * i;
    }
    this.result = fact;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
