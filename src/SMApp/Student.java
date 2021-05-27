package SMApp;
// 학생 추적 (학생의 ID, 이름, 학급, 성적, 납부한 학비, 총 학비 )
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	
	public Student(int id, String name, int grade) { //생성자, 초기화
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 3000000;
	}
	
	public void setGrade(int grade) {  //성적 업데이트
		this.grade = grade;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;  //학비지불할때마다 납부한학비에 추가
		School.updateTotalMoneyEarned(feesPaid); //학교자금추가
	}
	
	public int getId() { //학생id 반환
		return id;
	}
	
	public String getName() { //학생이름 반환
		return name;
	}
	
	public int getGrade() { //학생점수 반환
		return grade;
	}
	
	public int getFeesPaid() { //납부한학비 반환
		return feesPaid;
	}
	
	public int getFeesTotal() { //총 학비 반환
		return feesTotal;
	}
	
	public String toString() {
		return "학생 이름 :"+name + "납부된 학비(금액) : "+feesPaid+"원";
	}
}
