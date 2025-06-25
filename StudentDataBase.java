package rePractice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDataBase { 
	
	private static ArrayList<Student> student=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);
	
	private static void add() {
		System.out.println("Enter Student Id :");
		int id=sc.nextInt();
		if(id<=0) {
			System.out.println("Student id must be greater 1");
			return;
		}
		sc.nextLine();
		System.out.println("Enter Student's Name :");
		String name=sc.nextLine();
		
		System.out.println("Enter Students Mark :");
		double mark=sc.nextDouble();
		
		
		
		student.add(new Student(id,name,mark));
		System.out.println("Student data added Successfully!");
	}
	public static void view() {
		if(student.isEmpty()) {
			System.out.println("No Record Found");
			return;
		}
		System.out.println("\n Students Record");
		for(Student s:student) {
			System.out.println(s);
		}
		
	}
	public static void update() {
		System.out.println("Enter Id for update");
		int id=sc.nextInt();
		sc.nextLine();
		for(Student s:student) {
			if(s.getId()==id) {
				System.out.println("Enter New Name :");
				String name=sc.nextLine();
				System.out.println("Enter New Mark :");
				double mark=sc.nextDouble();
				s.setName(name);
				s.setMark(mark);
				System.out.println("New Data Updated Successfully");
				return;
			}
		}
	}
	public static void delete() {
		System.out.println("Enter id for delete Record :");
		int id=sc.nextInt();
		for(Student s:student) {
			if(s.getId()==id) {
				student.remove(s);
				System.out.println("Record Deleted successfully");
				return;
			}
		}
		System.out.println("Student record with the Id "+id+" not found");
	}
	
	public static void main(String[] args) {
		boolean keepRun=true;
		while(keepRun) {
			System.out.println("\nStudent Record Management");
			System.out.println("1.Add");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("Enter Your Choice :");
			
			int choice=sc.nextInt();
			
			if(choice==5) {
				keepRun=false;
				System.out.println("Exit.....Have a nice day..!");
				return;
			}
			
			switch(choice) {
			case 1 ->add();
			case 2 ->view();
			case 3 ->update();
			case 4 ->delete();
			default -> System.out.println("Invalid input");
			}
		}
	}
}
