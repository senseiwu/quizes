package com.kozlowst;

/**
 * Created by tomek on 3/9/15.
 */
public class WordCheck {

    public boolean isPalindrome(String word){

        boolean result = true;
        if(word==null||"".equals(word.trim())){
            throw new RuntimeException("the input word is empty,pls input valid one.");
        }

        if(word.length() % 2 == 1){
            result = false;
        }else{
            int wordLength = word.length();
            for(int i=0;i<wordLength/2;i++){

                if(!(word.charAt(i)==' ' || word.charAt(wordLength-1-i) == ' ' || (word.charAt(i)==word.charAt(wordLength-1-i))
                )){
                    result = false;
                    break;
                }

            }

        }
        return result;
    }
}
