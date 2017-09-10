package fr.brdm.config;

public class Placeholders {

    public static final String SEQUENCE = "CREATE SEQUENCE ${prefix}${seq}" + '\n' +
        "INCREMENT BY ${inc}" + '\n' +
        "START WITH ${start}" + '\n' +
        "MINVALUE ${min}" + '\n' +
        "MAXVALUE ${max} CYCLE" + '\n' +
        "CACHE ${cache};";

    public static final String COLUMN = "${name} ${type} (${precision}${scale}) ";

    public static final String INDEX = "CREATE INDEX ${prefix}${name} ON ${table}(${col}) TABLESPACE ${tablespace};";

    public static final String FOREIGNKEY = "ALTER TABLE ${table}  ADD CONSTRAINT ${prefix}${name} \n" +
            "\tFOREIGN KEY ( ${column} ) REFERENCES ${refTable}( ${refPK} );";

    public static final String TRIGGER = "CREATE OR REPLACE TRIGGER ${prefix}${name}\n" +
            "BEFORE INSERT \n" +
            "ON ${table}\n" +
            "FOR EACH ROW \n" +
            "BEGIN \n" +
            "select ${seq}.nextval into :NEW.${table_pk} from dual;\n" +
            "END ${prefix}${name} \n" +
            "/";
}
