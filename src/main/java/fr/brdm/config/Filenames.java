package fr.brdm.config;

public enum Filenames {
    TABLES ("DM_Tables.CSV"),
    COLUMNS ("DM_Columns.CSV"),
    FK ("DM_ForeignKeys.CSV"),
    INDEXES ("DM_Indexes.CSV");
    private final String name;

    private Filenames(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
