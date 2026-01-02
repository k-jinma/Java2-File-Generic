package lesson88;

class PairExampleKai {

	public static void main(String[] args) {
		
		// 学生名と得点のペア
        PairKai<String, Integer> student1 = new PairKai<>("田中太郎", 85);
        PairKai<String, Integer> student2 = new PairKai<>("佐藤花子", 92);
        
        System.out.println("学生1: " + student1);
        System.out.println("学生2: " + student2);
        
        // 商品名と価格のペア
        PairKai<String, Double> product1 = new PairKai<>("ノートPC", 89800.0);
        PairKai<String, Double> product2 = new PairKai<>("マウス", 2980.0);
        
        System.out.println("商品1: " + product1);
        System.out.println("商品2: " + product2);
        
        // ユーザーIDと登録日時のペア
        PairKai<Integer, String> user = new PairKai<>(12345, "2025-01-15");        
        System.out.println("ユーザー情報: " + user);

	}

}
