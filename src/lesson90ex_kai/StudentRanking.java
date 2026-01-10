package lesson90ex_kai;

import java.util.ArrayList;

public class StudentRanking {

	public static void main(String[] args) {

		// 学生リストを作成
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("田中", 85));
        students.add(new Student("佐藤", 95));
        students.add(new Student("鈴木", 78));
        students.add(new Student("高橋", 92));
        students.add(new Student("伊藤", 88));
        
        // 最も点数の高い学生を取得
        Student s =  Ranking.getTopStudent(students);
        System.out.println("最も点数の高い学生: " + s);
        
	}

}
