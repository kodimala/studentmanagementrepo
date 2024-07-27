class Student
{
	private int sid;
	private String sname;
	public Student(int sid,String sname){
	this.sid = sid;
	this.sname = sname;
	}

	public void printDetails(){
	System.out.println("student id: "+sid);
	System.out.println("student name: "+sname);
 	}

	public static void main(String args[]){
	Student s1 = new Student(111,"ravi");
	Student s2 = new Student(222,"Raju");
	s1.printDetails();
	System.out.println("******************************");
	s2.printDetails();
	}
}
	