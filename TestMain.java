import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//$Id$

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int ch;
		boolean found = false;
		List<StudentDetails> ls = new LinkedList<StudentDetails>();
		ls.add(new StudentDetails(1,"18CSE011","Sakthi","CSE",18,"I","9878401290","Villapuram",97.5,7));
		ls.add(new StudentDetails(2,"19CSE012","Ram","CSE",19,"II","9764532129","Anna Nagar",98.25,1));
		ls.add(new StudentDetails(3,"20CSE013","Ritu","CSE",20,"III","7890321224","Avaniyapuram",92,9));
		ls.add(new StudentDetails(4,"21CSE014","Arjun","CSE",21,"IV","8879012766","KK Nagar",91,10));
		ls.add(new StudentDetails(5,"18ECE020","Raji","ECE",18,"I","1234567890","Villapuram",98,2));
		ls.add(new StudentDetails(6,"19ECE021","Kanna","ECE",19,"II","0987654321","Anna Nagar",95.25,4));
		ls.add(new StudentDetails(7,"18ECE022","Shiva","ECE",20,"III","2468097531","Avaniyapuram",96,6));
		ls.add(new StudentDetails(8,"18ECE023","James","ECE",21,"IV","1357908642","KK Nagar",95,5));
		
		Iterator<StudentDetails> i = ls.iterator();
//		while(i.hasNext()) {
//			StudentDetails s = i.next();
//			System.out.println(s);
//		}
		do {
			System.out.println("========== Searching ==========");
			System.out.println("1.Search by Student ID");
			System.out.println("2.Search by Roll Number");
			System.out.println("3.Search by Name");
			System.out.println("4.Search by Department");
			System.out.println("5.Search by Age");
			System.out.println("6.Search by Year");
			System.out.println("7.Search by Phone Number");
			System.out.println("8.Search by Rank");
			System.out.print("Enter Choice : ");
			ch = sc.nextInt();
			
			
			switch(ch) {
			case 1:
				System.out.print("Enter Student Id to search.....");
				int studentId = sc.nextInt();
		        i = ls.iterator();
				while(i.hasNext()) {
					found = false;
					StudentDetails s = i.next();
					if(s.getStudentId() == studentId) {
						System.out.println(s);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");
				}
				break;
			case 2:
				System.out.print("Enter Roll Number to search.....");
				String rollNo = sc1.next();
		        i = ls.iterator();
				while(i.hasNext()) {
					found = false;
					StudentDetails s = i.next();
					if(s.getRollNo().equals(rollNo)) {
						System.out.println(s);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");
				}
				break;
			case 3:
				System.out.print("Enter Name to search.....");
				String name = sc1.next();
		        i = ls.iterator();
				while(i.hasNext()) {
					found = false;
					StudentDetails s = i.next();
					if(s.getName().equals(name)) {
						System.out.println(s);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");
				}
				break;
			case 4:
				System.out.print("Enter Department to search.....");
				String dept = sc1.next();
		        i = ls.iterator();
				while(i.hasNext()) {
					found = false;
					StudentDetails s = i.next();
					if(s.getDept().equals(dept)) {
						System.out.println(s);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");
				}
				break;
			case 5:
				System.out.print("Enter Age to search.....");
				int age = sc.nextInt();
		        i = ls.iterator();
				while(i.hasNext()) {
					found = false;
					StudentDetails s = i.next();
					if(s.getAge() == age) {
						System.out.println(s);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");
				}
				break;
			case 6:
				System.out.print("Enter Year to search.....");
				String year = sc1.next();
		        i = ls.iterator();
				while(i.hasNext()) {
					found = false;
					StudentDetails s = i.next();
					if(s.getYear().equals(year)) {
						System.out.println(s);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");
				}
				break;
			case 7:
				System.out.print("Enter Phone Number to search.....");
				String phNo = sc1.next();
		        i = ls.iterator();
				while(i.hasNext()) {
					found = false;
					StudentDetails s = i.next();
					if(s.getPhoneNumber().equals(phNo)) {
						System.out.println(s);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");
				}
				break;
			case 8:
				System.out.print("Enter Student Id to search.....");
				int rank = sc.nextInt();
		        i = ls.iterator();
				while(i.hasNext()) {
					found = false;
					StudentDetails s = i.next();
					if(s.getRank() == rank) {
						System.out.println(s);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found");
				}
				break;
			}
		}while(ch!=0);
		
		

	}

}
