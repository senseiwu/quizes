package com.kozlowst;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by tomek on 3/9/15.
 */
public class WordCheckTest {

    private WordCheck check = new WordCheck();

    @Test
    public void palindromeTest1() {
        assertTrue(check.isPalindrome("hannah"));
    }

    @Test
    public void palindromeTest2() {
        assertFalse(check.isPalindrome("tomek"));
    }

    @Test
    public void palindromeTest3() {
        assertTrue(check.isPalindrome("race car"));
    }

    @Test
    public void palindromeTest4_NULL_ExceptionExpected(){
        String word = null;
        try {
            check.isPalindrome(word);
            assertTrue("Exception not throws",false);
        }catch(RuntimeException e){
            assertTrue("the input word is empty,pls input valid one.".equals(e.getMessage()));
            assertTrue(true);
        }
    }

}
