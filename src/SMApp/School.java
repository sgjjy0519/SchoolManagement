package SMApp;

import java.util.List; //List - 중복을 허용하면서 저장순서 유지되는 컬렉션

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	public List<Teacher> getTeachers(){ //선생님 리스트
		return teachers;
	}
	
	public void addTeacher(Teacher teacher) { //선생님 추가
		teachers.add(teacher);
	}
	
	public List<Student> getStudents(){ //학생 리스트
		return students;
	}
	
	public void addStudent(Student student) { //학생 추가
		students.add(student);
	}
	
	public int getTotalMoneyEarned() { //학교 총 수입
		return totalMoneyEarned;
	}
	
	public static void updateTotalMoneyEarned(int MoneyEarned) { //수익을 학교수입에 추가
		totalMoneyEarned += MoneyEarned;
	}
	
	public int getTotalMoneySpent() { //학교 총 지출
		return totalMoneySpent;
	}
	
	public static void updateTotalMoneySpent(int moneySpent) { //지출 발생 시 학교 총수입에서 삭제
		totalMoneyEarned -= moneySpent;
	}
	
}
