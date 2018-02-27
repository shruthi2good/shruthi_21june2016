package studentprj;

public class Student {



	int id;
	String name;
	double GPA;
	
	
	public Student(int id, String name, double GPA) {
		super();
		this.id = id;
		this.name = name;
		this.GPA = GPA;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", GPA=" + GPA + "]";
	}
	
	
	

}
