package studentclassinlist;

import java.util.ArrayList;
import java.util.List;

public class ListPractice1 {

	public static void main(String[] args) {
		
		List<Student> lt=new ArrayList<>();
		
		lt.add(new Student(1,"nitish"));
		lt.add(new Student(2,"ram"));
		System.out.println(lt);
		for(Student st:lt)
		{
			String name = st.getName();
			Integer rolNo = st.getRolNo();
			System.out.println("RollNo" +rolNo+"Name" +name);
		}
		
//		lt.add(1);
//		lt.add(2);
//		lt.add(3);
//		
//		System.out.println(lt);
//		System.out.println(lt.get(0));
//		lt.set(2, 9);
//		
//		System.out.println(lt.get(2));
//		System.out.println(lt);
//		
//		for(Integer i:lt)
//		{
//			System.out.println(i);
//			
//		}
//		for(int i=0;i<=lt.size();i++)
//		{
//			System.out.println(lt.get(0));
//			
//		}
//		

	}
}
class Student
{
	private Integer rolNo;
	private String name;
	
	@Override
	public String toString() {
		return "Student [rolNo=" + rolNo + ", name=" + name + "]";
	}
	public Student(Integer rolNo, String name) {
		super();
		this.rolNo = rolNo;
		this.name = name;
	}
	public Integer getRolNo() {
		return rolNo;
	}
	public void setRolNo(Integer rolNo) {
		this.rolNo = rolNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

