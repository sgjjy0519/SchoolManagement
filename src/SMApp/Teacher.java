package SMApp;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	public int getId() { //선생님 ID반환
		return id;
	}
	
	public String getName() { //선생님 이름반환
		return name;
	}
	
	public int getSalary() { //선생님 봉급 반환
		return salary;
	}
	
	public void setSalary(int salary) { //선생님 봉급저장
		this.salary = salary;
	}
	
	public void receiveSalary(int salary) { //선생님 봉급 추가, 학교 총지출
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	public String toString(){
		return "선생님 이름 : "+name+", 총 급여 : "+salaryEarned+"원";
	}
}
