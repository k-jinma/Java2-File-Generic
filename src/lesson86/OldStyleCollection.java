package lesson86;

import java.util.ArrayList;

class OldStyleCollection {

	public static void main(String[] args) {

		// ジェネリクスがない時代のArrayList
		ArrayList list = new ArrayList();

		// 様々な型のデータを追加できてしまう
		list.add("こんにちは"); // String型
		list.add(123); // Integer型
		list.add(3.14); // Double型

		System.out.println("リストの中身: " + list);

		String message = (String) list.get(0); // キャストが必要
		System.out.println("取り出したメッセージ: " + message.length() + "文字");

		Integer number = (Integer) list.get(1); // キャストが必要
		System.out.println("取り出した数値: " + (number + 7));
		
		// 勘違い：1番目の中身をString型として取り出そうとする
		//System.out.println("1番目の中身はIntegerなのに、Stringにキャストしてみる…");
		//String wrongCast = (String) list.get(1); // ここでコンパイルエラーは起きない！

	}

}
