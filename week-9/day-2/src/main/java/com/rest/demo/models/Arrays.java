package com.rest.demo.models;

public class Arrays {

  private String what;
  private int[] numbers;

  public Arrays() {
    numbers = new int[4];
  }

  public Arrays(String what) {
    numbers = new int[4];
    this.what = what;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
