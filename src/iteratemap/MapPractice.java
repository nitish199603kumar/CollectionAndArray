package iteratemap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapPractice {

	public static void main(String args[]) {

		Map<String,Student> hm = new HashMap<>();
		
		
		hm.put("a", new Student(1,"nitish"));
		hm.put("b", new Student(2,"gautam"));
		hm.put("c", new Student(3,"rohit"));
		
//		hm.put("a", 1);
//		hm.put("b", 2);
//		hm.put("c", 3);
//		hm.put("d", 4);

		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
//		for(String s:hm.keySet())
//		{
//			Integer value1=hm.get(s);
//			System.out.println("KeySet is " +s + "Value" +value1);
//		}
//		
//		for(Integer i:hm.values())
//		{
//			Object k=hm.get(i);
//			System.out.println(" Values " +i+"keyset is" +k);
//		}
	
		
//		hm.forEach((k,v)->{
//			
//			System.out.println("key" + k + "value" +v);
//		});
//		System.out.println(hm.containsKey("c"));
		
//	System.out.println(hm.containsKey("b"));
		
//		for(String key:hm.keySet())
//		{
//			if(key.contains("b"))
//			{
//				System.out.println("hhskks");
//			}
//			else{
//				System.out.println("hi hi");
//			}
//		}
//		
		for(Student value:hm.values())
		{
			
			if(value.getName().contains("rohit"))
			{
				System.out.println("Value is" +value);
			}else{
				System.out.println("Value Not Found ");
			}
		}
	
//		for(Map.Entry<String,Student> e:hm.entrySet() )
//		{
//			
//			
//			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.print(e.getValue().getRolNo());
//			System.out.println(e.getValue().getName());
//			
//		}
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
