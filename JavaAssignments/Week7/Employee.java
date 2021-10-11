import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Employee 
{
	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary;
	String status;
	
	int supervisor_id;
	boolean bonus;
	String department;
	int insurance;
	String hiredate;
	String phone;
	
	public Employee(int employeeID) throws IOException
	{
		this.employeeID = employeeID;
		getEmployee(this.employeeID);
	}
	
	public int getEmployeeID() 
	{
		return employeeID;
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
		if (status == 'F')
		{
			this.status = "Full-Time";
		}
		else if (status == 'P') 
		{
			this.status = "Part-Time";
		}
		else if (status == 'C')
		{
			this.status = "Comission";
		}
		else if (status == 'I')
		{
			this.status = "Intern";
		}
		else
		{
			this.status = "Unknown"; 
		}
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
		if (this.bonus)
		{
			this.salary = salary + 1000.00;
		}
		else
		{
			this.salary = salary;
		}
		
		if (this.insurance == 1)
		{
			this.salary = this.salary - 2000.00;
		}
		else if (this.insurance == 2)
		{
			this.salary = this.salary - 1500.00;
		}
		else if (this.insurance == 3)
		{
			this.salary = this.salary - 1000.00;
		}
		else if (this.insurance == 4)
		{
			this.salary = this.salary - 500.00;
		}
	}

	public int getSupervisor_id() 
	{
		return supervisor_id;
	}

	public void setSupervisor_id(int supervisor_id) 
	{
		this.supervisor_id = supervisor_id;
	}

	public boolean isBonus() 
	{
		return bonus;
	}

	public void setBonus(int i) 
	{
		if (i == 1)
		{
			this.bonus = true;
		}
		else
		{
			this.bonus = false;
		}
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public int getInsurance() 
	{
		return insurance;
	}

	public void setInsurance(int insurance) 
	{
		this.insurance = insurance;
	}

	public String getHiredate() 
	{
		return hiredate;
	}

	public void setHiredate(String hiredate) 
	{
		this.hiredate = hiredate; 
		//this.hiredate = this.hiredate.substring(0,1) + "/" + this.hiredate.substring(2,3) + "/" + this.hiredate.substring(4,7);
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = "(" + phone.substring(0,3) + ")" + phone.substring(3,6) + "-" + phone.substring(6,10);
	}
	
	private void getEmployee(int id) throws IOException
	{
		File fileName = new File("EmployeeData.csv");
		if (fileName.exists() && fileName.canRead())
		{
			String cvsSplitBy = ",";
			String line = "";
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			if (id != 1)
			{
				for (int i = (id - 1); i > 0; i--)
				{
					br.readLine();
				}
			}
			
			line = br.readLine();
			String[] employee = line.split(cvsSplitBy);
			
			
			
		
			
			setStatus(employee[6].charAt(0));
			setFirstName(employee[1]);
			setLastName(employee[2]);
			setAge(Integer.parseInt(employee[3]));
			setTitle(employee[4]);
			setBonus(Integer.parseInt(employee[8]));
			setInsurance(Integer.parseInt(employee[10]));
			setSalary(Double.parseDouble(employee[5]));
			
			setSupervisor_id(Integer.parseInt(employee[7]));
			setDepartment(employee[9]);
			setHiredate(employee[11]);
			setPhone(employee[12]);
		}
	}
	
	public void printEmployee()
	{
		String supervisorName;
		String insuranceOption;
		
		if (supervisor_id == 1)
		{
			supervisorName = "Billy Bob";
		}
		else if (supervisor_id == 3) 
		{
			supervisorName = "Barbara Jones";
		}
		else if (supervisor_id == 5)
		{
			supervisorName = "Karen Walter";
		}
		else if (supervisor_id == 6)
		{
			supervisorName = "Joe Smith";
		}
		else if (supervisor_id == 8)
		{
			supervisorName = "Henry Harris";
		}
		else if (supervisor_id == 10)
		{
			supervisorName = "Nick Jensen";
		}
		else if (supervisor_id == 16)
		{
			supervisorName = "Candice Owens";
		}
		else
		{
			supervisorName = "Unknown";
		}
		
		if (this.insurance == 0)
		{
			insuranceOption = "None";
		}
		else
		{
			insuranceOption = "Option #" + this.insurance;
		}
		
		
		System.out.println("Employee ID: " + this.employeeID + " Name: " + this.firstName 
							+ " " + this.lastName + " Age: " + this.age
							+ " Title: " + this.title + " Salary: $" + this.salary + " Status: " 
							+ this.status + " Supervisor: " + supervisorName + " Insurance: " + insuranceOption
							+ " Hire Date: " + this.hiredate + " Phone: " + this.phone);
	}
}
