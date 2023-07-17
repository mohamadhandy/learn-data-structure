package org.example;

public class Codewars {
  public static String sentenceSmash(String... words) {
    return words != null ? String.join(" ", words).replaceAll("[^a-zA-Z0-9 ]", "") : null;
  }
}
