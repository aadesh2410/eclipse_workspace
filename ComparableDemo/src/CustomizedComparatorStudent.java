import java.util.Comparator;

public class CustomizedComparatorStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		int idComparison = o1.getId() - o2.getId();
		int nameComparison = o1.getName().compareTo(o2.getName());
		
		 	

		return (nameComparison == 0) ? idComparison:nameComparison ;
	}

}
