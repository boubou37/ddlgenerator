package fr.brdm.sql;

import fr.brdm.config.Filenames;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import static org.junit.Assert.fail;


public class ColumnTest {
    Reader columnFile = null;
    CSVParser csvp = null;
    Column column = null;

    @Before
    public void setUp() throws Exception {
        columnFile = new FileReader(this.getClass().getClassLoader().getResource(Filenames.COLUMNS.toString()).getPath());
        csvp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(columnFile);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test_ColumnsLoadsCorrectly() throws Exception {
        if (columnFile == null) fail();
        List<CSVRecord> records = csvp.getRecords();
        Assert.assertEquals(records.size(),5);
        CSVRecord firstRec = records.get(0);
        column = new Column(firstRec);

        Assert.assertEquals(column.getName(),"FirstName");
        Assert.assertEquals(column.getNum_ID(),72);
        Assert.assertEquals(column.getOID(),"3ED48CFD-36BF-2F53-ACCC-A3E5490E1253");
        Assert.assertEquals(column.getScale(),0);
        Assert.assertEquals(column.getPrecision(),0);
    }
}