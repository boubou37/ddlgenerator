package fr.brdm.sql;

import org.apache.commons.csv.CSVRecord;

public class Column {

    private String name;
    private int num_ID;
    private String OID;
    private String type;
    private int precision;
    private int scale;

    public Column(CSVRecord record) {
        this.load(record);
    }

    private void load(CSVRecord record) {
        this.name = record.get("Column_Name");
        this.OID = record.get("ObjectID");
        this.num_ID = Integer.parseInt(record.get("NumOID"));
        this.type = record.get("Native_Type");
        String numInd = record.get("T_Precision");
        this.precision = numInd.equals("") ?  0 : Integer.parseInt(numInd);
        numInd = record.get("T_Scale");
        this.scale = numInd.equals("") ?  0 : Integer.parseInt(numInd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOID() {
        return OID;
    }

    public void setOID(String OID) {
        this.OID = OID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public int getNum_ID() {
        return num_ID;
    }

    public void setNum_ID(int num_ID) {
        this.num_ID = num_ID;
    }
}
