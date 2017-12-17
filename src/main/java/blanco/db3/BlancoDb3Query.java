package blanco.db3;

/**
 * Blanco Db3 の検索。
 */

public interface BlancoDb3Query extends BlancoDb3 {
    /**
     * 検索結果が１行になるSQLかどうか。
     * 
     * @return trueなら1行限定のSQL
     */

    boolean isSingleRow();

    /**
     * このSQLは FORWARD ONLY かどうか。
     * 
     * @return FORWARD ONLY ならtrue。
     */

    boolean isForwardOnly();

    /**
     * このSQLは 更新可能かどうか。
     * 
     * @return 更新可能ならtrue。
     */

    boolean isUpdatable();

    // isDynamic ???

    // isParameterBean ???
}