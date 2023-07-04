package collection.java;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentDemo {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList();

		list.add(new Student(10, "Mahes", "rajapalayam"));
		list.add(new Student(11, "Sachin", "Mumbai"));
		list.add(new Student(7, "Dhoni", "delhi"));


	boolean boo= list.stream().iterator().equals(list.get(1));
	System.out.println(boo);
		for (Student student : list) {
			System.out.println(
					student.getStudentName() + " " + student.getStudentNative() + " " + student.getStudentID());
		}

		// Map<Integer, String> map = new HashMap();
		// for (Student studentList : list) {
		// map.put(studentList.getStudentID(), studentList.getStudentName());
		// }

		Map<Integer, String> obj = list.stream()
				.collect(Collectors.toMap(Student::getStudentID, Student::getStudentName));
		System.out.println(obj);
	}

}
