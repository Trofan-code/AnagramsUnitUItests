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

}