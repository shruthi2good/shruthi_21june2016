package studentprj;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(33,"Tina",3.68));
		a1.add(new Student(85,"Louis",3.85));
		a1.add(new Student(56,"Samil",3.75));
		a1.add(new Student(19,"Samar",3.75));
		a1.add(new Student(22,"Lorry",3.76));
		
	

		
	System.out.println("Sorting by GPA..."); 
	Collections.sort(a1,new GPAComparator());
	Collections.reverse(a1);
		
	for(Student st:a1)
	{
		System.out.println(st.id+" "+st.name+" "+st.GPA);
	}
	
}
}
