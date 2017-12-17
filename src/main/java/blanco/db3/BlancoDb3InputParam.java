package blanco.db3;

/**
 * Blanco Db3 の入力パラメータ。
 */
public class BlancoDb3InputParam {
    /**
     * Name of column.
     */
    private String columnName;

    /**
     * NVARCHAR => java.lang.String<br>
     * ...
     */
    private int columnType = java.sql.Types.NVARCHAR;

    /**
     * 試し打ちのために用いる値。(DBがrollback対応であることが大前提)
     */
    private Object dryrunValue;

    public BlancoDb3InputParam(final String columnName, final int columnType, final Object dryrunValue) {
        this.columnName = columnName;
        this.columnType = columnType;
        this.dryrunValue = dryrunValue;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getColumnType() {
        return columnType;
    }

    public void setColumnType(int columnType) {
        this.columnType = columnType;
    }

    public Object getDryrunValue() {
        return dryrunValue;
    }

    public void setDryrunValue(Object dryrunValue) {
        this.dryrunValue = dryrunValue;
    }
}
