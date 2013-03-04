package model;

/**
 * This class implements common information for all employees and specifies
 * behavior each employee type should incur.
 */
public abstract class AbstractEmployee
{
	protected String name;
	protected double salary;
	
	public AbstractEmployee()
	{
		this.name = "";
		this.salary = 0;
	}
	
	public AbstractEmployee(String name)
	{
		this.name = name;
		this.salary = 0;
	}
	
	/**
	 * Gets the name of the employee
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Gives the name of the employee type
	 */
	public abstract String getLevelName();
	
	/**
	 * Sets the employees salary
	 */
	public void setSalary(double s)
	{
		salary = s;
	}
	
	/**
	 * Gives the employees current salary
	 */
	public double getPay()
	{
		return salary;
	}
	
	/**
	 * Raises the employees salary. Implemented by the various employee types 
	 * containing the business logic
	 */
	public abstract void raiseSalary();
	
	public String toString()
	{
		String output = "";
		output += getLevelName();
		output += " employee " + name + " has salary " + salary;
		return output;
	}

}
