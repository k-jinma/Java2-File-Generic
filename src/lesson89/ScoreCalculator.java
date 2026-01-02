package lesson89;

import java.util.ArrayList;

class ScoreCalculator<T> {
	
	// doubleValue() メソッドを持つクラスであるかどうか確認するメソッド
	void test() {
		Double d = 10.5;
		d.__________();
		
		Integer i = 10;
		i.__________();
		
		String s = "Hello";
		s.__________(); // コンパイルエラー
	}

	public <T> double getAverage(ArrayList<T> scores){
		double total = 0.0;
		for( T score : scores ) {
			total += score.doubleValue();
		}
		return total / scores.size();
	}
}
