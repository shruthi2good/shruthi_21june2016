package studentprj;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {
	NameComparator nameComparator;
	
	@Override
	public int compare(Student s1, Student s2) {
		int flag;
		if(s1.GPA==s2.GPA){
			/*System.out.println("Entering compare in GPa"+s1.toString()+"and "+s2.toString());
			flag= nameComparator.compare(s1, s2);*/
			return 0;
			
	
		}
		else if (s1.GPA>s2.GPA){
			return 1;
		}
		else{
			return -1;
			
		}
		
}
			
		
		
	}
	
	


