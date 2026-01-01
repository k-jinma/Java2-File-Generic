package lesson86;

//<T> という「型変数」を使ってジェネリクスクラスを定義する
class BoxKai<T> {
	// フィールドの型として T を使用
	private T content;

	// メソッドの引数の型として T を使用
	public void set(T content) {
		this.content = content;
	}

	// メソッドの戻り値の型として T を使用
	public T get() {
		return this.content;
	}

}
