package com.ignateva.test1;

import java.util.ArrayList;

public class TextCount {
    public static String str;
    public static ArrayList<Character> vowels;
    public static ArrayList<Character> consonants;

    public static ArrayList<Character> marks;

    public TextCount(String str) {
        this.str = str;
    }

    public ArrayList<Character> getVowels() {
        return vowels;
    }

    public ArrayList<Character> getConsonants() {
        return consonants;
    }

    public ArrayList<Character> getMarks() {
        return marks;
    }

    public void countAll() {

        String allVowels = "уеаоэяиюыё";
        String allMarks = ",.:;-?!";
        vowels = new ArrayList<Character>();
        consonants = new ArrayList<Character>();
        marks = new ArrayList<Character>();
        // check whether input string is not null
        if (null == str) {
            throw new IllegalArgumentException("Input String cannot be null");
        }
        // replace all spaces - ignore space characters
        String str1= str.toLowerCase();
        char[] chArray = str1.replaceAll(" ", "").toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            if (-1 != allVowels.indexOf(chArray[i]))
                vowels.add(chArray[i]);
            else if (-1 != allMarks.indexOf(chArray[i]))
                marks.add(chArray[i]);
            else
                consonants.add(chArray[i]);
        }
    }
}
