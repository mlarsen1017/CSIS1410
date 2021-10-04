public class Main 
{

	public static void main(String[] args) 
	{
		
		Employee e1 = new Employee(123456);
		Employee e2 = new Employee(654321);
		Employee e3 = new Employee(789101);
		
		e3.setFirstName("Elmer");
		e3.setLastName("Fudd");
		e3.setStatus('i');
		e3.setTitle("CEO");
		e3.setSalary(200000.00);
		e3.setAge(60);
		
		e2.setFirstName("Daffy");
		e2.setLastName("Duck");
		e2.setStatus('p');
		e2.setTitle("Software Engineer");
		e2.setSalary(100000.00);
		e2.setAge(40);
		
		e1.setFirstName("Bugs");
		e1.setLastName("Bunny");
		e1.setStatus('f');
		e1.setTitle("Manager");
		e1.setSalary(150000.00);
		e1.setAge(70);
		
		
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();

	}

}
