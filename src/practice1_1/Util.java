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
	 * @param arg
	 * @return
	 */
	public static String addHoge(String arg){
		return arg + "hoge変更しました。";
	}

	/**
	 * 小数の足し算
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double dAdd(double d1, double d2){
		return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue();
	}
}
