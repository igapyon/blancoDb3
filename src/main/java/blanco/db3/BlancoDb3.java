package blanco.db3;

import java.util.List;

/**
 * Blanco Db3 の基本インタフェース。
 * 
 * Query, Execute, Call
 */
public interface BlancoDb3 {
    /**
     * SQLの説明を取得。
     *
     * @return SQLの説明。
     */
    String getDescription();

    /**
     * SQLを取得。
     *
     * @return SQL文字列。
     */
    String getSql();

    /**
     * 入力情報をセットアップ。
     *
     * @param inputParams
     *            セットアップすべき入力情報。
     */
    void setupInputInfo(List<BlancoDb3InputParam> inputParams);
}