package practice1_1;

import java.math.BigDecimal;

/**
 * ユーティリティクラス　
 * @author softem-n13
 *
 */
public class Util {
	/**
	 * 引数の文字にhogeを追加して返す
	 * @param arg　引数の文字
	 * @return　hogeを追加した文字列
	 */
	public static String addHoge(String arg){
		return arg + "hoge";
	}

	/**
	 * 小数同士の足し算
	 * @param d1　小数１
	 * @param d2　小数２
	 *
	 * @return　計算結果
	 */
	public static double dAdd(double d1, double d2){
		return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue();
	}
}
