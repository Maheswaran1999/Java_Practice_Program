package collection.java;

public class Student {

	private Integer studentId;

	private String studentName;

	private String studentNative;
	
	public Student(Integer studentId,String studentName,String studentNative) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentNative=studentNative;
	}


	public Integer getStudentID() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentNative() {
		return studentNative;

	}
}
