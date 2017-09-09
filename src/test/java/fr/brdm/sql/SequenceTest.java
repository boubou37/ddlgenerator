package fr.brdm.sql;

import org.junit.After;
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
    public void test1() throws Exception {
        s.getTable().setName("BLOBBY");
        System.out.println(s.toString());
    }
}