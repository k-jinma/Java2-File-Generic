package lesson86;

class BoxUser {

	public static void main(String[] args) {
		
        // String専用のBoxを作成
        BoxKai<String> stringBox = new BoxKai<String>();
        stringBox.set("Hello, Generics!");
        
        String message = stringBox.get(); // キャスト不要
        System.out.println(message);

        
        // Integer専用のBoxを作成
        BoxKai<Integer> integerBox = new BoxKai<>(); // ダイヤモンド演算子による省略記法
        integerBox.set(2025);
        
        Integer year = integerBox.get(); // キャスト不要
        System.out.println(year);

	}

}
