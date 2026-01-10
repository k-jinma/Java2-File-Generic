package lesson90ex_kai;

import java.util.ArrayList;

public class Ranking {

	public static <E extends Comparable> E getTopStudent(ArrayList<E> list) {
		
		// リストが空の場合はnullを返す
		if( list == null || list.size() == 0 ) {
			return null;
		}
	    
		// まず最初のリストデータを最大のスコアと仮定
	    E top = list.get(0);
	    
	    for( int i = 1; i < list.size(); i++ ) {
	        // 各スコアを比較して、より高いスコアの学生をtopに更新
	    		E current = list.get(i);
	        if( top.compareTo(current ) < 0) {
	            top = current;
	        }
	    }
		
	    return top;
	}
}
