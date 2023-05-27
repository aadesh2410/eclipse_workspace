
public class Employee implements Comparable<Employee> {

	int id;
	String name;
	String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	//our sorting order using id 
	@Override
	public int compareTo(Employee employee) {
		if (id == employee.id) {
			return 0;
		} else if (id > employee.id) {
			return 1;

		} else {
			return -1;
		}

	}

}
