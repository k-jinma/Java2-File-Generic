package lesson90ex;

public class Student implements Comparable {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}


	// ComparableインターフェースのcompareToメソッドを実装
	
	
	
	@Override
	public String toString() {
		return "名前: " + name + ", 点数: " + score;
	}
	
	

}
