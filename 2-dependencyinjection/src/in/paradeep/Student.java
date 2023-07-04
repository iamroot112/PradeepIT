package in.paradeep;

public class Student {
	private String studentname;
	
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public void displaystudentinfo() {
		System.out.println("studentname is:"+studentname+" and  id is "+id);
	}
}
