package SMApp;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher gerrard = new Teacher(1,"Gerrard",7000);
		Teacher hendo = new Teacher(2,"Hendo",5000);
		Teacher thiago = new Teacher(3,"Thiago",6000);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(gerrard);
		teacherList.add(hendo);
		teacherList.add(thiago);
		
		Student taa = new Student(1,"Taa",4);
		Student robo = new Student(2,"Robo",5);
		Student gomez = new Student(3,"Gomez",12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(taa);
		studentList.add(robo);
		studentList.add(gomez);
		
		School sc = new School(teacherList, studentList);
		
		Teacher vvd = new Teacher(5,"VVD",3000);
		sc.addTeacher(vvd);
		
		taa.payFees(2500000);
		robo.payFees(2800000);
		System.out.println("학교 수익 :"+sc.getTotalMoneyEarned());
		
		System.out.println("===학교 내 봉급 지원===");
		gerrard.receiveSalary(gerrard.getSalary());
		System.out.println(gerrard+"지급");
		
		thiago.receiveSalary(thiago.getSalary());
		System.out.println(thiago+"지급");
		
		
		System.out.println(gomez);
		
		vvd.receiveSalary(vvd.getSalary());
		
		System.out.println(vvd);
	}

}
