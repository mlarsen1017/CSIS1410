
public class Employee 
{
	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary;
	String status;
	
	public Employee(int employeeID)
	{
		this.employeeID = employeeID;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(char status) 
	{
	
		if (status == 'f' || status == 'F')
		{
			this.status = "Full-Time";
		}
		else if (status == 'p' || status == 'P') 
		{
			this.status = "Part-Time";
		}
		else if (status == 'c' || status == 'C')
		{
			this.status = "Comission";
		}
		else if (status == 'i' || status == 'I')
		{
			this.status = "Intern";
		}
		else
		{
			this.status = "Unknown"; 
		}
	}

	public int getEmployeeID() 
	{
		return employeeID;
	}
	
	public void printEmployee()
	{
		System.out.println("Employee ID: " + this.employeeID + " Name: " + this.firstName 
							+ " " + this.lastName + " Status: " + this.status + " Age: " + this.age
							+ " Title: " + this.title + " Salary: $" + this.salary);
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	

}
