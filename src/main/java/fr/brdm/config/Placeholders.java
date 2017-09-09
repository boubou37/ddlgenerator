package fr.brdm.config;

public class Placeholders {

    public static final String SEQUENCE = "CREATE SEQUENCE ${prefix}${seq}" + '\n' +
        "INCREMENT BY ${inc}" + '\n' +
        "START WITH ${start}" + '\n' +
        "MINVALUE ${min}" + '\n' +
        "MAXVALUE ${max} CYCLE" + '\n' +
        "CACHE ${cache};";
}
