package com.example.foxmidfirst;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert. *;

public class RotatorTest {
    Rotator rotator;

    @Before
    public void before() {
        rotator = new Rotator();

    }

    @After
    public void after() {

    }
    @Test
    public void test1() {
        String source = "123456 3456";
        String expected = "653421 6453";
        String actual = rotator.rotateWord(source,"4");
        assertEquals(expected,actual);
    }
    @Test
    public void test2() {
        String source = "Foxminded cool 24/7";
        String expected = "dednimxoF looc 24/7";
        String actual = rotator.rotateWord(source,"0123456789");
        assertEquals(expected,actual);
    }
    @Test
    public void test3() {
        String source = "abcd efgh";
        String expected = "dcba hgfe";
        String actual = rotator.rotateWord(source,"0123456789");
        assertEquals(expected,actual);
    }
    @Test
    public void test4() {
        String source = "Foxminded cool 24/7";
        String expected = "dexdnimoF oocl 7/42";
        String actual = rotator.rotateWord(source,"xl");
        assertEquals(expected,actual);
    }
    @Test
    public void test5() {
        String source = "a1bcd efglh";
        String expected = "dcb1a hgfle";
        String actual = rotator.rotateWord(source,"xl");
        assertEquals(expected,actual);
    }
    @Test
    public void test6() {
        String source = "Foxminded cool 24/7";
        String expected = "dednimxoF looc 7/42";
        String actual = rotator.rotateWord(source," ");
        assertEquals(expected,actual);
    }
    @Test
    public void test7() {
        String source = " ";
        String expected = "";
        String actual = rotator.rotateWord(source,"1№;%:?*()_+");
        assertEquals(expected,actual);
    }
    @Test
    public void test8() {
        String source = "Foxminded cool 24/7";
        String expected = "dednimxoF looc 7/42";
        String actual = rotator.rotateWord(source,"f");
        assertEquals(expected,actual);
    }
    @Test
    public void test9() {
        String source = "";
        String expected = "";
        String actual = rotator.rotateWord(source,"fF");
        assertEquals(expected,actual);
    }
    @Test
    public void test10() {
        String source = "          ###.     ";
        String expected = ".###";
        String actual = rotator.rotateWord(source,"fF");
        assertEquals(expected,actual);
    }
    @Test
    public void test11() {
        String source = "авджылпроыводкрплыврплыфрплыкрвпшгукрлгдпрвыалпрлвоарплдырпдорыдопордлоыврплоаитвмбчятсмловиыаплоррывлпоруыдподывропловаипмлварплоывфралорывлопитвальмилвоарплоывраплоыфрплодвыармлочаитмлваориплмовырплоыврплоаворпло";
        String expected = "олпроваолпрвыолпрывомлпироавлмтиачолмраывдолпрфыолпарвыолпраовлимьлавтиполвыроларфвыолправлмпиаволпорвыдопдыуроплвырролпаыиволмстячбмвтиаолпрвыолдроподыродпрыдлпраовлрплаыврпдглркугшпвркылпрфылпрвылпркдовыорплыждва";
        String actual = rotator.rotateWord(source,"0");
        assertEquals(expected,actual);
    }
    @Test
    public void test12() {
        String source = "";
        String expected = "";
        String actual = rotator.rotateWord(source,"fF");
        assertEquals(expected,actual);
    }





}