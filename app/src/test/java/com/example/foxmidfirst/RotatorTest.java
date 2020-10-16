package com.example.foxmidfirst;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert. *;

public class RotatorTest {
    Rotator rotator = new Rotator();

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }
    @Test
    public void test1() {
        String source = "123456 3456";
        String expected = "653421 6453 "; //pofiksit probel posle actual
        String actual = rotator.rotateWord(source,"4");
        System.out.println("Input sentences from user : 123456 3456.  Answer :");
        System.out.println(rotator.rotateWord(source,"4"));
        assertEquals(expected,actual);
    }
    @Test
    public void test2() {
        String source = "Foxminded cool 24/7";
        String expected = "dednimxoF looc 24/7 "; //pofiksit probel posle actual
        String actual = rotator.rotateWord(source,"0123456789");
        System.out.println("Input sentences from user : 123456 3456.  Answer :");
        System.out.println(rotator.rotateWord(source,"4"));
        assertEquals(expected,actual);
    }
    @Test
    public void test3() {
        String source = "abcd efgh";
        String expected = "dcba hgfe "; //pofiksit probel posle actual
        String actual = rotator.rotateWord(source,"0123456789");
        System.out.println("Input sentences from user : 123456 3456.  Answer :");
        System.out.println(rotator.rotateWord(source,"4"));
        assertEquals(expected,actual);
    }
    @Test
    public void test4() {
        String source = "Foxminded cool 24/7";
        String expected = "dexdnimoF oocl 7/42 "; //pofiksit probel posle actual
        String actual = rotator.rotateWord(source,"xl");
        System.out.println("Input sentences from user : 123456 3456.  Answer :");
        System.out.println(rotator.rotateWord(source,"4"));
        assertEquals(expected,actual);
    }
    @Test
    public void test5() {
        String source = "a1bcd efglh";
        String expected = "dcb1a hgfle "; //pofiksit probel posle actual
        String actual = rotator.rotateWord(source,"xl");
        System.out.println("Input sentences from user : 123456 3456.  Answer :");
        System.out.println(rotator.rotateWord(source,"4"));
        assertEquals(expected,actual);
    }



}