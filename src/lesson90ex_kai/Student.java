package lesson90ex_kai;

public class Student implements Comparable<Student> {
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

	@Override
	public int compareTo(Student other) {
		return this.score - other.score;
	}
	
	@Override
	public String toString() {
		return "名前: " + name + ", 点数: " + score;
	}
	
	

}
