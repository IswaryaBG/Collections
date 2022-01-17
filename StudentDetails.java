//$Id$

public class StudentDetails {
	int studentId;
	String rollNo;
	String name;
	String dept;
	int age;
	String year;
	String phoneNumber;
	String address;
	double marks;
    int rank;
    
	public StudentDetails(int studentId, String rollNo, String name, String dept, int age, String year, String phoneNumber, String address, double marks, int rank) {
		super();
		this.studentId = studentId;
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.year = year;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.marks = marks;
		this.rank = rank;
	}
	
	
	
	@Override
	public String toString() {
		return "studentId=" + studentId + ", rollNo=" + rollNo + ", name=" + name + 
				", dept=" + dept + ", age=" + age + ", year=" + year + ", phoneNumber=" + phoneNumber + 
				", address=" + address + ", marks=" + marks + ", rank=" + rank ;
	}


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
   
	
}
