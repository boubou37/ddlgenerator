package fr.brdm.sql;

import fr.brdm.config.Placeholders;
import org.apache.commons.lang3.text.StrSubstitutor;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Sequence {

    public final static String PREFIX = "SEQ_";

    private Table table;
    private String sequenceName;
    private int increment;
    private int startValue;
    private int minValue;
    private BigInteger maxValue;
    private int cache;

    public Sequence() {
        this.increment = 1;
        this.startValue = 1;
        this.minValue = 1;
        this.maxValue = new BigInteger("9999999999");
        this.cache = 20;
        this.table = new Table();
    }

    public Sequence(int increment, int startValue, int minValue, BigInteger maxValue, int cache) {
        this.increment = increment;
        this.startValue = startValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.cache = cache;
        this.table = new Table();
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getStartValue() {
        return startValue;
    }

    public void setStartValue(int startValue) {
        this.startValue = startValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public BigInteger getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigInteger maxValue) {
        this.maxValue = maxValue;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public String toString() {
        if (this.table == null) {
            return "";
        }
        String tableName = this.table.getName();

        if (tableName.length() > 30 - PREFIX.length()) {
            tableName = tableName.substring(0,30);
        }
        Map<String,String> values = new HashMap<String, String>();
        values.put("prefix",String.valueOf(PREFIX));
        values.put("inc",String.valueOf(increment));
        values.put("seq",String.valueOf(tableName));
        values.put("start",String.valueOf(startValue));
        values.put("min",String.valueOf(minValue));
        values.put("max",String.valueOf(maxValue));
        values.put("cache",String.valueOf(cache));
        return StrSubstitutor.replace(Placeholders.SEQUENCE,values);
    }
}
