package fr.brdm;

import fr.brdm.config.Filenames;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        /*
        CSVParser csvp = null;
        try {
            Reader f = new FileReader("src/main/java/fr/brdm/DM_Indexes.csv");
            csvp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(f);
            for (CSVRecord rec : csvp) {
                System.out.println(rec.get("ObjectID"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        //current version only handle current directory
        File f = new File("test-res/"+ Filenames.INDEXES);
        System.out.println(f.getAbsolutePath());
    }

}
