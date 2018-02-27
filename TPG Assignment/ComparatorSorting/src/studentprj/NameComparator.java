package studentprj;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{
	IdComparator idComparator;

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.name.equalsIgnoreCase(s2.name)){
			int result=idComparator.compare(s1, s2);
			return result;
		}
		else{
			return s1.name.compareTo(s2.name);  
		}
		
	}
	

}
