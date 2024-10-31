package com.example.demo.aboutStrings;

public class MoreStrings {

  // reverse the characters in a string
  protected static void reverseIntoPalindrome() {
    String palindrome = "Dot saw I was Tod";
    int len = palindrome.length();
    char[] tempCharArray = new char[len];
    char[] charArray = new char[len];

    // put original string in an
    // array of chars
    for (int i = 0; i < len; i++) {
      tempCharArray[i] = palindrome.charAt(i);
    }

    // reverse array of chars
    // copy the characters from the tail
    for (int j = 0; j < len; j++) {
      charArray[j] = tempCharArray[len - 1 - j];
    }

    String reversePalindrome = new String(charArray);
    System.out.printf("Original sentence: %s%n", palindrome);
    System.out.printf("Reversed palindrome: %s%n", reversePalindrome);

  }

  public static void main() {
    // create string from char[]
    char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
    String helloString = new String(helloArray);
    System.out.println(helloString);

    // string length
    // if this string is reversed, was->saw,
    // dot->tod!
    reverseIntoPalindrome();

  }
}