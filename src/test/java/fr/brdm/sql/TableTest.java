package fr.brdm.sql;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import static org.junit.Assert.fail;


public class TableTest {
    Reader tableFile = null;
    CSVParser csvp = null;
    Table table = null;

    @Before
    public void setUp() throws Exception {
        tableFile = new FileReader(this.getClass().getClassLoader().getResource("DM_TABLES.csv").getPath());
        csvp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(tableFile);
    }

    @Test
    public void test_TableParsingGetsTheRightAttributes() throws Exception {
        if (tableFile == null) fail();
        List<CSVRecord> records = csvp.getRecords();
        Assert.assertEquals(records.size(),2);
        CSVRecord firstRec = records.get(0);
        table = new Table(firstRec);

        Assert.assertEquals(table.getName(),"Company");
        Assert.assertEquals(table.getNum_ID(),70);
        Assert.assertEquals(table.getoID(),"079EE98F-B33B-EE29-5ABB-7A93465C4D7E");
    }

}