package edu.cnm.deepdive;

import java.util.Arrays;

public class CommandLineArgs {

  public static void main(String[] args) {
    for (String arg :args) {
      System.out.println(arg.toUpperCase());
    }
    System.out.println(Arrays.toString(args));
  }}
