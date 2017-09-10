package fr.brdm.sql;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceTest {
    Sequence s = new Sequence();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_CorrectSequenceIsGenerated() throws Exception {
        s.getTable().setName("TEST");
        String expected = "CREATE SEQUENCE SEQ_TEST\n" +
                "INCREMENT BY 1\n" +
                "START WITH 1\n" +
                "MINVALUE 1\n" +
                "MAXVALUE 9999999999 CYCLE\n" +
                "CACHE 20;";
        Assert.assertEquals(s.toString().trim(),expected.trim());
    }
}