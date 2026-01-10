package lesson89;

import java.util.ArrayList;

class ScoreCalculator2<T> {
	
	public double getAverage(ArrayList<T> scores){
		double total = 0.0;
		for( T score : scores ) {
			total += score.doubleValue();
		}
		return total / scores.size();
	}
	
	public double getMax(_______________ scores){
		
		double max = Double.NEGATIVE_INFINITY;
		for( ____ score : scores ) {

			if( score.doubleValue() > max ) {
				max = score.doubleValue();
			}
		}
		return max;
	}
}
