package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Stack;

public class StringUtils {
    public static int countVowels(String str) {
        if(str == null)
            return 0;

        var vowels = new HashSet<Character> (Arrays.asList('a','e','i','o','u'));
        int count = 0;
        for(Character ch : str.toLowerCase().toCharArray()){
            if(vowels.contains(ch)){
                count++;
            }
        }
        return count;
    }

    public static String reverse(String str){
        if(str == null)
            return "";
        var stack = new Stack<Character>();
        var stringBuilder = new StringBuilder();
        for (var ch : str.toCharArray()){
            stack.push(ch);
        }
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static String reverseWithoutStack(String str){
        var stringBuilder = new StringBuilder();
        for(var i = str.length()-1; i >= 0; i--){
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static String reverseWords(String str){
        if(str == null)
            return "";
        var words = str.split(" ");
        var reversedSentence = new StringBuilder();
        for(var i = words.length-1; i >=0; i--){
            reversedSentence.append(words[i] + " ");
        }

        return reversedSentence.toString().trim();
    }
}
