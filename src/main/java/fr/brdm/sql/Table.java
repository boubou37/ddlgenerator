package fr.brdm.sql;

import org.apache.commons.csv.CSVRecord;

public class Table {

    private String OID;
    private int num_ID;
    private String name;

    public String getOID() {
        return OID;
    }

    public void setOID(String OID) {
        this.OID = OID;
    }

    public int getNum_ID() {
        return num_ID;
    }

    public void setNum_ID(int num_ID) {
        this.num_ID = num_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Table() {
    }

    public Table(CSVRecord record) {
        this.load(record);
    }

    private void load(CSVRecord record) {
        this.OID = record.get("ObjectID");
        this.num_ID = Integer.parseInt(record.get("NumOID"));
        this.name = record.get("Table_Name");
    }

}
