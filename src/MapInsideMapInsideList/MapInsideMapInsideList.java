package MapInsideMapInsideList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInsideMapInsideList {

	public static void main(String[] args) {

		Map<String, Map<String, List<Student>>> map = new HashMap<>();
		Student std1 = new Student(1, "nitish");
		Student std2 = new Student(2, "aman");

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(std1);
		studentList.add(std2);
		Map<String, List<Student>> mapStd = new HashMap<String, List<Student>>();
		mapStd.put("student1", studentList);

		map.put("std1", mapStd);

		System.out.println("Map " + map.toString());

		for (Map.Entry<String, Map<String, List<Student>>> map1 : map.entrySet()) {
			System.out.println("Map1 : " + map1);

			String key1 = map1.getKey();
			System.out.println("Key1 : " + key1);

			System.out.println("Class :" + map1.getClass());

			Map<String, List<Student>> value1 = map1.getValue();
			System.out.println("value1 : " + value1);

			for (Map.Entry<String, List<Student>> map2 : value1.entrySet()) {
				String key2 = map2.getKey();
				System.out.println("Key2 : " + key2);

				List<Student> value2 = map2.getValue();
				System.out.println("value2 : " +value2);
				
				for (int i=0;i<value2.size();i++)
				{
					Student student = value2.get(i);
					
					System.out.println("Id : " +student.getId() + " | "+ " Name " +student.getName());
				}
			}
		}

	}

}

class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}