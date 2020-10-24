package com.example.foxmidfirst;

import org.junit.After;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert. *;

@RunWith(Parameterized.class)
public class RotatorTest {
    Rotator rotator;
    private String source ="";
    private String ignoreString ="";
    private String expected ="";

    public RotatorTest(String source, String ignoreString, String expected) {
        super();
        this.source = source;
        this.ignoreString = ignoreString;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] {
                {"123456 3456","4","653421 6453"},
                {"Foxminded cool 24/7","0123456789","dednimxoF looc 24/7"},
                {"abcd efgh","0123456789","dcba hgfe"},
                {"Foxminded cool 24/7","xl","dexdnimoF oocl 7/42"},
                {"a1bcd efglh","xl","dcb1a hgfle"},
                {"Foxminded cool 24/7"," ","dednimxoF looc 7/42"},
                {" ","1№;%:?*()_+",""},
                {"          ###.     ","fF",".###"},
                {null,"fF",".###"},
                {"234455",null,"234455"},
                {"Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi","","iogdhslkiohgjusfkdbhgulkcfdhjkbjhfdklgjdesioguresivbgjxkfdhvjkdshuiofhyaseuigfrydsukvhxdjkvghyesuifgtyduieshgfdbghfdghfrdshygsfD"},
                {"Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi","Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi","Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi"},
        });
    }

    @Before
    public void before() {
        rotator = new Rotator();
    }
    @After
    public void after() {
    }
    @Test
    public void test1() {
        String actual = rotator.rotateWord(source,ignoreString);
        assertNotNull(rotator.rotateWord(source,ignoreString));
        assertEquals(expected,actual);
    }
}